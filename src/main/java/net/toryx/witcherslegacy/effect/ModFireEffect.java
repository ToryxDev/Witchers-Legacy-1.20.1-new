package net.toryx.witcherslegacy.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Random;

public class ModFireEffect extends StatusEffect{
    private static final Random random = new Random();
    private static final int DAMAGE_INTERVAL = 20 * 7; // Damage every 5 seconds (20 ticks per second)

    public ModFireEffect() {
        super(StatusEffectCategory.HARMFUL, 0xFF961C); // Color in RGB
    }

    @Override
    public boolean canApplyUpdateEffect(int amplifier, int duration) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            float extraDamage = (float) (random.nextInt(2, 4) + 1);
            if (entity.hasStatusEffect(ModFireEffect.this) && entity.hurtTime >= 8) {
                //entity.damage(entity.getDamageSources().onFire(), extraDamage);
            }

            // Random damage check
            if (entity.getEntityWorld().getTime() % DAMAGE_INTERVAL == 0) {
                entity.damage(entity.getDamageSources().onFire(), 1.0f);
            }
        }
    }
}
