package net.luis.cave.init.blocks;

import net.luis.cave.Cave;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CaveBlockItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cave.Mod_Id);
	public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cave.Minecraft_Id);

	
	public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", 
			() -> new BlockItem(CaveBlocks.RUBY_BLOCK.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> ENDERITE_ORE_ITEM = ITEMS.register("enderite_ore", 
			() -> new BlockItem(CaveBlocks.ENDERITE_ORE.get(),new Item.Properties().group(Cave.BUILDING_BLOCKS).isImmuneToFire()));
	
	public static final RegistryObject<Item> ENDERITE_BLOCK_ITEM = ITEMS.register("enderite_block", 
			() -> new BlockItem(CaveBlocks.ENDERITE_BLOCK.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS).isImmuneToFire()));
	
	public static final RegistryObject<Item> JADE_ORE_ITEM = ITEMS.register("jade_ore", 
			() -> new BlockItem(CaveBlocks.JADE_ORE.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> JADE_BLOCK_ITEM = ITEMS.register("jade_block", 
			() -> new BlockItem(CaveBlocks.JADE_BLOCK.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> LIMONITE_ORE_ITEM = ITEMS.register("limonite_ore", 
			() -> new BlockItem(CaveBlocks.LIMONITE_ORE.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> LIMONITE_BLOCK_ITEM = ITEMS.register("limonite_block", 
			() -> new BlockItem(CaveBlocks.LIMONITE_BLOCK.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> ROSITE_ORE_ITEM = ITEMS.register("rosite_ore", 
			() -> new BlockItem(CaveBlocks.ROSITE_ORE.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> ROSITE_BLOCK_ITEM = ITEMS.register("rosite_block", 
			() -> new BlockItem(CaveBlocks.ROSITE_BLOCK.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SAPHIRE_ORE_ITEM = ITEMS.register("saphire_ore", 
			() -> new BlockItem(CaveBlocks.SAPHIRE_ORE.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> SAPHIRE_BLOCK_ITEM = ITEMS.register("saphire_block", 
			() -> new BlockItem(CaveBlocks.SAPHIRE_BLOCK.get(), new Item.Properties().group(Cave.BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> POWDER_SNOW_ITEM = ITEMS.register("powder_snow", 
			() -> new BlockItem(CaveBlocks.POWDER_SNOW.get(), new Item.Properties().group(Cave.DECORATIONS)));
	
	public static final RegistryObject<Item> INFINITE_ANVIL_ITEM = ITEMS.register("infinite_anvil", 
			() -> new BlockItem(CaveBlocks.INFINITE_ANVIL.get(), new Item.Properties().group(Cave.DECORATIONS)));
	
	public static final RegistryObject<Item> SMELTING_FURNACE_ITEM = ITEMS.register("smelting_furnace", 
			() -> new BlockItem(CaveBlocks.SMELTING_FURNACE.get(), new Item.Properties().group(Cave.DECORATIONS)));
	
	public static final RegistryObject<Item> BEE_TABLE_ITEM = ITEMS.register("bee_table", 
			() -> new BlockItem(CaveBlocks.BEE_TABLE.get(), new Item.Properties().group(Cave.DECORATIONS)));
	
	public static final RegistryObject<Item> TINTED_GLASS_ITEM = ITEMS.register("tinted_glass", 
			() -> new BlockItem(CaveBlocks.TINTED_GLASS.get(), new Item.Properties().group(Cave.DECORATIONS)));
	
}
