package org.devoxx4kids.forge.mods;

import org.devoxx4kids.forge.mods.entities.Creepers;
import org.devoxx4kids.forge.mods.entities.DragonSpawner;
import org.devoxx4kids.forge.mods.entities.PigsDroppings;
import org.devoxx4kids.forge.mods.entities.ZombieKnights;
import org.devoxx4kids.forge.mods.explosions.BiggerTNTExplosions;
import org.devoxx4kids.forge.mods.explosions.DiamondOreTrap;
import org.devoxx4kids.forge.mods.explosions.EnderouseEndermen;
import org.devoxx4kids.forge.mods.explosions.ExplodingAnvils;
import org.devoxx4kids.forge.mods.explosions.ExplodingMinecarts;
import org.devoxx4kids.forge.mods.movement.SuperJump;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = MainMod.MODID, version = MainMod.VERSION)
public class MainMod {
	public static final String MODID = "MyMods";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new ChatItems());
		MinecraftForge.EVENT_BUS.register(new DragonSpawner());
		//MinecraftForge.EVENT_BUS.register(new CreeperSpawnAlert());
		MinecraftForge.EVENT_BUS.register(new ExplodingAnvils());
		//MinecraftForge.EVENT_BUS.register(new BlockBreak());
		MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
		MinecraftForge.EVENT_BUS.register(new DiamondOreTrap());
		MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosions());
		MinecraftForge.EVENT_BUS.register(new PigsDroppings());
		MinecraftForge.EVENT_BUS.register(new ZombieKnights());
		MinecraftForge.EVENT_BUS.register(new MooMod());
		MinecraftForge.EVENT_BUS.register(new Creepers());
		MinecraftForge.EVENT_BUS.register(new EnderouseEndermen());


	}
}