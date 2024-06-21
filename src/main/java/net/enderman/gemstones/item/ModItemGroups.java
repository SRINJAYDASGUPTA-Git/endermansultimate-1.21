package net.enderman.gemstones.item;

import net.enderman.gemstones.EndermansGemstones;
import net.enderman.gemstones.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GEMSTONE_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(EndermansGemstones.MOD_ID, "gemstone"),
            FabricItemGroup.
                    builder().
                    displayName(Text.translatable("itemgroup.gemstone"))
                    .icon(()->new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        //Items
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.ALEXANDRITE);

                        //Blocks
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.ENDSTONE_RUBY_ORE);


            }).build());
    public static void registerItemGroups() {
        EndermansGemstones.LOGGER.info("Registering Mod ItemGroups");

    }
}
