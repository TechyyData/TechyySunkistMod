package techyy.sunkistmod.registries;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import techyy.sunkistmod.Reference;
import techyy.sunkistmod.common.SKTab;
import techyy.sunkistmod.common.items.*;
import techyy.sunkistmod.handlers.RegistryHandler;

import java.rmi.registry.Registry;

/**
 * Created by fabbe on 23/12/2017 - 8:33 AM.
 */
public class ItemRegistry {
    public static final Item SUNKIST_SWORD = new ItemSunkistSword(Item.ToolMaterial.IRON).setRegistryName(Reference.MOD_ID, "sunkistsword").setUnlocalizedName(Reference.MOD_ID + ":sunkistsword").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_SUGAR = new ItemSunkistSugar().setRegistryName(Reference.MOD_ID, "sunkistsugar").setUnlocalizedName(Reference.MOD_ID + ":sunkistsugar").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_AXE = new ItemSunkistAxe(Item.ToolMaterial.IRON).setRegistryName(Reference.MOD_ID, "sunkistaxe").setUnlocalizedName(Reference.MOD_ID + ":sunkistaxe").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_PICKAXE = new ItemSunkistPickaxe(Item.ToolMaterial.IRON).setRegistryName(Reference.MOD_ID, "sunkistpickaxe").setUnlocalizedName(Reference.MOD_ID + ":sunkistpickaxe").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_HOE = new ItemSunkistHoe(Item.ToolMaterial.IRON).setRegistryName(Reference.MOD_ID, "sunkisthoe").setUnlocalizedName(Reference.MOD_ID + ":sunkisthoe").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_SHOVEL = new ItemSunkistShovel(Item.ToolMaterial.IRON).setRegistryName(Reference.MOD_ID, "sunkistshovel").setUnlocalizedName(Reference.MOD_ID + ":sunkistshovel").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_NUGGET = new ItemSunkistNugget().setRegistryName(Reference.MOD_ID, "sunkistnugget").setUnlocalizedName(Reference.MOD_ID + ":sunkistnugget").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_INSANE_SWORD = new ItemSunkistInsaneSword(ToolMaterialRegistry.INSTAKILL).setRegistryName(Reference.MOD_ID, "sunkistinsanesword").setUnlocalizedName(Reference.MOD_ID + ":sunkistinsanesword");
    public static final Item SUNKIST_SHEARS = new ItemSunkistShears().setRegistryName(Reference.MOD_ID, "sunkistshears").setUnlocalizedName(Reference.MOD_ID + ":sunkistshears").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_INGOT = new ItemSunkistIngot().setRegistryName(Reference.MOD_ID, "sunkistingot").setUnlocalizedName(Reference.MOD_ID + ":sunkistingot").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_FLINT_AND_STEEL = new ItemSunkistFlintAndSteel().setRegistryName(Reference.MOD_ID, "sunkistflintandsteel").setUnlocalizedName(Reference.MOD_ID + ":sunkistflintandsteel").setCreativeTab(SKTab.sunkistTab);
    public static final Item SUNKIST_EMERALD = new ItemSunkistEmerald().setRegistryName(Reference.MOD_ID, "sunkistemerald").setUnlocalizedName(Reference.MOD_ID + ":sunkistemerald").setCreativeTab(SKTab.sunkistTab);


    public static void init() {
        RegistryHandler.registerItem(SUNKIST_SWORD);
        RegistryHandler.registerItem(SUNKIST_SUGAR);
        RegistryHandler.registerItem(SUNKIST_AXE);
        RegistryHandler.registerItem(SUNKIST_PICKAXE);
        RegistryHandler.registerItem(SUNKIST_HOE);
        RegistryHandler.registerItem(SUNKIST_SHOVEL);
        RegistryHandler.registerItem(SUNKIST_NUGGET);
        RegistryHandler.registerItem(SUNKIST_INSANE_SWORD);
        RegistryHandler.registerItem(SUNKIST_SHEARS);
        RegistryHandler.registerItem(SUNKIST_INGOT);
        RegistryHandler.registerItem(SUNKIST_FLINT_AND_STEEL);
        RegistryHandler.registerItem(SUNKIST_EMERALD);
    }
}
