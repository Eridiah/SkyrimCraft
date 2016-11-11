package net.skyrimcraft.mod.proxy;

import net.skyrimcraft.mod.init.ModBlocks;
import net.skyrimcraft.mod.init.ModFoods;
import net.skyrimcraft.mod.init.ModIngredients;
import net.skyrimcraft.mod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModIngredients.registerRenders();
		ModFoods.registerRenders();
		ModBlocks.registerRenders();
	}
	
}
