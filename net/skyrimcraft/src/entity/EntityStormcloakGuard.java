package net.skyrimcraft.src.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityStormcloakGuard extends EntityCreature
{
	public EntityStormcloakGuard(World par1World) {
		super(par1World);
		setSize(1.0F, 1.75F);
		//if player's faction is imperial, attack...
	}
	
	public ItemStack getHeldItem()
    {
		return defaultHeldItem;
    }
	
	private static final ItemStack defaultHeldItem;
	
	static 
	{
		defaultHeldItem = new ItemStack(Item.swordStone, 1); //holds iron/steel weapons
	}
}