package net.toryx.witcherslegacy.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.toryx.witcherslegacy.WitchersLegacy;

public class WL_SoundManager {
        public static final SoundEvent WL_BLOODLOSS = registerSoundEvent("wl_bloodloss");
        public static final SoundEvent WL_POTION = registerSoundEvent("wl_potion");

        private static SoundEvent registerSoundEvent(String name) {
            Identifier id = new Identifier(WitchersLegacy.MOD_ID, name);
            return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
        }
        
        public static void registerSounds() {
            WitchersLegacy.LOGGER.info(WitchersLegacy.NAME + " has registered its sounds.");
        }
    }
