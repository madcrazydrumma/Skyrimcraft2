package net.skyrimcraft.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.base.Util;

public class SkyrimArrow extends SkyrimItem
{
	public SkyrimArrow(int par1)
	{
		super(par1);
		setCreativeTab(SkyrimcraftII.tab);
	}
	
	public void registerIcons(IconRegister i)
	{
		this.itemIcon = i.registerIcon(Util.MOD_ID + ":" + this.getName());
	}
	
	public String getName()
	{
		return this.unlocalizedName;
	}
}
