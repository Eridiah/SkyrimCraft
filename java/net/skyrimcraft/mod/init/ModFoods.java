package net.skyrimcraft.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.skyrimcraft.mod.foods.FoodAppleCabbageStew;
import net.skyrimcraft.mod.foods.FoodCabbage;
import net.skyrimcraft.mod.foods.FoodCheese;
import net.skyrimcraft.mod.foods.FoodGreenApple;
import net.skyrimcraft.mod.foods.FoodLeek;
import net.skyrimcraft.mod.foods.FoodSweetRoll;
import net.skyrimcraft.mod.foods.FoodTomato;

public class ModFoods {
	
	//Default Foods
	public static Item sweetRoll;
	public static Item greenApple;
	public static Item tomato;
	public static Item cabbage;
	public static Item cheese;
	public static Item leek;
	
	//Craftable Foods
	public static Item appleCabbageStew;
	
	
	public static void init() {
		//Default Foods
		sweetRoll = new FoodSweetRoll();
		greenApple = new FoodGreenApple();
		tomato = new FoodTomato();
		cabbage = new FoodCabbage();
		cheese = new FoodCheese();
		leek = new FoodLeek();
		
		//Craftable Foods
		appleCabbageStew = new FoodAppleCabbageStew();
	}
	
	public static void register() {
		//Default Foods
		GameRegistry.register(sweetRoll);
		GameRegistry.register(greenApple);
		GameRegistry.register(tomato);
		GameRegistry.register(cabbage);
		GameRegistry.register(cheese);
		GameRegistry.register(leek);
		
		//Craftable Foods
		GameRegistry.register(appleCabbageStew);
	}

	public static void registerRenders() {
		//Default Foods
		registerRender(sweetRoll);
		registerRender(greenApple);
		registerRender(tomato);
		registerRender(cabbage);
		registerRender(cheese);
		registerRender(leek);
		
		//Craftable Foods
		registerRender(appleCabbageStew);
	}
	
	/*
	 * Allows Minecraft to find the location of the Renderer so that it will show up properly in game
	 */
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
