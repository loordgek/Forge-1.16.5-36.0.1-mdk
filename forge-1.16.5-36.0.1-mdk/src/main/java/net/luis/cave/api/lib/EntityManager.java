package net.luis.cave.api.lib;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.monster.DrownedEntity;
import net.minecraft.entity.monster.ElderGuardianEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.monster.ShulkerEntity;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.passive.fish.AbstractFishEntity;

public class EntityManager {

	public static boolean hasMaxHealth(LivingEntity enity) {
		
		if (enity.getHealth() != enity.getAttribute(Attributes.MAX_HEALTH).getBaseValue()) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static boolean isEnderType(Entity entity) {
		
		if (entity instanceof EndermanEntity) {
			
			return true;
			
		} else if (entity instanceof EndermiteEntity) {
			
			return true;
			
		} else if (entity instanceof ShulkerEntity) {
			
			return true;
			
		} else if (entity instanceof EnderDragonEntity) { 
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static boolean isLavaType(Entity entity) {
		
		if (entity instanceof MagmaCubeEntity) {
			
			return true;
			
		} else if (entity instanceof GhastEntity) {
			
			return true;
			
		} else if (entity instanceof BlazeEntity) {
			
			return true;
			
		} else if (entity instanceof StriderEntity) { 
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static boolean isWaterType(Entity entity) {
		
		if (entity instanceof AbstractFishEntity) {
			
			return true;
			
		} else if (entity instanceof DolphinEntity) {
			
			return true;
			
		} else if (entity instanceof SquidEntity) {
			
			return true;
			
		} else if (entity instanceof GuardianEntity) { 
			
			return true;
			
		} else if (entity instanceof ElderGuardianEntity) { 
			
			return true;
			
		} else if (entity instanceof DrownedEntity) { 
			
			return true;
			
		} else if (entity instanceof TurtleEntity) { 
			
			return true;
			
		}
		
		return false;
		
	}

}
