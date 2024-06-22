package net.enderman.gemstones.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class ValuableDetectorItem extends Item {
    public ValuableDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        


        return ActionResult.SUCCESS;
    }
}
