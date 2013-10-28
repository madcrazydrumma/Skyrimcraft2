package net.skyrimcraft.src.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCommonEndTable extends ModelBase
{
	  //fields
	    ModelRenderer tableBodyTopHalf;
	    ModelRenderer leg1;
	    ModelRenderer leg2;
	    ModelRenderer leg3;
	    ModelRenderer leg4;
	    ModelRenderer tableTop;
	    ModelRenderer drawer;
	    ModelRenderer tableBodyBottomHalf;
	    ModelRenderer handle;
	  
	  public ModelCommonEndTable()
	  {
	    textureWidth = 64;
	    textureHeight = 64;
	    
	      tableBodyTopHalf = new ModelRenderer(this, 0, 0);
	      tableBodyTopHalf.addBox(0F, 0F, 0F, 14, 4, 14);
	      tableBodyTopHalf.setRotationPoint(-7F, 8F, -7F);
	      tableBodyTopHalf.setTextureSize(64, 32);
	      tableBodyTopHalf.mirror = true;
	      setRotation(tableBodyTopHalf, 0F, 0F, 0F);
	      leg1 = new ModelRenderer(this, 12, 24);
	      leg1.addBox(0F, 0F, 0F, 2, 16, 2);
	      leg1.setRotationPoint(-8F, 8F, -8F);
	      leg1.setTextureSize(64, 32);
	      leg1.mirror = true;
	      setRotation(leg1, 0F, 0F, 0F);
	      leg2 = new ModelRenderer(this, 12, 24);
	      leg2.addBox(0F, 0F, 0F, 2, 16, 2);
	      leg2.setRotationPoint(6F, 8F, 6F);
	      leg2.setTextureSize(64, 32);
	      leg2.mirror = true;
	      setRotation(leg2, 0F, 0F, 0F);
	      leg3 = new ModelRenderer(this, 12, 24);
	      leg3.addBox(0F, 0F, 0F, 2, 16, 2);
	      leg3.setRotationPoint(-8F, 8F, 6F);
	      leg3.setTextureSize(64, 32);
	      leg3.mirror = true;
	      setRotation(leg3, 0F, 0F, 0F);
	      leg4 = new ModelRenderer(this, 12, 24);
	      leg4.addBox(0F, 0F, 0F, 2, 16, 2);
	      leg4.setRotationPoint(6F, 8F, -8F);
	      leg4.setTextureSize(64, 32);
	      leg4.mirror = true;
	      setRotation(leg4, 0F, 0F, 0F);
	      tableTop = new ModelRenderer(this, 0, 44);
	      tableTop.addBox(0F, 0F, 0F, 18, 1, 18);
	      tableTop.setRotationPoint(-9F, 7F, -9F);
	      tableTop.setTextureSize(64, 32);
	      tableTop.mirror = true;
	      setRotation(tableTop, 0F, 0F, 0F);
	      drawer = new ModelRenderer(this, 0, 0);
	      drawer.addBox(0F, 0F, 0F, 14, 4, 14);
	      drawer.setRotationPoint(-7F, 12F, -7F);
	      drawer.setTextureSize(64, 32);
	      drawer.mirror = true;
	      setRotation(drawer, 0F, 0F, 0F);
	      tableBodyBottomHalf = new ModelRenderer(this, 0, 0);
	      tableBodyBottomHalf.addBox(0F, 0F, 0F, 14, 4, 14);
	      tableBodyBottomHalf.setRotationPoint(-7F, 16F, -7F);
	      tableBodyBottomHalf.setTextureSize(64, 32);
	      tableBodyBottomHalf.mirror = true;
	      setRotation(tableBodyBottomHalf, 0F, 0F, 0F);
	      handle = new ModelRenderer(this, 0, 24);
	      handle.addBox(0F, 0F, 0F, 2, 1, 1);
	      handle.setRotationPoint(-1F, 13.5F, -8F);
	      handle.setTextureSize(64, 32);
	      handle.mirror = true;
	      setRotation(handle, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    tableBodyTopHalf.render(f5);
	    leg1.render(f5);
	    leg2.render(f5);
	    leg3.render(f5);
	    leg4.render(f5);
	    tableTop.render(f5);
	    drawer.render(f5);
	    tableBodyBottomHalf.render(f5);
	    handle.render(f5);
	  }
	  
	  public void renderModel(float f5) {
		tableBodyTopHalf.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		tableTop.render(f5);
		drawer.render(f5);
		tableBodyBottomHalf.render(f5);
		handle.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	  }
}