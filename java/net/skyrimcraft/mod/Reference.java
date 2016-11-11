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
	
	public static enum SCFoods {

		SWEET_ROLL("sweetRoll", "FoodSweetRoll"),
		GREEN_APPLE("greenApple", "FoodGreenApple"),
		TOMATO("tomato", "FoodTomato"),
		CABBAGE("cabbage", "FoodCabbage"),
		CHEESE("cheese", "FoodCheese"),
		LEEK("leek", "FoodLeek");
		
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
		
		SALT_PILE("saltPile", "IngredientSaltPile");
		
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
