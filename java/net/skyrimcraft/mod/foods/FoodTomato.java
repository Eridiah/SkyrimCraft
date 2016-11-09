package net.skyrimcraft.mod.foods;

import net.minecraft.item.ItemFood;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class FoodTomato extends ItemFood {

	public FoodTomato() {
		super(4, 0.5F, false);
		setCreativeTab(SkyrimCraft.CREATIVE_TAB);
		setUnlocalizedName(Reference.SCFoods.TOMATO.getUnlocalizedName());
		setRegistryName(Reference.SCFoods.TOMATO.getRegistryName());
	}

}
