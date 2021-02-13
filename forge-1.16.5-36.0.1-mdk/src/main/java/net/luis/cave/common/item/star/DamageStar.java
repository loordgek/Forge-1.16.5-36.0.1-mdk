package net.luis.cave.common.item.star;

import java.util.List;

import net.luis.cave.Cave;
import net.luis.cave.api.item.Star;
import net.luis.cave.common.enums.StarType;
import net.luis.cave.init.util.ModGameRules;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class DamageStar extends Star {
	
	private final String tag = this.getTagName();

	public DamageStar() {
		
		super(new Item.Properties().group(Cave.MISC), StarType.DAMAGE);
		
	}
	
	@Override
	public void starTick(ItemStack stack, World world, PlayerEntity player) {
		
		int bonusDamage = world.getGameRules().getInt(ModGameRules.MAX_BONUS_DAMAGE.getRule());
		
		if (stack.getOrCreateChildTag(this.getTagName()).getDouble(this.getTagName()) >= bonusDamage) {
			
			stack.getOrCreateChildTag(this.getTagName()).putDouble(this.getTagName(), 0);
			
		}
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
		
		int tagValue = (int) stack.getOrCreateChildTag(tag).getDouble(tag);
		tooltip.add(new StringTextComponent("Bonus Damage: ")
					.mergeStyle(TextFormatting.BLUE).append(new StringTextComponent("" + tagValue)));
		
	}

}