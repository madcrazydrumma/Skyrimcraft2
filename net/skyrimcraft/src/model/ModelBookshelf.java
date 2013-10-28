package net.skyrimcraft.src.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBookshelf extends ModelBase {
	// fields
	ModelRenderer Top;
	ModelRenderer Left_Side;
	ModelRenderer Right_Side;
	ModelRenderer Backboard;
	ModelRenderer Top_Shelf;
	ModelRenderer Middle_Shelf;
	ModelRenderer Bottom_Shelf;
	ModelRenderer Slab1;
	ModelRenderer Slab2;
	ModelRenderer Slab5;
	ModelRenderer Slab6;
	ModelRenderer Slab3;
	ModelRenderer Slab4;
	ModelRenderer Slab7;
	ModelRenderer Slab8;

	public ModelBookshelf() {
		textureWidth = 64;
		textureHeight = 64;

		Top = new ModelRenderer(this, 0, 0);
		Top.addBox(0F, 0F, 0F, 16, 2, 8);
		Top.setRotationPoint(-8F, -8F, 0F);
		Top.setTextureSize(64, 32);
		Top.mirror = true;
		setRotation(Top, 0F, 0F, 0F);
		Left_Side = new ModelRenderer(this, 0, 20);
		Left_Side.addBox(0F, 0F, 0F, 1, 30, 8);
		Left_Side.setRotationPoint(-8F, -6F, 0F);
		Left_Side.setTextureSize(64, 32);
		Left_Side.mirror = true;
		setRotation(Left_Side, 0F, 0F, 0F);
		Right_Side = new ModelRenderer(this, 0, 20);
		Right_Side.addBox(0F, 0F, 0F, 1, 30, 8);
		Right_Side.setRotationPoint(7F, -6F, 0F);
		Right_Side.setTextureSize(64, 32);
		Right_Side.mirror = true;
		setRotation(Right_Side, 0F, 0F, 0F);
		Backboard = new ModelRenderer(this, 20, 20);
		Backboard.addBox(0F, 0F, 0F, 14, 30, 1);
		Backboard.setRotationPoint(-7F, -6F, 7F);
		Backboard.setTextureSize(64, 32);
		Backboard.mirror = true;
		setRotation(Backboard, 0F, 0F, 0F);
		Top_Shelf = new ModelRenderer(this, 0, 11);
		Top_Shelf.addBox(0F, 0F, 0F, 14, 1, 7);
		Top_Shelf.setRotationPoint(-7F, 1F, 0F);
		Top_Shelf.setTextureSize(64, 32);
		Top_Shelf.mirror = true;
		setRotation(Top_Shelf, 0F, 0F, 0F);
		Middle_Shelf = new ModelRenderer(this, 0, 11);
		Middle_Shelf.addBox(0F, 0F, 0F, 14, 1, 7);
		Middle_Shelf.setRotationPoint(-7F, 10F, 0F);
		Middle_Shelf.setTextureSize(64, 32);
		Middle_Shelf.mirror = true;
		setRotation(Middle_Shelf, 0F, 0F, 0F);
		Bottom_Shelf = new ModelRenderer(this, 0, 11);
		Bottom_Shelf.addBox(0F, 0F, 0F, 14, 1, 7);
		Bottom_Shelf.setRotationPoint(-7F, 19F, 0F);
		Bottom_Shelf.setTextureSize(64, 32);
		Bottom_Shelf.mirror = true;
		setRotation(Bottom_Shelf, 0F, 0F, 0F);
		Slab1 = new ModelRenderer(this, 20, 52);
		Slab1.addBox(0F, 0F, 0F, 2, 4, 1);
		Slab1.setRotationPoint(-7F, 20F, 0F);
		Slab1.setTextureSize(64, 32);
		Slab1.mirror = true;
		setRotation(Slab1, 0F, 0F, 0F);
		Slab2 = new ModelRenderer(this, 20, 52);
		Slab2.addBox(0F, 0F, 0F, 2, 4, 1);
		Slab2.setRotationPoint(5F, 20F, 0F);
		Slab2.setTextureSize(64, 32);
		Slab2.mirror = true;
		setRotation(Slab2, 0F, 0F, 0F);
		Slab5 = new ModelRenderer(this, 27, 52);
		Slab5.addBox(0F, 0F, 0F, 1, 3, 1);
		Slab5.setRotationPoint(-5F, 20F, 0F);
		Slab5.setTextureSize(64, 32);
		Slab5.mirror = true;
		setRotation(Slab5, 0F, 0F, 0F);
		Slab6 = new ModelRenderer(this, 27, 52);
		Slab6.addBox(0F, 0F, 0F, 1, 3, 1);
		Slab6.setRotationPoint(4F, 20F, 0F);
		Slab6.setTextureSize(64, 32);
		Slab6.mirror = true;
		setRotation(Slab6, 0F, 0F, 0F);
		Slab3 = new ModelRenderer(this, 32, 52);
		Slab3.addBox(0F, 0F, 0F, 1, 2, 1);
		Slab3.setRotationPoint(3F, 20F, 0F);
		Slab3.setTextureSize(64, 32);
		Slab3.mirror = true;
		setRotation(Slab3, 0F, 0F, 0F);
		Slab4 = new ModelRenderer(this, 32, 52);
		Slab4.addBox(0F, 0F, 0F, 1, 2, 1);
		Slab4.setRotationPoint(-4F, 20F, 0F);
		Slab4.setTextureSize(64, 32);
		Slab4.mirror = true;
		setRotation(Slab4, 0F, 0F, 0F);
		Slab7 = new ModelRenderer(this, 37, 52);
		Slab7.addBox(0F, 0F, 0F, 1, 1, 1);
		Slab7.setRotationPoint(2F, 20F, 0F);
		Slab7.setTextureSize(64, 32);
		Slab7.mirror = true;
		setRotation(Slab7, 0F, 0F, 0F);
		Slab8 = new ModelRenderer(this, 37, 52);
		Slab8.addBox(0F, 0F, 0F, 1, 1, 1);
		Slab8.setRotationPoint(-3F, 20F, 0F);
		Slab8.setTextureSize(64, 32);
		Slab8.mirror = true;
		setRotation(Slab8, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Top.render(f5);
		Left_Side.render(f5);
		Right_Side.render(f5);
		Backboard.render(f5);
		Top_Shelf.render(f5);
		Middle_Shelf.render(f5);
		Bottom_Shelf.render(f5);
		Slab1.render(f5);
		Slab2.render(f5);
		Slab5.render(f5);
		Slab6.render(f5);
		Slab3.render(f5);
		Slab4.render(f5);
		Slab7.render(f5);
		Slab8.render(f5);
	}
	
	public void renderModel(float f5) {
		Top.render(f5);
		Left_Side.render(f5);
		Right_Side.render(f5);
		Backboard.render(f5);
		Top_Shelf.render(f5);
		Middle_Shelf.render(f5);
		Bottom_Shelf.render(f5);
		Slab1.render(f5);
		Slab2.render(f5);
		Slab5.render(f5);
		Slab6.render(f5);
		Slab3.render(f5);
		Slab4.render(f5);
		Slab7.render(f5);
		Slab8.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}