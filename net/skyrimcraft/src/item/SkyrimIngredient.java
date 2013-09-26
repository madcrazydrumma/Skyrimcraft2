package net.skyrimcraft.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.base.Util;

public class SkyrimIngredient extends Item
{
	public SkyrimIngredient(int par1)
	{
		super(par1 - 256);
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
