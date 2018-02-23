package techyy.sunkistmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import techyy.sunkistmod.handlers.ConfigurationHandler;
import techyy.sunkistmod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class SunkistMod {
	private static Logger logger;

	@Instance
	public static SunkistMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();

		logger.info("Pre Init");

		ConfigurationHandler.load(event.getSuggestedConfigurationFile());
		MinecraftForge.EVENT_BUS.register(new ConfigurationHandler());

		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("Init");
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("Post Init");
		proxy.postInit(event);
	}

	public static Logger getLogger() {
		return logger;
	}
}
