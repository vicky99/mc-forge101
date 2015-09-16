package org.devoxx4kids.forge.mods;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ExplodingMinecarts {
	@SubscribeEvent
	public void explode(MinecartCollisionEvent boomba){
		EntityMinecart minecart = boomba.minecart;
		if (boomba.collider instanceof EntityPlayer) {
			return;
		}
		minecart.worldObj.createExplosion(minecart,minecart.posX,minecart.posY,minecart.posZ,10,false);
	}

}
