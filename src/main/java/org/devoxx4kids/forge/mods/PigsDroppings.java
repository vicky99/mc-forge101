package org.devoxx4kids.forge.mods;

import scala.util.Random;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigsDroppings {
	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event){
		if(!(event.entity instanceof EntityPig)){
			return;
		}
		
		Random random = new Random();
		
		if(!event.entity.worldObj.isRemote){
			event.entity.dropItem(Item.getItemFromBlock(Blocks.wool), random.nextInt(10));
		}
	}

}
