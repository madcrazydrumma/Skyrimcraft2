package net.skyrimcraft.src.model.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DragonbornHelmet extends ModelBiped
{
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;

	public DragonbornHelmet(float f) {
		super(f, 0, 64, 64);
		
		Shape1 = new ModelRenderer(this, 33, 5);
		Shape1.addBox(-4F, -9F, -4F, 8, 1, 8);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(64, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		
		Shape2 = new ModelRenderer(this, 20, 33);
		Shape2.addBox(-4F, -8F, 4F, 8, 7, 1);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		
		Shape3 = new ModelRenderer(this, 0, 33);
		Shape3.addBox(-5F, -8F, -4F, 1, 7, 8);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(64, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		
		Shape4 = new ModelRenderer(this, 0, 33);
		Shape4.addBox(4F, -8F, -4F, 1, 7, 8);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(64, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		
		Shape5 = new ModelRenderer(this, 20, 43);
		Shape5.addBox(-2F, -1F, 4F, 4, 1, 1);
		Shape5.setRotationPoint(0F, 0F, 0F);
		Shape5.setTextureSize(64, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		
		Shape6 = new ModelRenderer(this, 33, 0);
		Shape6.addBox(-4F, -8F, -5F, 8, 3, 1);
		Shape6.setRotationPoint(0F, 0F, 0F);
		Shape6.setTextureSize(64, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		
		Shape7 = new ModelRenderer(this, 58, 16);
		Shape7.addBox(-4F, -5F, -5F, 1, 4, 1);
		Shape7.setRotationPoint(0F, 0F, 0F);
		Shape7.setTextureSize(64, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		
		Shape8 = new ModelRenderer(this, 58, 16);
		Shape8.addBox(3F, -5F, -5F, 1, 4, 1);
		Shape8.setRotationPoint(0F, 0F, 0F);
		Shape8.setTextureSize(64, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		
		Shape9 = new ModelRenderer(this, 58, 22);
		Shape9.addBox(-1F, -5F, -5F, 2, 2, 1);
		Shape9.setRotationPoint(0F, 0F, 0F);
		Shape9.setTextureSize(64, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		
		Shape10 = new ModelRenderer(this, 48, 34);
		Shape10.addBox(-3F, -3F, -5F, 6, 1, 1);
		Shape10.setRotationPoint(0F, 0F, 0F);
		Shape10.setTextureSize(64, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		
		Shape11 = new ModelRenderer(this, 0, 50);
		Shape11.addBox(-7F, -6.5F, -1F, 2, 2, 2);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(64, 64);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		
		Shape12 = new ModelRenderer(this, 0, 50);
		Shape12.addBox(5F, -6.5F, -1F, 2, 2, 2);
		Shape12.setRotationPoint(0F, 0F, 0F);
		Shape12.setTextureSize(64, 64);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		
		Shape13 = new ModelRenderer(this, 0, 50);
		Shape13.addBox(-9F, -6F, -1F, 2, 2, 2);
		Shape13.setRotationPoint(0F, 0F, 0F);
		Shape13.setTextureSize(64, 64);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		
		Shape14 = new ModelRenderer(this, 0, 50);
		Shape14.addBox(-9F, -5F, -2F, 2, 2, 2);
		Shape14.setRotationPoint(0F, 0F, 0F);
		Shape14.setTextureSize(64, 64);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		
		Shape15 = new ModelRenderer(this, 0, 50);
		Shape15.addBox(7F, -6F, -1F, 2, 2, 2);
		Shape15.setRotationPoint(0F, 0F, 0F);
		Shape15.setTextureSize(64, 64);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		
		Shape16 = new ModelRenderer(this, 0, 50);
		Shape16.addBox(7F, -5F, -2F, 2, 2, 2);
		Shape16.setRotationPoint(0F, 0F, 0F);
		Shape16.setTextureSize(64, 64);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		
		Shape17 = new ModelRenderer(this, 0, 56);
		Shape17.addBox(-8.5F, -4.5F, -3F, 1, 1, 1);
		Shape17.setRotationPoint(0F, 0F, 0F);
		Shape17.setTextureSize(64, 64);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		
		Shape18 = new ModelRenderer(this, 0, 56);
		Shape18.addBox(7.5F, -4.5F, -3F, 1, 1, 1);
		Shape18.setRotationPoint(0F, 0F, 0F);
		Shape18.setTextureSize(64, 64);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		
		this.bipedHead.addChild(Shape1);
		this.bipedHead.addChild(Shape2);
		this.bipedHead.addChild(Shape3);
		this.bipedHead.addChild(Shape4);
		this.bipedHead.addChild(Shape5);
		this.bipedHead.addChild(Shape6);
		this.bipedHead.addChild(Shape7);
		this.bipedHead.addChild(Shape8);
		this.bipedHead.addChild(Shape9);
		this.bipedHead.addChild(Shape10);
		this.bipedHead.addChild(Shape11);
		this.bipedHead.addChild(Shape12);
		this.bipedHead.addChild(Shape13);
		this.bipedHead.addChild(Shape14);
		this.bipedHead.addChild(Shape15);
		this.bipedHead.addChild(Shape16);
		this.bipedHead.addChild(Shape17);
		this.bipedHead.addChild(Shape18);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}
}