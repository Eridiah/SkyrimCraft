package net.skyrimcraft.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.skyrimcraft.mod.init.ModBlocks;
import net.skyrimcraft.mod.init.ModFoods;
import net.skyrimcraft.mod.init.ModItems;
import net.skyrimcraft.mod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class SkyrimCraft {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Instance
	public static SkyrimCraft instance;
	
	public static final CreativeTabs CREATIVE_TAB = new ModTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
		
		ModFoods.init();
		ModFoods.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
