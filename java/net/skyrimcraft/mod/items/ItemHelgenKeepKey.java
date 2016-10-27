package net.skyrimcraft.mod.items;

import net.minecraft.item.Item;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class ItemHelgenKeepKey extends Item {

	public ItemHelgenKeepKey() {
		setCreativeTab(SkyrimCraft.CREATIVE_TAB);
		setUnlocalizedName(Reference.SCItems.HELGEN_KEEP_KEY.getUnlocalizedName());
		setRegistryName(Reference.SCItems.HELGEN_KEEP_KEY.getRegistryName());
	}
	
}
