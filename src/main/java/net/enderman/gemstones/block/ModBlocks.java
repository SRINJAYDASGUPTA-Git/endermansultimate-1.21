package net.enderman.gemstones.block;

import net.enderman.gemstones.EndermansGemstones;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

        public static final Block RUBY_BLOCK = registerBlock("ruby_block",
                        new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

        public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
                        new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));

        public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
                        new Block(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));

        public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
                        new Block(AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));

        public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
                        new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));

        private static Block registerBlock(String name, Block block) {
                registerBlockItem(name, block);
                return Registry.register(Registries.BLOCK, Identifier.of(EndermansGemstones.MOD_ID, name), block);
        }

        private static Item registerBlockItem(String name, Block block) {
                return Registry.register(Registries.ITEM, Identifier.of(EndermansGemstones.MOD_ID, name),
                                new BlockItem(block, new Item.Settings()));
        }

        public static void registerBlocks() {
                EndermansGemstones.LOGGER.info("Registering Mod Blocks for " + EndermansGemstones.MOD_ID);
        }
}
