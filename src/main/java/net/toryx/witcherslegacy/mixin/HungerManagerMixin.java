package net.toryx.witcherslegacy.mixin;

import net.minecraft.entity.player.*;

import net.toryx.witcherslegacy.WitchersLegacy;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Oh hey a convenient spot for a javadoc! <br>
 * Just no. AAAAAA MY BRAINCELLS!!! <br>
 * Ok bye - Mavity
 */
@Mixin(HungerManager.class)
public abstract class HungerManagerMixin {
    @Inject(at = @At("HEAD"), method = "update")
    private void override_method(PlayerEntity player, CallbackInfo info) {
        if(player.hasStatusEffect(WitchersLegacy.BLEED)) {
            // Not required - YOU DIDN'T ACTUALLY TEST IT PROPERLY CIN!!!
        }
    }
}
