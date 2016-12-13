package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkArgonianAle extends ItemDrink {

	public DrinkArgonianAle() {
		super(0, 0, false);
		setUnlocalizedName(Reference.SCDrinks.ARGONIAN_ALE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.ARGONIAN_ALE.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
	}
	
}
