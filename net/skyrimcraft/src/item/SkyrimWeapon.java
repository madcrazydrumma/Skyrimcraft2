package net.skyrimcraft.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.base.Util;

public class SkyrimWeapon extends ItemSword
{
	public SkyrimWeapon(int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1 - 256, par2EnumToolMaterial);
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
