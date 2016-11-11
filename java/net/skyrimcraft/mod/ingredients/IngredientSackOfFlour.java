package net.skyrimcraft.mod.ingredients;

import net.minecraft.item.Item;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class IngredientSackOfFlour extends Item {

	public IngredientSackOfFlour() {
		
		setCreativeTab(SkyrimCraft.FOOD_TAB);
		setUnlocalizedName(Reference.SCIngredients.SACK_OF_FLOUR.getUnlocalizedName());
		setRegistryName(Reference.SCIngredients.SACK_OF_FLOUR.getRegistryName());
		
	}
	
}
