package net.luis.cave.events.world;

import java.util.List;

import net.luis.cave.Cave;
import net.luis.cave.init.CaveEnchantment;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;

@Mod.EventBusSubscriber(modid=Cave.Mod_Id, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OnBlasting {
	
	@SubscribeEvent
	public static void Blasting(BlockEvent.BreakEvent event) {
		
		World world = (World) event.getWorld();
		PlayerEntity player = event.getPlayer();
		double x = event.getPos().getX();
		double y = event.getPos().getY();
		double z = event.getPos().getZ();
		int enchBlasting = EnchantmentHelper.getEnchantmentLevel(CaveEnchantment.BLASTING.get(), player.getHeldItemMainhand());
		int enchTelekinesis = EnchantmentHelper.getEnchantmentLevel(CaveEnchantment.TELEKINESIS.get(), player.getHeldItemMainhand());

		if (player instanceof PlayerEntity) {
			
			if (enchBlasting > 0) {
				
				player.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 30, 4, false, false));
				world.createExplosion(player, x, y, z, 2.0f * (enchBlasting + 1), enchTelekinesis == 0 ? Explosion.Mode.BREAK : Explosion.Mode.NONE);
				
			}
			
		}
		
	}
	
	@SubscribeEvent
	public static void Explosion(ExplosionEvent.Detonate event) {
		
		Explosion explosion = event.getExplosion();
		Entity entity = explosion.getExploder();
		List<BlockPos> affectedBlocks = explosion.getAffectedBlockPositions();
		World world = event.getWorld();
		
		if (entity instanceof PlayerEntity) {
			
			PlayerEntity player = (PlayerEntity) entity;
			int enchTelekinesis = EnchantmentHelper.getEnchantmentLevel(CaveEnchantment.TELEKINESIS.get(), player.getHeldItemMainhand());
			int enchBlasting = EnchantmentHelper.getEnchantmentLevel(CaveEnchantment.BLASTING.get(), player.getHeldItemMainhand());
			int enchDoubleDrop = EnchantmentHelper.getEnchantmentLevel(CaveEnchantment.DOUBLE_DROPS.get(), player.getHeldItemMainhand());
			
			if (enchTelekinesis > 0 && enchBlasting > 0) {
				
				if (enchDoubleDrop > 0) {
					
					for (BlockPos pos : affectedBlocks) {
						
						List<ItemStack> drops = Block.getDrops(world.getBlockState(pos), (ServerWorld) world, pos, world.getTileEntity(pos));
						
						for (ItemStack item : drops) {
							
							for (int i = 0; i < 2; i++) {
								
								ItemHandlerHelper.giveItemToPlayer(player, item);
								
							}
							
						}
						
						world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
						
					}
					
				} else {
					
					for (BlockPos pos : affectedBlocks) {
						
						List<ItemStack> drops = Block.getDrops(world.getBlockState(pos), (ServerWorld) world, pos, world.getTileEntity(pos));
						
						for (ItemStack item : drops) {
							
							ItemHandlerHelper.giveItemToPlayer(player, item);
							
						}
						
						world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
						
					}
					
				}
				
			}
			
		}
		
	}
	
}
