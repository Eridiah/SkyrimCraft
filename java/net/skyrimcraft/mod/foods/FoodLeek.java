package net.skyrimcraft.mod.foods;

import net.minecraft.item.ItemFood;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class FoodLeek extends ItemFood {

	public FoodLeek() {
		super(4, 0.5F, false);
		setCreativeTab(SkyrimCraft.FOOD_TAB);
		setUnlocalizedName(Reference.SCFoods.LEEK.getUnlocalizedName());
		setRegistryName(Reference.SCFoods.LEEK.getRegistryName());
	}
	
}
