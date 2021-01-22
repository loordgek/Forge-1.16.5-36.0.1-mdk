package net.luis.cave.items;

import net.luis.cave.Cave;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Spyglass extends Item {

	public Spyglass() {
		
		super(new Item.Properties()
					.group(Cave.MISC)
					.maxStackSize(1));
		
	}
	
	@Override
	public int getUseDuration(ItemStack stack) {
		
		return 72000;
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
		
		player.setActiveHand(hand);
		return super.onItemRightClick(world, player, hand);
		
	}
	
}