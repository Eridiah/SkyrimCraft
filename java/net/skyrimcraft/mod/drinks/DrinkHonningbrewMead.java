package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkHonningbrewMead extends ItemDrink {

	public DrinkHonningbrewMead() {
		setUnlocalizedName(Reference.SCDrinks.HONNINGBREW_MEAD.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.HONNINGBREW_MEAD.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		
	}
	
}
