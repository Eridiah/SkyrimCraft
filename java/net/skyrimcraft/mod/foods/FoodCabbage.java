package net.skyrimcraft.mod.foods;

import net.minecraft.item.ItemFood;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class FoodCabbage extends ItemFood {

	public FoodCabbage() {
		super(4, 0.5F, false);
		setCreativeTab(SkyrimCraft.FOOD_TAB);
		setUnlocalizedName(Reference.SCFoods.CABBAGE.getUnlocalizedName());
		setRegistryName(Reference.SCFoods.CABBAGE.getRegistryName());
	}

}
