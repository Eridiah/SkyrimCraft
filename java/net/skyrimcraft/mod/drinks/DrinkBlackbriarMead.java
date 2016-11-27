package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkBlackbriarMead extends ItemDrink {

	public DrinkBlackbriarMead() {
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.BLACK_BRIAR_MEAD.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.BLACK_BRIAR_MEAD.getRegistryName());
	}
	
}
