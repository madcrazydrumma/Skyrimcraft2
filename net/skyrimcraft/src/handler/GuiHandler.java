package net.skyrimcraft.src.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.skyrimcraft.src.block.SkyrimAnvil;
import net.skyrimcraft.src.container.SkyrimContainerAnvil;
import net.skyrimcraft.src.gui.GuiMagic;
import net.skyrimcraft.src.gui.GuiMenuSelect;
import net.skyrimcraft.src.gui.SkyrimGuiAnvil;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		if (id == SkyrimAnvil.id)
		{
			return new SkyrimContainerAnvil(player.inventory, world, x, y, z);
		} else if (id == 21) {
			return new GuiMenuSelect();
		} else if(id == 22) {
			return new GuiMagic();
		}
		
		return null;
	}


	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		if (id == SkyrimAnvil.id)
		{
			return new SkyrimGuiAnvil(player.inventory, world, x, y, z);
		} else if(id == 21) {
			return new GuiMenuSelect();
		} else if(id == 22) {
			return new GuiMagic();
		}

		return null;
	}
}