package net.toryx.witcherslegacy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.toryx.witcherslegacy.WitchersLegacy;

public class ModItemGroups {
    public static final ItemGroup ALCOHEST_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WitchersLegacy.MOD_ID, "alcohest"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.alcohest"))
                .icon(() -> new ItemStack(ModItems.ALCOHEST)).entries((displayContext, entries) -> {
                //PUT ITEMS IN ITEM GROUPS HERE
                    entries.add(ModItems.ALCOHEST);
                    entries.add(ModItems.ALCOHEST2);
                    entries.add(ModItems.BLOODDUST);
                    entries.add(ModItems.BRAIN);
                    entries.add(ModItems.CELANDINE);
                    entries.add(ModItems.MOONDUST);

                }).build());

    public static void registerItemGroups() {
        WitchersLegacy.LOGGER.info("Registering Item Groups for " + WitchersLegacy.MOD_ID);
    }
}
