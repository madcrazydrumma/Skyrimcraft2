package net.skyrimcraft.src.item;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.base.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkyrimArmor extends ItemArmor {
	String fileName;

	public SkyrimArmor(int par1, EnumArmorMaterial par2, int par3, int par4,
			String par5) {
		super(par1 - 256, par2, par3, par4);
		fileName = par5;
		setCreativeTab(SkyrimcraftII.tab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.toString().contains("Leggings")) {
			return Util.MOD_ID + ":" + "textures/armor/" + fileName + "_2.png";
		}

		return Util.MOD_ID + ":" + "textures/armor/" + fileName + "_1.png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
		ModelBiped armorModel = null;

		if (itemStack != null) {
			if (itemStack.getItem() instanceof SkyrimArmor) {
				int type = ((ItemArmor) itemStack.getItem()).armorType;

				if (type == 1 || type == 3) {
					armorModel = SkyrimcraftII.proxy.getArmorModel(0);
				} else {
					armorModel = SkyrimcraftII.proxy.getArmorModel(1);
				}
			}
			if (armorModel != null) {
				armorModel.bipedHead.showModel = armorSlot == 0;
				armorModel.bipedHeadwear.showModel = armorSlot == 0;
				armorModel.bipedBody.showModel = armorSlot == 1
						|| armorSlot == 2;
				armorModel.bipedRightArm.showModel = armorSlot == 1;
				armorModel.bipedLeftArm.showModel = armorSlot == 1;
				armorModel.bipedRightLeg.showModel = armorSlot == 2
						|| armorSlot == 3;
				armorModel.bipedLeftLeg.showModel = armorSlot == 2
						|| armorSlot == 3;

				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getCurrentItemOrArmor(0) != null ? 1 : 0;
				if (entityLiving instanceof EntityPlayer) {
					armorModel.aimedBow = ((EntityPlayer) entityLiving).getItemInUseDuration() > 2;
				}
				return armorModel;
			}
		}

		return null;
	}

	public void registerIcons(IconRegister i) {
		this.itemIcon = i.registerIcon(Util.MOD_ID + ":" + this.getName());
	}

	public String getName() {
		return this.unlocalizedName;
	}
}