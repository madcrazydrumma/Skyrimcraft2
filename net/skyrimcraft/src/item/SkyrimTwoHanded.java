package net.skyrimcraft.src.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.base.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkyrimTwoHanded extends SkyrimWeapon
{
	public SkyrimTwoHanded(int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, par2EnumToolMaterial);
		setCreativeTab(SkyrimcraftII.tab);
	}
	
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.none;
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
    {
	    EntityPlayer Player = (EntityPlayer) entity;
	    if(Player.getCurrentEquippedItem() !=null && Player.getCurrentEquippedItem().itemID == this.itemID) {
	    	Player.addPotionEffect((new PotionEffect(Potion.digSlowdown.getId(), 0, 4)));
	    } else {
	    	Player.curePotionEffects(itemstack);
	    }
    }
    
    public boolean canHarvestBlock(Block par1Block)
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
    	return true;
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