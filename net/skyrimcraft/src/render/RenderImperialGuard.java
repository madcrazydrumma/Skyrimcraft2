package net.skyrimcraft.src.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderImperialGuard extends RenderBiped
{
	public ResourceLocation field_110871_a = new ResourceLocation("skyrimcraftii", "textures/mob/impguard_0.png");
	
	public RenderImperialGuard(ModelBiped par1ModelBiped, float par2) {
		super(par1ModelBiped, par2);
	}
	
	protected ResourceLocation func_110870_a(EntityGiantZombie par1EntityGiantZombie)
    {
        return field_110871_a;
    }
	
	protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110870_a((EntityGiantZombie)par1Entity);
    }
}