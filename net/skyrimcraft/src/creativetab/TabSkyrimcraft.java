package net.skyrimcraft.src.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.skyrimcraft.src.content.SkyrimItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabSkyrimcraft extends CreativeTabs
{
	public TabSkyrimcraft(String label) 
	{
		super(label);
	}

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return SkyrimItems.daedricSword.itemID;
    }
}
