package org.devoxx4kids.forge.mods;

import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreak {
	@SubscribeEvent
	public void sendMessage(BreakEvent event){
		if (event.state.getBlock() == Blocks.stone) {
			event.getPlayer().addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GRAY + "Stone breaker!"));
		}
	}
}
