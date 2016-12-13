package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkBlackbriarReserve extends ItemDrink {

	public DrinkBlackbriarReserve() {
		super(0, 0, false);
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.BLACK_BRIAR_RESERVE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.BLACK_BRIAR_RESERVE.getRegistryName());
	}
	
}
