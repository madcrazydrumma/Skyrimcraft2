package net.skyrimcraft.src.entity;

import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.world.World;

public class EntitySalmon extends EntityWaterMob
{
	public EntitySalmon(World par1World) {
		super(par1World);
	}
	
    protected String getLivingSound()
    {
        return null;
    }
    
    protected String getHurtSound()
    {
        return null;
    }
    
    protected String getDeathSound()
    {
        return null;
    }
    
    protected float getSoundVolume()
    {
        return 0.4F;
    }
    
    protected int getDropItemId()
    {
        return 0; //drops salmon meat - can be cooked to give salmon steak
        //also give chance of getting salmon roe
    }
    
    protected boolean canTriggerWalking()
    {
        return false;
    }
    
    public boolean isInWater()
    {
        return this.worldObj.handleMaterialAcceleration(this.boundingBox.expand(0.0D, -0.6000000238418579D, 0.0D), Material.water, this);
    }
    
    public void moveEntityWithHeading(float par1, float par2)
    {
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
    }
}