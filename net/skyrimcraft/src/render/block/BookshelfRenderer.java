package net.skyrimcraft.src.render.block;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.skyrimcraft.src.model.ModelBookshelf;
import net.skyrimcraft.src.tileentity.TileEntityBookshelf;

import org.lwjgl.opengl.GL11;

public class BookshelfRenderer extends TileEntitySpecialRenderer
{
	public BookshelfRenderer()
    {
            aModel = new ModelBookshelf();
    }

    public void renderAModelAt(TileEntityBookshelf tileentity1, double d, double d1, double d2, float f)
    {  
            GL11.glPushMatrix();
            GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.52F, (float)d2 + 0.5F);
            GL11.glRotatef(180F, 0F, 0F, 1F);
            bindTexture(new ResourceLocation("skyrimcraftii", "textures/tileentity/bookshelf.png"));
            GL11.glPushMatrix();
            aModel.renderModel(0.0625F);
            GL11.glPopMatrix();     
            GL11.glPopMatrix();                                     
    }
    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2,
                    float f)
    {
            renderAModelAt((TileEntityBookshelf)tileentity, d, d1, d2, f);
    }
    private ModelBookshelf aModel;
}