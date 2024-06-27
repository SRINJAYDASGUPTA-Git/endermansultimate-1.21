package net.enderman.gemstones.item;

import net.enderman.gemstones.EndermansGemstones;
import net.enderman.gemstones.item.custom.ValuableDetectorItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VALUABLE_DETECTOR = registerItem("valuable_detector",
            new ValuableDetectorItem(new Item.Settings().maxDamage(64).maxCount(1)));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));

    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
//    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY, 2.0f, 2.0f))));
//    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterial.RUBY,3.0f, 2.0f))));
//    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterial.RUBY, 0f, 0f))));
//    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterial.RUBY, 0.0f, 0.0f))));
//    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterial.RUBY, 5, 2.0f))));

    public static final Item ALEXANDRITE = registerItem("alexandrite", new Item(new Item.Settings()));




    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(SAPPHIRE);


        entries.add(ALEXANDRITE);
//


    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EndermansGemstones.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EndermansGemstones.LOGGER.info("Registering Mod Items for " + EndermansGemstones.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

}
