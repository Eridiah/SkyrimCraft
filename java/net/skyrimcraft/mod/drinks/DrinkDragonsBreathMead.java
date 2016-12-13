package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkDragonsBreathMead extends ItemDrink {

	public DrinkDragonsBreathMead() {
		super(0, 0, false);
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.DRAGONS_BREATH_MEAD.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.DRAGONS_BREATH_MEAD.getRegistryName());
	}
	
}
