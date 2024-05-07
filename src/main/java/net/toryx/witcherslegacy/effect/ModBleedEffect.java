package net.toryx.witcherslegacy.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Random;

public class ModBleedEffect extends StatusEffect {
    int NaturalRegenRate;
    private static final Random random = new Random();
    private static final int DAMAGE_INTERVAL = 20 * 2; // Damage every 5 seconds (20 ticks per second)
    static final float DAMAGE_CHANCE = 0.5f;

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
                NaturalRegenRate = 0;
                entity.damage(entity.getDamageSources().magic(), extraDamage);
                System.out.println("bababooie" + extraDamage);
            }


            // Random damage check
            if (entity.getEntityWorld().getTime() % DAMAGE_INTERVAL == 0 && random.nextFloat() < DAMAGE_CHANCE) {
                //entity.damage(entity.getDamageSources().magic(), 1.0f);
                System.out.println("Player damaged by bleed effect.");
            }
        }
    }


}
