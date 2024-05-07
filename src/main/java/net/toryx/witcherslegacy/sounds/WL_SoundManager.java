package net.toryx.witcherslegacy.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.toryx.witcherslegacy.WitchersLegacy;

public class WL_SoundManager {
        private WL_SoundManager() {
            // private empty constructor to avoid accidental instantiation
        }

        // ITEM_METAL_WHISTLE is the name of the custom sound event
        // and is called in the mod to use the custom sound
        public static final SoundEvent WL_BLOODLOSS = registerSoundEvent("wl_bloodloss");
        public static final SoundEvent WL_POTION = registerSoundEvent("wl_potion");

        // actual registration of all the custom SoundEvents
        private static SoundEvent registerSoundEvent(String name) {
            Identifier id = new Identifier(WitchersLegacy.MOD_ID, name);
            return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
        }

        // This static method starts class initialization, which then initializes
        // the static class variables (e.g. ITEM_METAL_WHISTLE).
        public static void registerSounds() {
            WitchersLegacy.LOGGER.info("Registering Sounds for " + WitchersLegacy.MOD_ID);
        }
    }