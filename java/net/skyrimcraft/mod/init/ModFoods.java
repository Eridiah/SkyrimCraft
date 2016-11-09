package net.skyrimcraft.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.skyrimcraft.mod.foods.FoodSweetRoll;

public class ModFoods {
	
	//Foods
	public static Item sweetRoll;
	
	public static void init() {
		sweetRoll = new FoodSweetRoll();
	}
	
	public static void register() {
		GameRegistry.register(sweetRoll);
	}

	public static void registerRenders() {
		registerRender(sweetRoll);
	}
	
	/*
	 * Allows Minecraft to find the location of the Renderer so that it will show up properly in game
	 */
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
