package techyy.sunkistmod.handlers;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import techyy.sunkistmod.Reference;

import java.io.File;

/**
 * Created by fabbe on 23/12/2017 - 9:07 AM.
 */
public class ConfigurationHandler {
    private static final String CATEGORY_GENERAL = "general";
    private static boolean debugConfig = false;

    private static Configuration config;

    public static void load(File file) {
        config = new Configuration(file);
        init();
    }

    private static void init() {
        debugConfig = config.get(CATEGORY_GENERAL, "debugConfig", false, "Just a debug value, it does nothing.").getBoolean();

        config.save();
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(Reference.MOD_ID)) {
            init();
        }
    }
}
