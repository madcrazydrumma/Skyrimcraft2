package net.skyrimcraft.src.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrate extends ModelBase
{
	// fields
	ModelRenderer Base;
	ModelRenderer Brace1;
	ModelRenderer Brace2;
	ModelRenderer Brace3;

	public ModelCrate() {
		textureWidth = 64;
		textureHeight = 64;

		Base = new ModelRenderer(this, 0, 0);
		Base.addBox(0F, 0F, 0F, 16, 10, 10);
		Base.setRotationPoint(-8F, 13F, -5F);
		Base.setTextureSize(64, 32);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		Brace1 = new ModelRenderer(this, 0, 21);
		Brace1.addBox(0F, 0F, 0F, 1, 12, 12);
		Brace1.setRotationPoint(6F, 12F, -6F);
		Brace1.setTextureSize(64, 32);
		Brace1.mirror = true;
		setRotation(Brace1, 0F, 0F, 0F);
		Brace2 = new ModelRenderer(this, 27, 21);
		Brace2.addBox(0F, 0F, 0F, 2, 12, 12);
		Brace2.setRotationPoint(-1F, 12F, -6F);
		Brace2.setTextureSize(64, 32);
		Brace2.mirror = true;
		setRotation(Brace2, 0F, 0F, 0F);
		Brace3 = new ModelRenderer(this, 0, 21);
		Brace3.addBox(0F, 0F, 0F, 1, 12, 12);
		Brace3.setRotationPoint(-7F, 12F, -6F);
		Brace3.setTextureSize(64, 32);
		Brace3.mirror = true;
		setRotation(Brace3, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Base.render(f5);
		Brace1.render(f5);
		Brace2.render(f5);
		Brace3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}

	public void renderModel(float f5) {
		Base.render(f5);
		Brace1.render(f5);
		Brace2.render(f5);
		Brace3.render(f5);
	}
}