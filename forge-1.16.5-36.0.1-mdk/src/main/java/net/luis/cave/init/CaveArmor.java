package net.luis.cave.init;

import net.luis.cave.Cave;
import net.luis.cave.items.armor.EnderiteElytra;
import net.luis.cave.items.armor.EnderiteHelmet;
import net.luis.cave.items.armor.NightArmor;
import net.luis.cave.items.armor.NightElytra;
import net.luis.cave.items.armor.NightHelmet;
import net.luis.cave.items.armor.SaphireArmor;
import net.luis.cave.util.enums.CaveArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CaveArmor {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cave.Mod_Id);
	
	
	public static final RegistryObject<ArmorItem> SLIME_HELMET = ITEMS.register("slime_helmet", 
			() -> new ArmorItem(CaveArmorMaterial.SLIME, EquipmentSlotType.HEAD, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> SLIME_CHESTPLATE = ITEMS.register("slime_chestplate", 
			() -> new ArmorItem(CaveArmorMaterial.SLIME, EquipmentSlotType.CHEST, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> SLIME_LEGGINS = ITEMS.register("slime_leggings", 
			() -> new ArmorItem(CaveArmorMaterial.SLIME, EquipmentSlotType.LEGS, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> SLIME_BOOTS = ITEMS.register("slime_boots", 
			() -> new ArmorItem(CaveArmorMaterial.SLIME, EquipmentSlotType.FEET, new Item.Properties().group(Cave.Armor)));
	
	
	public static final RegistryObject<ArmorItem> LIMONITE_HELMET = ITEMS.register("limonite_helmet", 
			() -> new ArmorItem(CaveArmorMaterial.LIMONITE, EquipmentSlotType.HEAD, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> LIMONITE_CHESTPLATE = ITEMS.register("limonite_chestplate", 
			() -> new ArmorItem(CaveArmorMaterial.LIMONITE, EquipmentSlotType.CHEST, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> LIMONITE_LEGGINS = ITEMS.register("limonite_leggings", 
			() -> new ArmorItem(CaveArmorMaterial.LIMONITE, EquipmentSlotType.LEGS, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> LIMONITE_BOOTS = ITEMS.register("limonite_boots", 
			() -> new ArmorItem(CaveArmorMaterial.LIMONITE, EquipmentSlotType.FEET, new Item.Properties().group(Cave.Armor)));
	
	
	public static final RegistryObject<ArmorItem> JADE_HELMET = ITEMS.register("jade_helmet", 
			() -> new ArmorItem(CaveArmorMaterial.JADE, EquipmentSlotType.HEAD, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> JADE_CHESTPLATE = ITEMS.register("jade_chestplate", 
			() -> new ArmorItem(CaveArmorMaterial.JADE, EquipmentSlotType.CHEST, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> JADE_LEGGINS = ITEMS.register("jade_leggings", 
			() -> new ArmorItem(CaveArmorMaterial.JADE, EquipmentSlotType.LEGS, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> JADE_BOOTS = ITEMS.register("jade_boots", 
			() -> new ArmorItem(CaveArmorMaterial.JADE, EquipmentSlotType.FEET, new Item.Properties().group(Cave.Armor)));
	
	
	public static final RegistryObject<ArmorItem> BLAZING_HELMET = ITEMS.register("blazing_helmet", 
			() -> new ArmorItem(CaveArmorMaterial.BLAZING, EquipmentSlotType.HEAD, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	public static final RegistryObject<ArmorItem> BLAZING_CHESTPLATE = ITEMS.register("blazing_chestplate", 
			() -> new ArmorItem(CaveArmorMaterial.BLAZING, EquipmentSlotType.CHEST, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	public static final RegistryObject<ArmorItem> BLAZING_LEGGINS = ITEMS.register("blazing_leggings", 
			() -> new ArmorItem(CaveArmorMaterial.BLAZING, EquipmentSlotType.LEGS, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	public static final RegistryObject<ArmorItem> BLAZING_BOOTS = ITEMS.register("blazing_boots", 
			() -> new ArmorItem(CaveArmorMaterial.BLAZING, EquipmentSlotType.FEET, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	
	public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", 
			() -> new ArmorItem(CaveArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", 
			() -> new ArmorItem(CaveArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> RUBY_LEGGINS = ITEMS.register("ruby_leggings", 
			() -> new ArmorItem(CaveArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", 
			() -> new ArmorItem(CaveArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Cave.Armor)));
	
	
	public static final RegistryObject<ArmorItem> SAPHIRE_HELMET = ITEMS.register("saphire_helmet", 
			() -> new SaphireArmor(CaveArmorMaterial.SAPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> SAPHIRE_CHESTPLATE = ITEMS.register("saphire_chestplate", 
			() -> new SaphireArmor(CaveArmorMaterial.SAPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> SAPHIRE_LEGGINS = ITEMS.register("saphire_leggings", 
			() -> new SaphireArmor(CaveArmorMaterial.SAPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(Cave.Armor)));
	
	public static final RegistryObject<ArmorItem> SAPHIRE_BOOTS = ITEMS.register("saphire_boots", 
			() -> new SaphireArmor(CaveArmorMaterial.SAPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(Cave.Armor)));
	
	
	public static final RegistryObject<ArmorItem> ENDREITE_HELMET = ITEMS.register("enderite_helmet", EnderiteHelmet::new);
	
	public static final RegistryObject<ArmorItem> ENDREITE_CHESTPLATE = ITEMS.register("enderite_chestplate", 
			() -> new ArmorItem(CaveArmorMaterial.ENDERITE, EquipmentSlotType.CHEST, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	public static final RegistryObject<ArmorItem> ENDREITE_ELYTRA = ITEMS.register("enderite_elytra", EnderiteElytra::new);
	
	public static final RegistryObject<ArmorItem> ENDREITE_LEGGINS = ITEMS.register("enderite_leggings", 
			() -> new ArmorItem(CaveArmorMaterial.ENDERITE, EquipmentSlotType.LEGS, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	public static final RegistryObject<ArmorItem> ENDREITE_BOOTS = ITEMS.register("enderite_boots", 
			() -> new ArmorItem(CaveArmorMaterial.ENDERITE, EquipmentSlotType.FEET, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	
	public static final RegistryObject<ArmorItem> NIGHT_HELMET = ITEMS.register("night_helmet", NightHelmet::new);
	
	public static final RegistryObject<ArmorItem> NIGHT_CHESTPLATE = ITEMS.register("night_chestplate", 
			() -> new NightArmor(CaveArmorMaterial.NIGHT, EquipmentSlotType.CHEST, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	public static final RegistryObject<ArmorItem> NIGHT_ELYTRA = ITEMS.register("night_elytra", NightElytra::new);
	
	public static final RegistryObject<ArmorItem> NIGHT_LEGGINS = ITEMS.register("night_leggings", 
			() -> new NightArmor(CaveArmorMaterial.NIGHT, EquipmentSlotType.LEGS, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
	public static final RegistryObject<ArmorItem> NIGHT_BOOTS = ITEMS.register("night_boots", 
			() -> new NightArmor(CaveArmorMaterial.NIGHT, EquipmentSlotType.FEET, new Item.Properties().group(Cave.Armor).isImmuneToFire()));
	
}
