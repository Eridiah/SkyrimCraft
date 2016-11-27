package net.skyrimcraft.mod;

public class Reference {

	public static final String MOD_ID = "sc";
	public static final String NAME = "Skyrim Craft";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "net.skyrimcraft.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "net.skyrimcraft.mod.proxy.ServerProxy";
	
	public static enum SCBlocks {
		
		WEAPON_RACK("weaponRack", "BlockWeaponRack"),
		GRIND_STONE("grindStone", "BlockGrindStone");
		
		private String unlocalizedName;
		private String registryName;
		
		SCBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum SCDrinks {
		
		//Drinks
		ALE("ale", "DrinkAle"),
		ALTO_WINE("altoWine", "DrinkAltoWine"),
		ARGONIAN_ALE("argonianAle", "DrinkArgonianAle"),
		BALMORA_BLUE("balmoraBlue", "DrinkBalmoraBlue"),
		BLACK_BRIAR_MEAD("blackbriarMead", "DrinkBlackbriarMead"),
		BLACK_BRIAR_RESERVE("blackbriarReserve", "DrinkBlackbriarReserve"),
		CLIFF_RACER("cliffRacer", "DrinkCliffRacer"),
		COLOVIAN_BRANDY("colovianBrandy", "DrinkColovianBrandy"),
		CYRODILIC_BRANDY("cyrodilicBrandy", "DrinkCyrodilicBrandy"),
		DOUBLE_DISTILLED_SKOOMA("doubleDistilledSkooma", "DrinkDoubleDistilledSkooma"),
		DRAGONS_BREATH_MEAD("dragonsBreathMead", "DrinkDragonsBreathMead"),
		FIREBRAND_WINE("firebrandWine", "DrinkFirebrandWine"),
		HONNINGBREW_MEAD("honningbrewMead", "DrinkHonningbrewMead"),
		MEAD_WITH_JUNIPER_BERRY("meadWithJuniperBerry", "DrinkMeadWithJuniperBerry"),
		NORD_MEAD("nordMead", "DrinkNordMead"),
		SKOOMA("skooma", "DrinkSkooma"),
		SPICED_WINE("spicedWine", "DrinkSpicedWine"),
		STROS_MKAI_RUM("strosMkaiRum", "DrinkStrosMkaiRum"),
		VELVET_LECHANCE("velvetLeChance", "DrinkVelvetLeChance"),
		WHITE_GOLD_TOWER("whitegoldTower", "DrinkWhitegoldTower");
		
		private String unlocalizedName;
		private String registryName;
		
		SCDrinks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}
	
	public static enum SCFoods {

		//Default Foods
		SWEET_ROLL("sweetRoll", "FoodSweetRoll"),
		GREEN_APPLE("greenApple", "FoodGreenApple"),
		TOMATO("tomato", "FoodTomato"),
		CABBAGE("cabbage", "FoodCabbage"),
		CHEESE("cheese", "FoodCheese"),
		LEEK("leek", "FoodLeek"),
		
		//Craftable Foods
		APPLE_CABBAGE_STEW("appleCabbageStew", "FoodAppleCabbageStew");
		
		private String unlocalizedName;
		private String registryName;
		
		SCFoods(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
	}
	
	public static enum SCIngredients {
		
		SALT_PILE("saltPile", "IngredientSaltPile"),
		SACK_OF_FLOUR("sackOfFlour", "IngredientSackOfFlour");
		
		private String unlocalizedName;
		private String registryName;
		
		SCIngredients(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum SCItems {
		
		HELGEN_KEEP_KEY("helgenKeepKey", "ItemHelgenKeepKey");
		
		private String unlocalizedName;
		private String registryName;
		
		SCItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
}
