package org.devoxx4kids.forge.mods.explosions;

import net.minecraft.init.Blocks;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DiamondOreTrap {
	
	@SubscribeEvent
	public void explode(BreakEvent event){
		if (event.state.getBlock() != Blocks.gold_block) {
			return;
		}
		event.world.createExplosion(null,event.pos.getX() ,event.pos.getY(),event.pos.getZ(),10,true);
	}

}
