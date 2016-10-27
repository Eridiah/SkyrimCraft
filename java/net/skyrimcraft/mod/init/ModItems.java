package net.skyrimcraft.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.skyrimcraft.mod.items.ItemHelgenKeepKey;

public class ModItems {

	public static Item helgenKeepKey;
	
	public static void init() {
		helgenKeepKey = new ItemHelgenKeepKey();
	}
	
	public static void register() {
		GameRegistry.register(helgenKeepKey);
	}
	
	public static void registerRenders() {
		registerRender(helgenKeepKey);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
