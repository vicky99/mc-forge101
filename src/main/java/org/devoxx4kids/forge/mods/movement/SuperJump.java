package org.devoxx4kids.forge.mods.movement;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SuperJump {
	@SubscribeEvent
	public void makeJumpHigher(LivingJumpEvent event){
		if(!(event.entity instanceof EntityPlayer)) {
			return;
		}
		event.entity.motionY *= 5;
		event.entity.motionX *= 35;
		event.entity.motionZ *= 35;
	}

}
