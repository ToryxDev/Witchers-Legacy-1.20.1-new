package net.toryx.witcherslegacy.mixin;

import net.minecraft.entity.player.*;

import net.toryx.witcherslegacy.WitchersLegacy;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(HungerManager.class)
public class HungerManagerMixin {
    @Inject(at = @At("HEAD"), method = "update")
    private void override_method(PlayerEntity player, CallbackInfo info) {
        if(player.hasStatusEffect(WitchersLegacy.BLEED)) {
            player.heal(5.0f);
        }
    }
}