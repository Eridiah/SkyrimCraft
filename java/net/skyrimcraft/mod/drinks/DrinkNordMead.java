package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkNordMead extends ItemDrink {

	public DrinkNordMead() {
		setUnlocalizedName(Reference.SCDrinks.NORD_MEAD.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.NORD_MEAD.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
	}
	
}
