package net.luis.cave.events.client.world;

import net.luis.cave.Cave;
import net.luis.cave.init.CaveItems;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=Cave.Mod_Id, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OnDropRuby {
	
	@SubscribeEvent
	public static void DropRuby(BlockEvent.BreakEvent event) {
		
		BlockPos pos = event.getPos();
		World world = (World) event.getWorld();
		PlayerEntity player = event.getPlayer();
		int enchFortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, player.getHeldItemMainhand());
		int enchSilkTouch = EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, player.getHeldItemMainhand());

		if(player instanceof PlayerEntity) {
			
			if (world.getBlockState(pos).getBlock() == Blocks.REDSTONE_ORE) {
				
				if (enchSilkTouch == 0) { 
					
					if (enchFortune == 0) {
						
						dropRuby(world, pos, player, 0.99);
						
					} else if (enchFortune == 1) {
						
						dropRuby(world, pos, player, 0.98);
						
					} else if (enchFortune == 2) {
						
						dropRuby(world, pos, player, 0.97);
						
					} else if (enchFortune == 3) {
						
						dropRuby(world, pos, player, 0.96);
						
					}
					
				}
				
			}
			
		}
		
	}
	
	private static void dropRuby(World world, BlockPos pos, PlayerEntity player, double chance) {
		
		double x = pos.getX();
		double y = pos.getY();
		double z = pos.getZ();
		
		if (Math.random() >= chance) {
			
			if (!player.abilities.isCreativeMode) {
				
				ItemEntity  item = new ItemEntity(world, x + 0.5, y + 0.5, z + 0.5, new ItemStack(CaveItems.RUBY.get()));
				item.setPickupDelay(10);
				world.addEntity(item);
				
			}
			
		}
		
	}
		
}
