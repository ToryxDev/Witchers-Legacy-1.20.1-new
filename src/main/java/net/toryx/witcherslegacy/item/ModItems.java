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

public class ModItems {
    public static final Item ALCOHEST = registerItem("alcohest", new Item(new FabricItemSettings()));
    public static final Item ALCOHEST2 = registerItem("alcohest2", new Item(new FabricItemSettings()));
    public static final Item BLOODDUST = registerItem("blooddust", new Item(new FabricItemSettings()));
    public static final Item CELANDINE = registerItem("celandine", new Item(new FabricItemSettings()));
    public static final Item BRAIN = registerItem("brain", new Item(new FabricItemSettings()));
    public static final Item MOONDUST = registerItem("moondust", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.addAfter(Items.GLASS_BOTTLE, ALCOHEST2);
        entries.addAfter(Items.GLASS_BOTTLE, ALCOHEST);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WitchersLegacy.MOD_ID, name), item);
    }
    public static void registerModItems() {
        WitchersLegacy.LOGGER.info("Registering Mod Items for" + WitchersLegacy.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
