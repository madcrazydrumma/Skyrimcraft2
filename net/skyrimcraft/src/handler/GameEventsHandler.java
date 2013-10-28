package net.skyrimcraft.src.handler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.skyrimcraft.src.base.PlayerNBT;
import net.skyrimcraft.src.base.Util;

public class GameEventsHandler
{
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void onSound(SoundLoadEvent event) {
		event.manager.addSound(Util.MOD_ID + "levelup.ogg");
	}
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void onEntityConstructing(EntityConstructing event) {
		if (event.entity instanceof EntityPlayer && PlayerNBT.get((EntityPlayer) event.entity) == null) {
			PlayerNBT.register((EntityPlayer) event.entity);
		}
	}
}