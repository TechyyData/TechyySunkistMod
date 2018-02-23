package techyy.sunkistmod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import techyy.sunkistmod.Reference;
import techyy.sunkistmod.registries.ItemRegistry;

/**
 * Created by fabbe on 23/12/2017 - 8:40 AM.
 */
public class SKTab {
    public static CreativeTabs sunkistTab = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemRegistry.SUNKIST_INGOT);
        }
    };
}
