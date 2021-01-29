package net.luis.cave.init;

import net.luis.cave.Cave;
import net.luis.cave.items.EndStar;
import net.luis.cave.items.FungusSoup;
import net.luis.cave.items.MiningStar;
import net.luis.cave.items.PowderSnowBucket;
import net.luis.cave.items.RubyApple;
import net.luis.cave.items.Spyglass;
import net.luis.cave.items.vanilla.Sugar;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CaveItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cave.Mod_Id);
	public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cave.Minecraft_Id);
	
	
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> ENDERITE_SCRAP = ITEMS.register("enderite_scrap", 
			() -> new Item(new Item.Properties().group(Cave.MISC).isImmuneToFire()));
	
	public static final RegistryObject<Item> ENDERITE_INGOT = ITEMS.register("enderite_ingot",  
			() -> new Item(new Item.Properties().group(Cave.MISC).isImmuneToFire()));
	
	public static final RegistryObject<Item> FUNGUS_SOUP = ITEMS.register("fungus_soup", FungusSoup::new);
	
	public static final RegistryObject<Item> RUBY_APPLE = ITEMS.register("ruby_apple", RubyApple::new);
	
	public static final RegistryObject<Item> SUGAR = VANILLA_ITEMS.register("sugar", Sugar::new);
	
	public static final RegistryObject<Item> ROSE_QUARTZ = ITEMS.register("rose_quartz", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> POLISHED_ROSE_QUARTZ = ITEMS.register("polished_rose_quartz", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> GOLD_SHEET = ITEMS.register("gold_sheet", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> IRON_SHEET = ITEMS.register("iron_sheet", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> BLAZING_INGOT = ITEMS.register("blazing_ingot", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> JADE_INGOT = ITEMS.register("jade_ingot", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> LIMONITE_INGOT = ITEMS.register("limonite_ingot", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> ROSITE_INGOT = ITEMS.register("rosite_ingot", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> SAPHIRE_INGOT = ITEMS.register("saphire_ingot", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> POWDER_SNOW_BUCKET = ITEMS.register("powder_snow_bucket", PowderSnowBucket::new);
	
	public static final RegistryObject<Item> END_STAR = ITEMS.register("end_star", EndStar::new);
	
	public static final RegistryObject<Item> ANDESITE_ALLOY = ITEMS.register("andesite_alloy", 
			() -> new Item(new Item.Properties().group(Cave.MISC).maxStackSize(16)));
	
	public static final RegistryObject<Item> NIGHT_INGOT = ITEMS.register("night_ingot", 
			() -> new Item(new Item.Properties().group(Cave.MISC).isImmuneToFire()));
	
	public static final RegistryObject<Item> MINING_STAR = ITEMS.register("mining_star", MiningStar::new);
	
	public static final RegistryObject<Item> SPYGLASS = ITEMS.register("spyglass", Spyglass::new);
	
	public static final RegistryObject<Item> AMETHYST_SHARD = ITEMS.register("amethyst_shard", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> FERTILIZER = ITEMS.register("fertilizer", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", 
			() -> new Item(new Item.Properties().group(Cave.MISC)));
	
}

