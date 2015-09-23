package org.devoxx4kids.forge.mods;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MooMod {
	@SubscribeEvent
	public void cowToMooshroom(EntityInteractEvent event){
		
		if(!(event.target instanceof EntityCow)){
			return;
		}
		EntityCow moo = (EntityCow) event.target;
		
		if(event.entityPlayer.getCurrentEquippedItem() == null || !(event.entityPlayer.getCurrentEquippedItem().getItem() == Item.getItemFromBlock(Blocks.red_mushroom))){
			return;
		}
		
		EntityMooshroom cow = new EntityMooshroom(event.entity.worldObj);
		cow.setLocationAndAngles(moo.posX, moo.posY, moo.posZ, 0, 0);
		if(!event.entity.worldObj.isRemote){
			moo.setDead();
			event.entity.worldObj.spawnEntityInWorld(cow);
		}
	}

}
