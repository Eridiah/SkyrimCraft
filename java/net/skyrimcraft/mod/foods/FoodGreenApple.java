package net.skyrimcraft.mod.foods;

import net.minecraft.item.ItemFood;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class FoodGreenApple extends ItemFood {

	public FoodGreenApple() {
		super(4, 0.5F, false);
		setCreativeTab(SkyrimCraft.CREATIVE_TAB);
		setUnlocalizedName(Reference.SCFoods.GREEN_APPLE.getUnlocalizedName());
		setRegistryName(Reference.SCFoods.GREEN_APPLE.getRegistryName());
	}

}
