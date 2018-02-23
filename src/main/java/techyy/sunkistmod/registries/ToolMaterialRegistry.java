package techyy.sunkistmod.registries;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Here you create a custom ToolMaterial for you're tool. Look at how the INSTAKILL was created for a guide how to do it.
 */

public class ToolMaterialRegistry {
	public static Item.ToolMaterial INSTAKILL;

	
	
	public static void init() {
		INSTAKILL = EnumHelper.addToolMaterial("instakill", 3, 99999, 100, 9996, 30);
	}

}
