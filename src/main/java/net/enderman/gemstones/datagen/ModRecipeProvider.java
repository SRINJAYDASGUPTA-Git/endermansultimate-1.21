package net.enderman.gemstones.datagen;

import java.util.concurrent.CompletableFuture;

import java.util.List;

import net.enderman.gemstones.block.ModBlocks;
import net.enderman.gemstones.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

public class ModRecipeProvider extends FabricRecipeProvider{
    private static final List<ItemConvertible> RUBY_SMELTABLE = List.of(ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.ENDSTONE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.RUBY_ORE, ModItems.RAW_RUBY);

    private static final List<ItemConvertible> SAPPHIRE_SMELTABLE = List.of(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModBlocks.SAPPHIRE_ORE);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);

    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RUBY_SMELTABLE, RecipeCategory.MISC, ModItems.RUBY, 0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLE, RecipeCategory.MISC, ModItems.RUBY, 0.7f, 200, "ruby");
        offerSmelting(exporter, SAPPHIRE_SMELTABLE, RecipeCategory.MISC, ModItems.SAPPHIRE, 0.7f, 200, "sapphire");
        offerBlasting(exporter, SAPPHIRE_SMELTABLE, RecipeCategory.MISC, ModItems.SAPPHIRE, 0.7f, 200, "sapphire");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS, ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUBY, RecipeCategory.DECORATIONS, ModBlocks.RAW_RUBY_BLOCK);
    }
}
