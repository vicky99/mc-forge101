package org.devoxx4kids.forge.mods;

import scala.util.Random;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigsDroppings {
	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event){
		if(!(event.entity instanceof EntityPig)){
			return;
		}
		
		Random random = new Random();
		
		if(!event.entity.worldObj.isRemote){
			event.entity.dropItem(Items.diamond, random.nextInt(10));
			event.entity.dropItem(Items.potato, random.nextInt(6));
		}
	}
	@SubscribeEvent
	public void explodingDiamonds(EntityItemPickupEvent event){
		if(event.item.getEntityItem().getItem() !=
				Items.diamond) {
			return;
		}
		EntityItem diamond = event.item;
		event.entity.worldObj.createExplosion(diamond, diamond.posX, diamond.posY, diamond.posZ, 3, true);
	}

}
