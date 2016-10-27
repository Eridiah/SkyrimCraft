package net.skyrimcraft.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.skyrimcraft.mod.init.ModItems;

public class ModTab extends CreativeTabs {

	public ModTab() {
		super("tabSC");
		setBackgroundImageName("item_search.png");
	}
	
	@Override
	public Item getTabIconItem() {
		return ModItems.helgenKeepKey;
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
	
}
