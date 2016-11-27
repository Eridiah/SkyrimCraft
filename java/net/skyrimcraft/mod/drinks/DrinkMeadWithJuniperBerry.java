package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkMeadWithJuniperBerry extends ItemDrink {

	public DrinkMeadWithJuniperBerry() {
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.MEAD_WITH_JUNIPER_BERRY.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.MEAD_WITH_JUNIPER_BERRY.getRegistryName());
	}
	
}
