package net.skyrimcraft.src.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityImperialGuard extends EntityCreature
{
	public EntityImperialGuard(World par1World) {
		super(par1World);
		setSize(1.0F, 1.75F);
	}
	
	@Override
	protected void func_110147_ax() {
		super.func_110147_ax();
	
		func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.75); //moveSpeed
		func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(10); //maxHealth
	}
}