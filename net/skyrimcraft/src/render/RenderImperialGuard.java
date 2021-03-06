package net.skyrimcraft.src.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.skyrimcraft.src.entity.EntityImperialGuard;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderImperialGuard extends RenderBiped
{
	public ResourceLocation field_110871_a = new ResourceLocation("skyrimcraftii", "textures/mob/imperial_guard_0.png");
	private LabelRenderer lr;
	
	public RenderImperialGuard() {
		super(new ModelBiped(), 0.5F);
		lr = new LabelRenderer();
	}
	
	protected ResourceLocation func_110870_a(EntityImperialGuard par1EntityGiantZombie)
    {
        return field_110871_a;
    }
	
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
	{
		super.doRender(entity, d, d1, d2, f, f1);
	}
	
	protected ResourceLocation func_110867_a(Entity par1Entity)
    {
        return this.func_110870_a((EntityImperialGuard)par1Entity);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return this.func_110867_a((EntityImperialGuard)entity);
	}
}