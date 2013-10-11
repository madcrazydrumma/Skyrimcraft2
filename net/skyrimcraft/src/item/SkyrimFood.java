package net.skyrimcraft.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.skyrimcraft.src.base.PlayerNBT;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.base.Util;
import net.skyrimcraft.src.content.SkyrimItems;

public class SkyrimFood extends ItemFood
{
	public SkyrimFood(int par1, int par2, float par3, boolean par4)
	{
		super(par1 - 256, par2, par3, par4);
		setCreativeTab(SkyrimcraftII.tab);
		this.setAlwaysEdible();
	}
	
	public void registerIcons(IconRegister i)
	{
		this.itemIcon = i.registerIcon(Util.MOD_ID + ":" + this.getName());
	}
	
	public String getName()
	{
		return this.unlocalizedName;
	}
	
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
		return par1ItemStack;
    }
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.eat;
    }
}
