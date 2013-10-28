package net.skyrimcraft.src.render.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class TwoHandedRenderer implements IItemRenderer
{
	private RenderManager renderManager;
	private Minecraft mc;
	private TextureManager textureManager;
	
	public TwoHandedRenderer() {
		this.renderManager = RenderManager.instance;
		this.mc = Minecraft.getMinecraft();
		this.textureManager = this.mc.renderEngine;
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
	}
	
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}
	
	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		EntityClientPlayerMP entity = (EntityClientPlayerMP) data[1];
		ItemRenderer irInstance = this.mc.entityRenderer.itemRenderer;
		GL11.glPopMatrix();
		if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
			this.renderItem(entity, item, 0);
		} else {
			GL11.glPushMatrix();
			float f2 = 3F - (1F / 3F);
			GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
			GL11.glScalef(f2, f2, f2);
			GL11.glTranslatef(-0.25F, -0.1875F, 0.1875F);
			float f3 = 0.625F;
			GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
			GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
			GL11.glScalef(f3, -f3, f3);
			GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);

			this.renderItem(entity, item, 0);
			GL11.glPopMatrix();
		}
		GL11.glPushMatrix();
	}

	private void renderItem(EntityClientPlayerMP par1EntityLiving, ItemStack par2ItemStack, int par3) {
		{
			// If you for whatever reason aren't registering icons with
			// iconRegister, I'm assuming you'll need to change the code below.
			Icon icon = par1EntityLiving.getItemIcon(par2ItemStack, par3);
			if (icon == null) {
				GL11.glPopMatrix();
				return;
			}
			textureManager.bindTexture(textureManager.getResourceLocation(par2ItemStack.getItemSpriteNumber()));
			Tessellator tessellator = Tessellator.instance;
			float f = icon.getMinU();
			float f1 = icon.getMaxU();
			float f2 = icon.getMinV();
			float f3 = icon.getMaxV();
			
			GL11.glEnable(GL12.GL_RESCALE_NORMAL);
			
			/*GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
            f11 = (float)par2ItemStack.getMaxItemUseDuration() - ((float)par1EntityLiving.getItemInUseCount() - par3 + 1.0F);
            f13 = f11 / 20.0F;
            f13 = (f13 * f13 + f13 * 2.0F) / 3.0F;

            if (f13 > 1.0F)
            {
                f13 = 1.0F;
            }

            if (f13 > 0.1F)
            {
                GL11.glTranslatef(0.0F, MathHelper.sin((f11 - 0.1F) * 1.3F) * 0.01F * (f13 - 0.1F), 0.0F);
            }

            GL11.glTranslatef(0.0F, 0.0F, f13 * 0.1F);
            GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, 0.5F, 0.0F);
            f14 = 1.0F + f13 * 0.2F;
            GL11.glScalef(1.0F, 1.0F, f14);
            GL11.glTranslatef(0.0F, -0.5F, 0.0F);
            GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);*/
            
			ItemRenderer.renderItemIn2D(tessellator, f1, f2, f, f3, icon.getIconWidth(), icon.getIconHeight(), 0.0625F);
			if (par2ItemStack.hasEffect(par3)) {
				GL11.glDepthFunc(GL11.GL_EQUAL);
				GL11.glDisable(GL11.GL_LIGHTING);
				textureManager.bindTexture(new ResourceLocation("textures/misc/enchanted_item_glint.png"));
				GL11.glEnable(GL11.GL_BLEND);
				GL11.glBlendFunc(GL11.GL_SRC_COLOR, GL11.GL_ONE);
				float f7 = 0.76F;
				GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
				GL11.glMatrixMode(GL11.GL_TEXTURE);
				GL11.glPushMatrix();
				float f8 = 0.125F;
				GL11.glScalef(f8, f8, f8);
				float f9 = (float) (Minecraft.getSystemTime() % 3000L) / 3000.0F * 8.0F;
				GL11.glTranslatef(f9, 0.0F, 0.0F);
				GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
				ItemRenderer.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
				GL11.glPopMatrix();
				GL11.glPushMatrix();
				GL11.glScalef(f8, f8, f8);
				f9 = (float) (Minecraft.getSystemTime() % 4873L) / 4873.0F * 8.0F;
				GL11.glTranslatef(-f9, 0.0F, 0.0F);
				GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
				ItemRenderer.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
				GL11.glPopMatrix();
				GL11.glMatrixMode(GL11.GL_MODELVIEW);
				GL11.glDisable(GL11.GL_BLEND);
				GL11.glEnable(GL11.GL_LIGHTING);
				GL11.glDepthFunc(GL11.GL_LEQUAL);
			}
			GL11.glDisable(GL12.GL_RESCALE_NORMAL);
		}
	}
}