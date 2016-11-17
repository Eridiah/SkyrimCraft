package net.skyrimcraft.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.skyrimcraft.mod.drinks.DrinkAltoWine;

public class ModDrinks {

	//Beverages
	public static Item altoWine;
	
	public static void init() {
		altoWine = new DrinkAltoWine();
	}
	
	public static void register() {
		GameRegistry.register(altoWine);
	}
	
	public static void registerRenders() {
		registerRender(altoWine);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
