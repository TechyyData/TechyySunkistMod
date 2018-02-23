package techyy.sunkistmod.common.blocks;

import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

/**
 * Code Written by TechyyData on 2/1/18 7:46 PM
 */

public class BlockSunkistCraftingTable extends BlockWorkbench {
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            return true;
        } else
            playerIn.displayGui(new BlockSunkistCraftingTable.InterfaceCraftingTable(worldIn, pos));
            playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
            return true;

    }
}

