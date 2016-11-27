package net.skyrimcraft.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.skyrimcraft.mod.drinks.DrinkAle;
import net.skyrimcraft.mod.drinks.DrinkAltoWine;
import net.skyrimcraft.mod.drinks.DrinkArgonianAle;
import net.skyrimcraft.mod.drinks.DrinkBalmoraBlue;
import net.skyrimcraft.mod.drinks.DrinkBlackbriarMead;
import net.skyrimcraft.mod.drinks.DrinkBlackbriarReserve;
import net.skyrimcraft.mod.drinks.DrinkCliffRacer;
import net.skyrimcraft.mod.drinks.DrinkColovianBrandy;
import net.skyrimcraft.mod.drinks.DrinkCyrodilicBrandy;
import net.skyrimcraft.mod.drinks.DrinkDoubleDistilledSkooma;
import net.skyrimcraft.mod.drinks.DrinkDragonsBreathMead;
import net.skyrimcraft.mod.drinks.DrinkFirebrandWine;
import net.skyrimcraft.mod.drinks.DrinkHonningbrewMead;
import net.skyrimcraft.mod.drinks.DrinkMeadWithJuniperBerry;
import net.skyrimcraft.mod.drinks.DrinkNordMead;
import net.skyrimcraft.mod.drinks.DrinkSkooma;
import net.skyrimcraft.mod.drinks.DrinkSpicedWine;
import net.skyrimcraft.mod.drinks.DrinkStrosMkaiRum;
import net.skyrimcraft.mod.drinks.DrinkVelvetLeChance;
import net.skyrimcraft.mod.drinks.DrinkWhitegoldTower;

public class ModDrinks {

	// Beverages
	public static Item ale;
	public static Item altoWine;
	public static Item argonianAle;
	public static Item balmoraBlue;
	public static Item blackbriarMead;
	public static Item blackbriarReserve;
	public static Item cliffRacer;
	public static Item colovianBrandy;
	public static Item cyrodilicBrandy;
	public static Item doubleDistilledSkooma;
	public static Item dragonsBreathMead;
	public static Item firebrandWine;
	public static Item honningbrewMead;
	public static Item meadWithJuniperBerry;
	public static Item nordMead;
	public static Item skooma;
	public static Item spicedWine;
	public static Item strosMkaiRum;
	public static Item velvetLeChance;
	public static Item whitegoldTower;
	
	public static void init() {
		altoWine = new DrinkAltoWine();
		ale = new DrinkAle();
		argonianAle = new DrinkArgonianAle();
		balmoraBlue = new DrinkBalmoraBlue();
		blackbriarMead = new DrinkBlackbriarMead();
		blackbriarReserve = new DrinkBlackbriarReserve();
		cliffRacer = new DrinkCliffRacer();
		colovianBrandy = new DrinkColovianBrandy();
		cyrodilicBrandy = new DrinkCyrodilicBrandy();
		doubleDistilledSkooma = new DrinkDoubleDistilledSkooma();
		dragonsBreathMead = new DrinkDragonsBreathMead();
		firebrandWine = new DrinkFirebrandWine();
		honningbrewMead = new DrinkHonningbrewMead();
		meadWithJuniperBerry = new DrinkMeadWithJuniperBerry();
		nordMead = new DrinkNordMead();
		skooma = new DrinkSkooma();
		spicedWine = new DrinkSpicedWine();
		strosMkaiRum = new DrinkStrosMkaiRum();
		velvetLeChance = new DrinkVelvetLeChance();
		whitegoldTower = new DrinkWhitegoldTower();
	}
	
	public static void register() {
		GameRegistry.register(ale);
		GameRegistry.register(altoWine);
		GameRegistry.register(argonianAle);
		GameRegistry.register(balmoraBlue);
		GameRegistry.register(blackbriarMead);
		GameRegistry.register(blackbriarReserve);
		GameRegistry.register(cliffRacer);
		GameRegistry.register(colovianBrandy);
		GameRegistry.register(cyrodilicBrandy);
		GameRegistry.register(doubleDistilledSkooma);
		GameRegistry.register(dragonsBreathMead);
		GameRegistry.register(firebrandWine);
		GameRegistry.register(honningbrewMead);
		GameRegistry.register(meadWithJuniperBerry);
		GameRegistry.register(nordMead);
		GameRegistry.register(skooma);
		GameRegistry.register(spicedWine);
		GameRegistry.register(strosMkaiRum);
		GameRegistry.register(velvetLeChance);
		GameRegistry.register(whitegoldTower);
	}
	
	public static void registerRenders() {
		registerRender(ale);
		registerRender(altoWine);
		registerRender(argonianAle);
		registerRender(balmoraBlue);
		registerRender(blackbriarMead);
		registerRender(blackbriarReserve);
		registerRender(cliffRacer);
		registerRender(colovianBrandy);
		registerRender(cyrodilicBrandy);
		registerRender(doubleDistilledSkooma);
		registerRender(dragonsBreathMead);
		registerRender(firebrandWine);
		registerRender(honningbrewMead);
		registerRender(meadWithJuniperBerry);
		registerRender(nordMead);
		registerRender(skooma);
		registerRender(spicedWine);
		registerRender(strosMkaiRum);
		registerRender(velvetLeChance);
		registerRender(whitegoldTower);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
