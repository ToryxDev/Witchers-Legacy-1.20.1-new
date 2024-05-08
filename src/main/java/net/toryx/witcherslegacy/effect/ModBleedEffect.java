package net.toryx.witcherslegacy.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.PlayerEntity;

import net.toryx.witcherslegacy.WitchersLegacy;

import java.util.Random;

public class ModBleedEffect extends StatusEffect{

    private static int tt = 160;

    // NEVER. MAKE. RANDOM. FINAL.
    private static Random random = new Random();

    public ModBleedEffect() {
        super(StatusEffectCategory.HARMFUL, 0xeb4c42); // Color in RGB
    }

    @Override
    public boolean canApplyUpdateEffect(int amplifier, int duration) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            float extraDamage = (float) (random.nextInt(1, 3) + 0.5);
            if (entity.hasStatusEffect(WitchersLegacy.BLEED) && tt == 180) {
                tt = 0;
                entity.damage(entity.getDamageSources().magic(), extraDamage);
            } else {
                tt++;
            }
        }
    }
}
