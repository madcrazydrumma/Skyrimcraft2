package sheenrox82.skyrimcraft.src.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import sheenrox82.skyrimcraft.src.base.SkyrimcraftII;
import sheenrox82.skyrimcraft.src.base.Util;

public class SkyrimBlock extends Block
{
	public SkyrimBlock(int par1, Material par3Material)
	{
		super(par1, par3Material);
		this.setCreativeTab(SkyrimcraftII.tab);
	}
	
	public void registerIcons(IconRegister i)
	{
		this.blockIcon = i.registerIcon(Util.MOD_ID + ":" + this.getName());
	}
	
	public String getName()
	{
		return this.unlocalizedName;
	}
}
