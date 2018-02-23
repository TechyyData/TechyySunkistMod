package techyy.sunkistmod.registries;

import akka.actor.OriginalRestartException;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;
import techyy.sunkistmod.Reference;
import techyy.sunkistmod.common.SKTab;
import techyy.sunkistmod.common.blocks.*;
import techyy.sunkistmod.handlers.RegistryHandler;

/**
 * Created by fabbe on 23/12/2017 - 8:31 AM.
 */
public class BlockRegistry {
	public static final Block SUNKIST_LOGO_BLOCK = new BlockSunkistLogoBlock(Material.ROCK).setRegistryName(Reference.MOD_ID, "sunkistlogoblock").setUnlocalizedName(Reference.MOD_ID + ":sunkistlogoblock").setCreativeTab(SKTab.sunkistTab);
	public static final Block SUNKIST_SUGAR_BLOCK = new BlockSunkistSugarBlock(Material.GRASS).setRegistryName(Reference.MOD_ID, "sunkistsugarblock").setUnlocalizedName(Reference.MOD_ID + ":sunkistsugarblock").setCreativeTab(SKTab.sunkistTab);
	public static final Block SUNKIST_WORKBENCH = new BlockSunkistCraftingTable().setRegistryName(Reference.MOD_ID, "sunkistworkbench").setUnlocalizedName(Reference.MOD_ID + ":sunkistworkbench").setCreativeTab(SKTab.sunkistTab);
	public static final Block SUNKIST_ORE = new BlockSunkistOre().setRegistryName(Reference.MOD_ID, "sunkistore").setUnlocalizedName(Reference.MOD_ID + ":sunkistore").setCreativeTab(SKTab.sunkistTab);


    public static void init() {
        RegistryHandler.registerBlock(SUNKIST_LOGO_BLOCK);
        RegistryHandler.registerBlock(SUNKIST_SUGAR_BLOCK);
        RegistryHandler.registerBlock(SUNKIST_WORKBENCH);
        RegistryHandler.registerBlock(SUNKIST_ORE);
    }
}
