package net.toryx.witcherslegacy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.toryx.witcherslegacy.WitchersLegacy;
import net.toryx.witcherslegacy.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ALCOHEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WitchersLegacy.MOD_ID, "alcohest"),
            FabricItemGroup.builder().displayName(Text.translatable("witcherslegacy.itemgroup.alcohest"))
                .icon(() -> new ItemStack(ModItems.ALCOHEST)).entries((displayContext, entries) -> {
                    //PUT ITEMS IN ITEM GROUPS HERE
                    entries.add(ModItems.ALCOHEST);
                    entries.add(ModItems.DWARVEN_SPIRIT);
                    entries.add(ModItems.BLOOD_DUST);
                    entries.add(ModItems.UNDEAD_BRAIN);
                    entries.add(ModItems.CELANDINE);
                    entries.add(ModItems.MOON_DUST);
                    entries.add(ModItems.WITCHER_MEDALLION);

                    //PUT BLOCKS IN ITEM GROUPS HERE
                    entries.add(ModBlocks.DIMERITIUM_BLOCK);
                    entries.add(ModBlocks.RAW_DIMERITIUM_BLOCK);

                }).build());

    public static void registerItemGroups() {
        WitchersLegacy.LOGGER.info(WitchersLegacy.NAME + " has registered its itemgroups.");
    }
}
