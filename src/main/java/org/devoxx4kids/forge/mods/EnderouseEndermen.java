package org.devoxx4kids.forge.mods;

import java.util.Random;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EnderouseEndermen {
	
	@SubscribeEvent
	public void drop(LivingDeathEvent event) {
		if(!(event.entity instanceof EntityEnderman)){
			return;
		}
		Random random = new Random();
		if(!event.entity.worldObj.isRemote){
			event.entity.dropItem(Items.ender_pearl, random.nextInt(9)+1);
		}
	}
	
	@SubscribeEvent
	public void holdBlock(EntityJoinWorldEvent event){
		if(!(event.entity instanceof EntityEnderman)){
			return;
		}
		EntityEnderman enderman = (EntityEnderman) event.entity;
		enderman.func_175490_a(Blocks.tnt.getDefaultState());
	}
}