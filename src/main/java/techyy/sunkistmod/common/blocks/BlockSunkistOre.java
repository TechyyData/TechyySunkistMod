package techyy.sunkistmod.common.blocks;

import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import techyy.sunkistmod.registries.ItemRegistry;

import java.util.Random;

public class BlockSunkistOre extends BlockOre {

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemRegistry.SUNKIST_INGOT;
    }
}
