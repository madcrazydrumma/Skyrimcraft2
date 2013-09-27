package net.skyrimcraft.src.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.skyrimcraft.src.base.ExtendedPlayer;

public class GuiSkyrimIngame extends Gui
{
	private Minecraft mc = Minecraft.getMinecraft();
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void renderGameOverlay(RenderGameOverlayEvent event )
	{
		if(event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}
		int width = event.resolution.getScaledWidth();
		int height = event.resolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		ExtendedPlayer props = ExtendedPlayer.get(this.mc.thePlayer);
		
		if (props == null)
		{
			return;
		}
		fontrenderer.drawStringWithShadow("Gold: \u00a76" + props.getGold(), 10, 10, 0xffffff);
		
		ResourceLocation cross = new ResourceLocation("skyrimcraftii", "textures/gui/icons.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.func_110434_K().func_110577_a(cross);
		drawTexturedModalRect(width / 2 - 110, 10, 0, 37, 221, 14);
	}
	
	@ForgeSubscribe
	public void onEntityConstructing(EntityConstructing event) {
		if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer) event.entity) == null)
			ExtendedPlayer.register((EntityPlayer) event.entity);
		if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME) == null)
			event.entity.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer((EntityPlayer) event.entity));
	}
	
	@ForgeSubscribe
	public void onEntityJoinWorld(EntityJoinWorldEvent event)
	{
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) {
			ExtendedPlayer.get((EntityPlayer) event.entity).sync();
		}
	}
}