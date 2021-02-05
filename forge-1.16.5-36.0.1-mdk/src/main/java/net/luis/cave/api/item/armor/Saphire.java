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

public class Saphire extends ArmorItem {

	public Saphire(IArmorMaterial material, EquipmentSlotType slot, Properties builder) {
		
		super(material, slot, builder);
		
	}
	
	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		
		if (PlayerManager.hasArmor(player, this.getArmorMaterial())) {
			
			player.fallDistance = 0f;
			player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 10, 4, true, false));
			
			if (player.getMotion().y < 0) {
				
				player.setMotion(player.getMotion().x, player.getMotion().y - (player.getMotion().y / 24), player.getMotion().z);
				
			}
			
		}
		
	}

}