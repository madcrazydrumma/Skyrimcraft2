package net.skyrimcraft.src.gui.recipes;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class AnvilRecipeSorter implements Comparator
{
	final SkyrimAnvilCraftingManager betterCraftingManager;

	public AnvilRecipeSorter(SkyrimAnvilCraftingManager par1BetterCraftingManager)
	{
		this.betterCraftingManager = par1BetterCraftingManager;
	}

	public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
	{
		return par1IRecipe instanceof AnvilShapelessRecipes && par2IRecipe instanceof AnvilShapedRecipes ? 1 : (par2IRecipe instanceof AnvilShapelessRecipes && par1IRecipe instanceof AnvilShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
	}

	public int compare(Object par1Obj, Object par2Obj)
	{
		return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
	}
}