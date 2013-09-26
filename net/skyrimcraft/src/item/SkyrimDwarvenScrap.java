package net.skyrimcraft.src.item;

import java.util.List;


import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.skyrimcraft.src.base.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkyrimDwarvenScrap extends SkyrimItem
{
    public static final String[] scrapNames = new String[] { "Bent Dwemer Scrap Metal", "Large Decorative Dwemer Strut", "Large Dwemer Plate Metal", "Large Dwemer Strut", "Small Dwemer Plate Metal", "Solid Dwemer Metal" };
    
	public SkyrimDwarvenScrap(int par1)
	{
		super(par1);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
	}
	
    public String getItemDisplayName(ItemStack par1ItemStack)
    {
        return scrapNames[par1ItemStack.getItemDamage()];
    }

	@SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < scrapNames.length; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
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
