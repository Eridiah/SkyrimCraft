package net.skyrimcraft.mod.foods;

import net.minecraft.item.ItemFood;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class FoodSweetRoll extends ItemFood {

	public FoodSweetRoll() {
		super(4, 0.5F, false); //Parameters are the different Food values
		setCreativeTab(SkyrimCraft.CREATIVE_TAB);
		setUnlocalizedName(Reference.SCFoods.SWEET_ROLL.getUnlocalizedName());
		setRegistryName(Reference.SCFoods.SWEET_ROLL.getRegistryName());
	}

}
