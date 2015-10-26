package org.devoxx4kids.forge.mods.movement;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BouncySponge {
	@SubscribeEvent
	public void makeJumpHigher(LivingJumpEvent event){
		if(!(event.entity instanceof EntityPlayer)) {
			return;
		}
		int x = (int) Math.floor(event.entity.posX);
		int y = (int) Math.floor(event.entity.posY);
		int z = (int) Math.floor(event.entity.posZ);
		
		if(event.entity.worldObj.getBlockState(new BlockPos(x, y-1, z)).getBlock() != Blocks.sponge) {
			return;
		}
		event.entity.motionY *= 10;
	}


}
