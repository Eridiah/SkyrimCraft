package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkVelvetLeChance extends ItemDrink {

	public DrinkVelvetLeChance() {
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.VELVET_LECHANCE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.VELVET_LECHANCE.getRegistryName());
	}
	
}
