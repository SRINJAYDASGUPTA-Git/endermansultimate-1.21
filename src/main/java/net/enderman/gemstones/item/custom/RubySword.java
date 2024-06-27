package net.enderman.gemstones.item.custom;

import net.enderman.gemstones.item.materials.RubyToolMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RubySword extends SwordItem {
    public RubySword(ToolMaterial toolMaterial) {
        super(toolMaterial, getItemSettings());
    }

    private static Settings getItemSettings() {
        return (new Settings()).attributeModifiers(SwordItem.createAttributeModifiers(RubyToolMaterial.INSTANCE, 1, -1.4F));
    }
}
