package net.skyrimcraft.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.skyrimcraft.mod.init.ModItems;

public class MainTab extends CreativeTabs {

	public MainTab() {
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
