package net.skyrimcraft.src.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.base.Util;
import net.skyrimcraft.src.content.SkyrimItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkyrimBow extends ItemBow
{
	public static final String[] daedricBow = new String[] {Util.MOD_ID + ":" + "daedricBow1", Util.MOD_ID + ":" + "daedricBow2", Util.MOD_ID + ":" + "daedricBow3"};
	public static final String[] ebonyBow = new String[] {Util.MOD_ID + ":" + "ebonyBow1", Util.MOD_ID + ":" + "ebonyBow2", Util.MOD_ID + ":" + "ebonyBow3"};
	public static final String[] glassBow = new String[] {Util.MOD_ID + ":" + "glassBow1", Util.MOD_ID + ":" + "glassBow2", Util.MOD_ID + ":" + "glassBow3"};
	public static final String[] orcishBow = new String[] {Util.MOD_ID + ":" + "orcishBow1", Util.MOD_ID + ":" + "orcishBow2", Util.MOD_ID + ":" + "orcishBow3"};
	public static final String[] elvenBow = new String[] {Util.MOD_ID + ":" + "elvenBow1", Util.MOD_ID + ":" + "elvenBow2", Util.MOD_ID + ":" + "elvenBow3"};
	public static final String[] ancientNordBow = new String[] {Util.MOD_ID + ":" + "ancientNordBow1", Util.MOD_ID + ":" + "ancientNordBow2", Util.MOD_ID + ":" + "ancientNordBow3"};
	public static final String[] dwarvenBow = new String[] {Util.MOD_ID + ":" + "dwarvenBow1", Util.MOD_ID + ":" + "dwarvenBow2", Util.MOD_ID + ":" + "dwarvenBow3"};
	public static final String[] dragonBoneBow = new String[] {Util.MOD_ID + ":" + "dragonBoneBow1", Util.MOD_ID + ":" + "dragonBoneBow2", Util.MOD_ID + ":" + "dragonBoneBow3"};
	public static final String[] longBow = new String[] {Util.MOD_ID + ":" + "longBow1", Util.MOD_ID + ":" + "longBow2", Util.MOD_ID + ":" + "longBow3"};
	
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public SkyrimBow(int par1)
	{
		super(par1 - 256);
		this.maxStackSize = 1;
		this.setMaxDamage(1000);
		this.setCreativeTab(SkyrimcraftII.tab);
	}
	
	@SideOnly(Side.CLIENT)
    public boolean isFull3D() {
    	return true;
    }

	/**
	 * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
	 */
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	{
		int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

		ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return;
		}
		j = event.charge;

		boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

		if (flag || par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))
		{
			float f = (float)j / 20.0F;
			f = (f * f + f * 2.0F) / 3.0F;

			if ((double)f < 0.1D)
			{
				return;
			}

			if (f > 1.0F)
			{
				f = 1.0F;
			}

			EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F);

			if (f == 1.0F)
			{
				entityarrow.setIsCritical(true);
			}

			int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

			if (k > 0)
			{
				entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
			}

			int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

			if (l > 0)
			{
				entityarrow.setKnockbackStrength(l);
			}

			if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
			{
				entityarrow.setFire(100);
			}

			par1ItemStack.damageItem(1, par3EntityPlayer);
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

			if (flag)
			{
				entityarrow.canBePickedUp = 2;
			}
			else
			{
				par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.itemID);
			}

			if (!par2World.isRemote)
			{
				par2World.spawnEntityInWorld(entityarrow);
			}
		}
	}

	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		return par1ItemStack;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 72000;
	}

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.bow;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
		{
			return event.result;
		}

		if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))
		{
			par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		}

		return par1ItemStack;
	}

	/**
	 * Return the enchantability factor of the item, most of the time is based on material.
	 */
	public int getItemEnchantability()
	{
		return 1;
	}


	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + this.getName());
		
		if(itemID == SkyrimItems.daedricBow.itemID) 
		{
			this.iconArray = new Icon[daedricBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(daedricBow[i]);
			}
		}
		
		if(itemID == SkyrimItems.ebonyBow.itemID) 
		{
			this.iconArray = new Icon[ebonyBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(ebonyBow[i]);
			}
		}
		
		if(itemID == SkyrimItems.glassBow.itemID) 
		{
			this.iconArray = new Icon[glassBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(glassBow[i]);
			}
		}
		
		if(itemID == SkyrimItems.elvenBow.itemID) 
		{
			this.iconArray = new Icon[elvenBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(elvenBow[i]);
			}
		}
		
		if(itemID == SkyrimItems.orcishBow.itemID) 
		{
			this.iconArray = new Icon[orcishBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(orcishBow[i]);
			}
		}
		
		if(itemID == SkyrimItems.dragonBoneBow.itemID) 
		{
			this.iconArray = new Icon[dragonBoneBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(dragonBoneBow[i]);
			}
		}
		
		if(itemID == SkyrimItems.dwarvenBow.itemID) 
		{
			this.iconArray = new Icon[dwarvenBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(dwarvenBow[i]);
			}
		}
		
		if(itemID == SkyrimItems.ancientNordBow.itemID) 
		{
			this.iconArray = new Icon[ancientNordBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(ancientNordBow[i]);
			}
		}
		
		if(itemID == SkyrimItems.longbow.itemID) 
		{
			this.iconArray = new Icon[longBow.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(longBow[i]);
			}
		}
	}

	@Override
	public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
	{
		if(player.getItemInUse() == null) return this.itemIcon;
		int var4 = stack.getMaxItemUseDuration() - useRemaining;
		if (var4 > 18)
		{
			return iconArray[2];
		}
		else if (var4 > 13)
		{
			return iconArray[1];
		}
		else if (var4 > 0)
		{
			return iconArray[0];
		}

		return iconArray[0];
	}

	public String getName()
	{
		return this.unlocalizedName;
	}

	public Icon getItemIconForUseDuration(int par1)
	{
		return this.iconArray[par1];
	}
}
