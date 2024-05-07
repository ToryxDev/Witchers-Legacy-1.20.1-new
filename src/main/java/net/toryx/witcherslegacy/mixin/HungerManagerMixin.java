package net.toryx.witcherslegacy.mixin;

import net.minecraft.entity.player.*;

import net.minecraft.world.Difficulty;
import net.toryx.witcherslegacy.WitchersLegacy;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

/**
 * Oh hey a convenient spot for a javadoc
 * So, this file basically makes it so that the player will still lose food bars even if they have the custom effect
 * Ok bye - Mavity
 */
@Mixin(HungerManager.class)
public abstract class HungerManagerMixin {
    @Inject(at = @At("HEAD"), method = "update")
    private void override_method(PlayerEntity player, CallbackInfo info) {
        if(player.hasStatusEffect(WitchersLegacy.BLEED)) {
            /*((HungerManager)(Object)this).prevFoodLevel() = ((HungerManager)(Object)this).foodLevel();
            if (this.exhaustion > 4.0f) {
                this.exhaustion -= 4.0f;
                if (this.saturationLevel > 0.0f) {
                    this.saturationLevel = Math.max(this.saturationLevel - 1.0f, 0.0f);
                } else if (difficulty != Difficulty.PEACEFUL) {
                    this.foodLevel = Math.max(this.foodLevel - 1, 0);
                }
            }*/
        }
    }
}