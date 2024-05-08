package net.toryx.witcherslegacy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.*;

import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import net.toryx.witcherslegacy.WitchersLegacy;
import net.toryx.witcherslegacy.item.custom.WitcherMedallion;

public class ModItems {
    public static final Item ALCOHEST = registerItem("alcohest", new Item(new FabricItemSettings()));
    public static final Item DWARVEN_SPIRIT = registerItem("dwarven_spirit", new Item(new FabricItemSettings()));
    public static final Item BLOOD_DUST = registerItem("blood_dust", new Item(new FabricItemSettings()));
    public static final Item CELANDINE = registerItem("celandine", new Item(new FabricItemSettings()));
    public static final Item UNDEAD_BRAIN = registerItem("undead_brain", new Item(new FabricItemSettings()));
    public static final Item MOON_DUST = registerItem("moon_dust", new Item(new FabricItemSettings()));
    public static final Item WITCHER_MEDALLION = registerItem("witcher_medallion", new WitcherMedallion(new FabricItemSettings()));

    //ADD ITEMS TO EXISTING TAB - Why is this commented out?
    /*private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(DWARVEN_SPIRIT);
        entries.add(ALCOHEST);
    }*/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WitchersLegacy.MOD_ID, name), item);
    }
    public static void registerModItems() {
        WitchersLegacy.LOGGER.info(WitchersLegacy.NAME + " has registered its items.");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
    }
}
