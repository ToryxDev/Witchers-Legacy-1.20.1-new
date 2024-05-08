package net.toryx.witcherslegacy.mixin;

import net.minecraft.entity.player.*;

import net.toryx.witcherslegacy.WitchersLegacy;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

//TODO: Fix code to use the this.prevFoodLevel() and this.foodLevel() etc, or find a better way to do it.
/**
 * Oh hey a convenient spot for a javadoc! <br>
 * So, this file should make it so that the player will still lose hunger even if they have the bleeding effect. <br>
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
