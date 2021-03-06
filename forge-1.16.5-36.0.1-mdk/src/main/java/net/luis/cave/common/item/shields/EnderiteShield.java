package net.luis.cave.common.item.shields;

import net.luis.cave.Cave;
import net.luis.cave.client.render.item.EnderiteShieldRender;
import net.luis.cave.init.items.ModItems;
import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

public class EnderiteShield extends ShieldItem {

	public EnderiteShield() {
		
		super(new Item.Properties().group(Cave.WEAPONS)
				.maxStackSize(1)
				.maxDamage(11587)
				.isImmuneToFire()
				.setISTER(() -> EnderiteShieldRender::new));
		DispenserBlock.registerDispenseBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
		
	}
	
	@Override
	public boolean isShield(ItemStack stack, LivingEntity entity) {
		
		return true;
		
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		
		return repair.getItem() == ModItems.ENDERITE_INGOT.get() || super.getIsRepairable(toRepair, repair);
		
	}
	
}
