package net.toryx.witcherslegacy.sounds;

import net.minecraft.registry.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import net.toryx.witcherslegacy.WitchersLegacy;

public class WitchersLegacySoundManager {
        public static final SoundEvent BLOODLOSS = registerSoundEvent("wl_bloodloss");
        public static final SoundEvent POTION = registerSoundEvent("wl_potion");

        private static SoundEvent registerSoundEvent(String name) {
            Identifier id = new Identifier(WitchersLegacy.MOD_ID, name);
            return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
        }
        
        public static void registerSounds() {
            WitchersLegacy.LOGGER.info(WitchersLegacy.NAME + " has registered its sounds.");
        }
    }
