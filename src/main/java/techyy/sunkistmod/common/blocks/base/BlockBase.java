package techyy.sunkistmod.common.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import techyy.sunkistmod.Reference;

/**
 * Created by fabbe on 23/12/2017 - 8:57 AM.
 */
public class BlockBase extends Block {
    public BlockBase(Material blockMaterialIn, MapColor blockMapColorIn, String name) {
        super(blockMaterialIn, blockMapColorIn);
        setName(name);
    }

    private void setName(String name) {
        this.setRegistryName(Reference.MOD_ID, name);
        this.setUnlocalizedName(Reference.MOD_ID + ":" + name);
    }
}
