package techyy.sunkistmod.common.items.base;

import net.minecraft.item.Item;
import techyy.sunkistmod.Reference;

/**
 * Created by fabbe on 23/12/2017 - 8:59 AM.
 */
public class ItemBase extends Item {
    public ItemBase(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.setRegistryName(Reference.MOD_ID, name);
        this.setUnlocalizedName(Reference.MOD_ID + ":" + name);
    }
}
