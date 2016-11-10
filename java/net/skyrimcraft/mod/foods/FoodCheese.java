package net.skyrimcraft.mod.foods;

import net.minecraft.item.ItemFood;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class FoodCheese extends ItemFood {

	public FoodCheese() {
		super(4, 0.5F, false);
		setCreativeTab(SkyrimCraft.FOOD_TAB);
		setUnlocalizedName(Reference.SCFoods.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.SCFoods.CHEESE.getRegistryName());
	}

}
