package net.toryx.witcherslegacy.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import net.toryx.witcherslegacy.WitchersLegacy;

public class ModBlocks {
    
    public static final Block DIMERITIUM_BLOCK = registerBlock("dimeritium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    
    public static final Block RAW_DIMERITIUM_BLOCK = registerBlock("raw_dimeritium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WitchersLegacy.MOD_ID, name), block);
    }
    
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(WitchersLegacy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        WitchersLegacy.LOGGER.info(WitchersLegacy.NAME + " has registered its blocks.");
    }
}
