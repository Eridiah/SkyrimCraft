package net.skyrimcraft.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.skyrimcraft.mod.ingredients.IngredientSaltPile;

public class ModIngredients {
	
	//Ingredients
	public static Item saltPile;

	public static void init() {
		saltPile = new IngredientSaltPile();
	}
	
	public static void register() {
		GameRegistry.register(saltPile);
	}
	
	public static void registerRenders() {
		registerRender(saltPile);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
