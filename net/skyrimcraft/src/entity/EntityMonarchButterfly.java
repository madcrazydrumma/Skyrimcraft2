package net.skyrimcraft.src.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityMonarchButterfly extends EntityCreature
{
	public EntityMonarchButterfly(World par1World) {
		super(par1World);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
	}
	
	public boolean isAIEnabled()
    {
        return true;
    }
	
	protected int getDropItemId()
    {
        return Item.leather.itemID; //change to butterfly wing x2
    }
}