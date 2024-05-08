package net.toryx.witcherslegacy;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import net.toryx.witcherslegacy.block.ModBlocks;
import net.toryx.witcherslegacy.config.WitchersLegacyConfig;
import net.toryx.witcherslegacy.effect.*;
import net.toryx.witcherslegacy.item.*;
import net.toryx.witcherslegacy.itemgroup.ModItemGroups;
import net.toryx.witcherslegacy.sounds.WitchersLegacySoundManager;

import org.slf4j.*;

public class WitchersLegacy implements ModInitializer {
	
	public static final String MOD_ID = "witcherslegacy";
	
	public static final String NAME = "Witcher's Legacy";
  
	public static final StatusEffect BLEED = new ModBleedEffect();
	public static final StatusEffect INCINERATE = new ModFireEffect();

	// Erm... GitHub... are you dying trying to indent this line properly??
  	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	
	@Override
	public void onInitialize() {
		// Initialize classes
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		WitchersLegacySoundManager.registerSounds();

		// Config
		MidnightConfig.init(WitchersLegacy.MOD_ID, WitchersLegacyConfig.class);

		// Register effects
		Registry.register(Registries.STATUS_EFFECT, new Identifier("witcherslegacy", "bleed"), BLEED);
		Registry.register(Registries.STATUS_EFFECT, new Identifier("witcherslegacy", "incinerate"), INCINERATE);
	}
}
