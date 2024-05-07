package net.toryx.witcherslegacy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
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

    //ADD ITEMS TO EXISTING TAB
    //private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
    //    entries.add(DWARVEN_SPIRIT);
    //    entries.add(ALCOHEST);
    //}

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
