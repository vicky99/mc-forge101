package org.devoxx4kids.forge.mods;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ZombieKnights {
	@SubscribeEvent
	public void giveArmor(EntityJoinWorldEvent event){
		if(!(event.entity instanceof EntityZombie)){
			return;
		}
		EntityZombie zombie = (EntityZombie) event.entity;
		
		zombie.setCurrentItemOrArmor(0, new ItemStack(Items.golden_axe));
		zombie.setCurrentItemOrArmor(1, new ItemStack(Items.golden_helmet));
		zombie.setCurrentItemOrArmor(2, new ItemStack(Items.golden_chestplate));
		zombie.setCurrentItemOrArmor(3, new ItemStack(Items.golden_leggings));
		zombie.setCurrentItemOrArmor(4, new ItemStack(Items.golden_boots));
	}

}
