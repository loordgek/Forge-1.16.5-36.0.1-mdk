package net.luis.cave.init.util;

import net.luis.cave.Cave;
import net.luis.cave.common.tileentity.LightningRodTileEntity;
import net.luis.cave.common.tileentity.ModBarrelTileEntity;
import net.luis.cave.common.tileentity.SmeltingFurnaceTileEntity;
import net.luis.cave.init.blocks.ModBlocks;
import net.luis.cave.init.blocks.VanillaBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityType {
	
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Cave.Mod_Id);
	
	public static final RegistryObject<TileEntityType<LightningRodTileEntity>> LIGHTNING_ROD = TILE_ENTITIES.register("lightminig_rod_tileentity", 
			() -> TileEntityType.Builder.create(LightningRodTileEntity::new, ModBlocks.LIGHTNING_ROD.get()).build(null));
	
	public static final RegistryObject<TileEntityType<SmeltingFurnaceTileEntity>> SMELTING_FURNACE = TILE_ENTITIES.register("smelting_furnace_tileentity", 
			() -> TileEntityType.Builder.create(SmeltingFurnaceTileEntity::new, ModBlocks.SMELTING_FURNACE.get()).build(null));
	
	public static final RegistryObject<TileEntityType<ModBarrelTileEntity>> BARREL = TILE_ENTITIES.register("barrel", 
			() -> TileEntityType.Builder.create(ModBarrelTileEntity::new, VanillaBlocks.BARREL.get()).build(null));
	
}
