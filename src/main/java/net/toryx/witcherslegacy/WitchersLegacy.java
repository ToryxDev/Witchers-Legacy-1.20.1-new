package net.toryx.witcherslegacy;

import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.toryx.witcherslegacy.block.ModBlocks;
import net.toryx.witcherslegacy.effect.ModBleedEffect;
import net.toryx.witcherslegacy.item.ModItemGroups;
import net.toryx.witcherslegacy.item.ModItems;
import net.toryx.witcherslegacy.sounds.WL_SoundManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WitchersLegacy implements ModInitializer {
	
	public static final String MOD_ID = "witcherslegacy";
	
	public static final String NAME = "Witcher's Legacy";
	
 public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
	
	public static final StatusEffect BLEED = new ModBleedEffect();
	
	@Override
	public void onInitialize() {
		// Initialize classes
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		WL_SoundManager.registerSounds();

		// Register effects
		Registry.register(Registries.STATUS_EFFECT, new Identifier("witcherslegacy", "bleed"), BLEED);
	}
}
