package net.skyrimcraft.mod.ingredients;

import net.minecraft.item.Item;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class IngredientSaltPile extends Item {

	public IngredientSaltPile() {
	
		setCreativeTab(SkyrimCraft.FOOD_TAB);
		setUnlocalizedName(Reference.SCIngredients.SALT_PILE.getUnlocalizedName());
		setRegistryName(Reference.SCIngredients.SALT_PILE.getRegistryName());
		
	}
	
}
