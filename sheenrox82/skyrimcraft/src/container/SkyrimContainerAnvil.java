package sheenrox82.skyrimcraft.src.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import sheenrox82.skyrimcraft.src.gui.recipes.SkyrimAnvilCraftingManager;

public class SkyrimContainerAnvil extends Container
{

	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 5, 5);
	public IInventory craftResult = new InventoryCraftResult();
	private World worldObj;
	private int posX;
	private int posY;
	private int posZ;

	public SkyrimContainerAnvil(InventoryPlayer inventoryplayer, World world, int x, int y, int z)
	{
		worldObj = world;
		posX = x;
		posY = y;
		posZ = z;
		this.addSlotToContainer(new SlotCrafting(inventoryplayer.player, craftMatrix, craftResult, 0, 129, 44));

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				addSlotToContainer(new Slot(craftMatrix, j + i * 5, 42 + j * 18, 17 + i * 18));
			}
		}

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				addSlotToContainer(new Slot(inventoryplayer, j + i * 9 + 9, 8 + j * 18, 102 + i * 18));
			}
		}

		for (int i = 0; i < 9; i++)
		{
			addSlotToContainer(new Slot(inventoryplayer, i, 8 + i * 18, 160));
		}
		
		onCraftMatrixChanged(craftMatrix);
	}

	public void onCraftMatrixChanged(IInventory iinventory)
	{
		craftResult.setInventorySlotContents(0, SkyrimAnvilCraftingManager.getInstance().findMatchingRecipe(craftMatrix, worldObj));
	}

	public void onContainerClosed(EntityPlayer entityplayer)
	{
		super.onContainerClosed(entityplayer);
		if(worldObj.isRemote)
		{
			return;
		}
		for(int i = 0; i < 12; i++)
		{
			ItemStack itemstack = craftMatrix.getStackInSlot(i);
			if(itemstack != null)
			{
				entityplayer.dropPlayerItem(itemstack);
			}
		}

	}

	public boolean canInteractWith(EntityPlayer entityplayer)
	{
		/**if(worldObj.getBlockId(posX, posY, posZ) != Blocks.anvil.blockID)
		{
			return false;
		} else
		{
			return entityplayer.getDistanceSq((double)posX + 0.5D, (double)posY + 0.5D, (double)posZ + 0.5D) <= 64D;
		}**/
		return true;
	}

	public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
	{
		ItemStack itemstack = null;
		Slot slot = (Slot)inventorySlots.get(par2);
		if(slot != null && slot.getHasStack())
		{
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();
			if(par2 == 0)
			{
				if(!mergeItemStack(itemstack1, 10, 46, true))
				{
					return null;
				}
			} else
				if(par2 >= 10 && par2 < 37)
				{
					if(!mergeItemStack(itemstack1, 37, 46, false))
					{
						return null;
					}
				} else
					if(par2 >= 37 && par2 < 46)
					{
						if(!mergeItemStack(itemstack1, 10, 37, false))
						{
							return null;
						}
					} else
						if(!mergeItemStack(itemstack1, 10, 46, false))
						{
							return null;
						}
			if(itemstack1.stackSize == 0)
			{
				slot.putStack(null);
			} else
			{
				slot.onSlotChanged();
			}
			if(itemstack1.stackSize != itemstack.stackSize)
			{
				slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
			} else
			{
				return null;
			}
		}
		return itemstack;
	}
}