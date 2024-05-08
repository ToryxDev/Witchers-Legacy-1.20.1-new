package net.toryx.witcherslegacy.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

import net.toryx.witcherslegacy.WitchersLegacy;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

/**
 * Oh hey a convenient spot for a javadoc! <br>
 * If the player is bleeding, they'll take extra damage with any damage taken. <br>
 * Ok bye - Mavity
 */
@Mixin(LivingEntity.class)
public class onDamagedMixin {
    private static Random random = new Random();
    @Inject(at = @At("HEAD"), method = "onDamaged")
    private void override_method(DamageSource damageSource, CallbackInfo callbackInfo) {
        float extraDamage = (float) (random.nextInt(0, 2) + 0.5);
        if(((LivingEntity)(Object)this).hasStatusEffect(WitchersLegacy.BLEED)) {
            ((LivingEntity)(Object)this).damage(((LivingEntity)(Object)this).getDamageSources().magic(), extraDamage);
        }
    }
}
