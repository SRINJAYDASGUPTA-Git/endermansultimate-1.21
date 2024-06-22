package net.enderman.gemstones.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class ValuableDetectorItem extends Item {
    public ValuableDetectorItem(Settings settings) {
        super(settings);
    }

    @SuppressWarnings("resource")
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        
        if(!context.getWorld().isClient){
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;
            for(int i = 0; i <= positionClicked.getY()+64; i++){
                BlockState blockState = context.getWorld().getBlockState(positionClicked.down(i));

                if(isValuableBlock(blockState)){
                    player.sendMessage(Text.literal("Found "+ blockState.getBlock().asItem().getName().getString()+" at " + positionClicked.down(i).getX() + ", " + positionClicked.down(i).getY() + ", " + positionClicked.down(i).getZ()), false);
                    foundBlock = true;
                    break;
                }
            }

            if(!foundBlock){
                player.sendMessage(Text.literal("No valuable blocks found"), false);
            }
        }
        context.getStack().damage(1, (LivingEntity) context.getPlayer(), context.getPlayer().getPreferredEquipmentSlot(getDefaultStack()));
        
        return ActionResult.SUCCESS;
    }

    private boolean isValuableBlock(BlockState blockState) {
        return blockState.isOf(Blocks.IRON_ORE) || blockState.isOf(Blocks.GOLD_ORE) || blockState.isOf(Blocks.DIAMOND_ORE) || blockState.isOf(Blocks.EMERALD_ORE) || blockState.isOf(Blocks.LAPIS_ORE) || blockState.isOf(Blocks.REDSTONE_ORE) || blockState.isOf(Blocks.NETHER_QUARTZ_ORE) || blockState.isOf(Blocks.ANCIENT_DEBRIS);
    }
}
