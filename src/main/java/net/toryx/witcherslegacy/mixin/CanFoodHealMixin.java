package net.toryx.witcherslegacy.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;

import net.minecraft.entity.player.PlayerEntity;

import net.toryx.witcherslegacy.WitchersLegacy;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

/**
 * Oh hey a convenient spot for a javadoc! <br>
 * So, this file basically makes it so that the player cannot heal if they have the bleeding effect. <br>
 * Ok bye - Mavity
 */
@Mixin(PlayerEntity.class)
public abstract class CanFoodHealMixin {
    @ModifyReturnValue(method = "canFoodHeal", at = @At(value = "RETURN"))
    private boolean replace_method(boolean original) {
        return original && !((PlayerEntity)(Object)this).hasStatusEffect(WitchersLegacy.BLEED);
    }
}
