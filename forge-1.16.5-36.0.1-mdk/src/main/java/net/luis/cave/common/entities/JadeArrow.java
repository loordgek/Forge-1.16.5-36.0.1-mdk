package net.luis.cave.common.entities;

import net.luis.cave.init.ModEntityType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class JadeArrow extends AbstractArrowEntity {

	public JadeArrow(EntityType<? extends JadeArrow> type, World worldIn) {

		super(type, worldIn);

	}
	
	public JadeArrow(double x, double y, double z, World worldIn) {

		super(ModEntityType.JADE_ARROW.get(), x, y, z, worldIn);

	}
	
	public JadeArrow(LivingEntity shooter, World worldIn) {

		super(ModEntityType.JADE_ARROW.get(), shooter, worldIn);

	}

	@Override
	protected ItemStack getArrowStack() {

		return null;

	}

}
