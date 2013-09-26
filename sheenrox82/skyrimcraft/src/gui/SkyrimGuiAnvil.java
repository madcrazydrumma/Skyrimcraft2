package sheenrox82.skyrimcraft.src.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import sheenrox82.skyrimcraft.src.base.Util;
import sheenrox82.skyrimcraft.src.container.SkyrimContainerAnvil;

public class SkyrimGuiAnvil extends GuiContainer
{	
	public SkyrimGuiAnvil(InventoryPlayer inventoryplayer, World world, int i, int j, int k)
    {
        super(new SkyrimContainerAnvil(inventoryplayer, world, i, j, k));
		xSize = 176;
		ySize = 184;
    }

    public void onGuiClosed()
    {
        super.onGuiClosed();
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
    	fontRenderer.drawString("Anvil", 8, 6, 4210752);
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.func_110577_a(new ResourceLocation(Util.MOD_ID + ":" + "textures/gui/" + "anvil.png"));
        int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}
