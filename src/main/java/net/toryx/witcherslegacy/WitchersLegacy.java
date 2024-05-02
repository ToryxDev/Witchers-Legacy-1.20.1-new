package net.toryx.witcherslegacy;

import net.fabricmc.api.ModInitializer;

import net.toryx.witcherslegacy.item.ModItemGroups;
import net.toryx.witcherslegacy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitchersLegacy implements ModInitializer {
	public static final String MOD_ID = "witcherslegacy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}