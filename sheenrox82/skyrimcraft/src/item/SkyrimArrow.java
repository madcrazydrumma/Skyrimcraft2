package sheenrox82.skyrimcraft.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import sheenrox82.skyrimcraft.src.base.SkyrimcraftII;
import sheenrox82.skyrimcraft.src.base.Util;

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
