package net.luis.cave.api.item.armor;

import net.luis.cave.api.lib.PlayerManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class Night extends ArmorItem {

	public Night(IArmorMaterial material, EquipmentSlotType slot, Properties builder) {
		
		super(material, slot, builder);
		
	}
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		
		if (PlayerManager.hasArmor(player, material)) {
			
			player.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 400, 0, true, false));
			
		}
		
	}

}