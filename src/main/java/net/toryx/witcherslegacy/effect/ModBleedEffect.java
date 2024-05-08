package net.toryx.witcherslegacy.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Random;

public class ModBleedEffect extends StatusEffect{
    private static final Random random = new Random();

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
            float extraDamage = (float) (random.nextInt(2, 4) + 1);
            if (entity.hasStatusEffect(ModBleedEffect.this) && entity.hurtTime >= 8) {
                entity.damage(entity.getDamageSources().magic(), extraDamage);
            }
        }
    }
}
