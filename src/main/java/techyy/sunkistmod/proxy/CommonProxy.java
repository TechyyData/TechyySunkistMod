package techyy.sunkistmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import techyy.sunkistmod.ore.OreGeneration;
import techyy.sunkistmod.registries.BlockRegistry;
import techyy.sunkistmod.registries.ItemRegistry;
import techyy.sunkistmod.registries.OregenRegistry;
import techyy.sunkistmod.registries.ToolMaterialRegistry;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ToolMaterialRegistry.init();
        BlockRegistry.init();
        ItemRegistry.init();
    }

    public void init(FMLInitializationEvent event) {
        OregenRegistry.init();

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
