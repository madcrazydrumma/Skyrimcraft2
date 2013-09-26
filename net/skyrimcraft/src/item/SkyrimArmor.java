package net.skyrimcraft.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.base.Util;

public class SkyrimArmor extends ItemArmor
{
	String fileName;
	
	public SkyrimArmor(int par1, EnumArmorMaterial par2, int par3, int par4, String par5)
	{
		super(par1 - 256, par2, par3, par4);
		fileName = par5;
		setCreativeTab(SkyrimcraftII.tab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.toString().contains("Leggings"))
        {
        	return Util.MOD_ID + ":" + fileName + "_2.png";
        }
        
        return Util.MOD_ID + ":" + fileName + "_1.png";
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