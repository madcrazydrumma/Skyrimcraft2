package net.skyrimcraft.src.gui.recipes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class SkyrimAnvilCraftingManager
{
	public String[] pickaxe = new String[] {"XXX", " ! ", " ! ", " ! "};
	public String[] sword = new String[] {" X ", " X ", "XXX", " ! ",};
	public String[] shovel = new String[] {"X", "!", "!", "!"};
	public String[] axe = new String[] {"XX", "X!", " !", " !"};
	public String[] dagger = new String[] {"X", "!"};
	
	public String[] helmet = new String[] {"XXX", "X X"};
	public String[] chestplate = new String[] {"X X", "XXX", "XXX"};
	public String[] leggings = new String[] {"XXX", "X X", "X X"};
	public String[] boots = new String[] {"X X", "X X"};
	public String[] shield = { "X X", "XXX", " X " };
	
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	private static final SkyrimAnvilCraftingManager instance = new SkyrimAnvilCraftingManager();
	private List recipes = new ArrayList();

	public static final SkyrimAnvilCraftingManager getInstance()
	{
		return instance;
	}

	private SkyrimAnvilCraftingManager()
	{
		recipes = new ArrayList();
		
    	//DAEDRIC
		/**this.addRecipe(new ItemStack(SkyrimWeapons.daedricSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.daedricDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.daedricWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.daedricWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.daedricMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.daedricArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.ebonyIngot, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.daedricBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), SkyrimIngredients.daedraHeart, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.daedricGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.daedricBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimIngredients.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });

    	//EBONY
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonySword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonyDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonyWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonyWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonyMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonyArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.ebonyIngot, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonyBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonyGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ebonyBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });

    	//DWARVEN
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.dwarvenIngot, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dwarvenBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });

    	//ELVEN
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.moonstoneIngot, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.elvenBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });

    	//GLASS
        this.addRecipe(new ItemStack(SkyrimWeapons.glassSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.glassDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.glassWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.glassWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.glassMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.glassArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.malmoonIngot, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.glassBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.glassGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.glassBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });

    	//IRON
        this.addRecipe(new ItemStack(SkyrimWeapons.ironSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ironDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ironWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ironWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ironMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ironArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), Item.ingotIron, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.ironGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.ironBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });

    	//STEEL
        this.addRecipe(new ItemStack(SkyrimWeapons.steelSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.steelDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.steelWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.steelWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.steelMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.steelArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.steelIngot, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.steelGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.steelBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });

    	//ORCISH
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.orichalcumIngot, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.orcishBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });

    	//DRAGONBONE
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.ebonyIngot, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimWeapons.dragonBoneBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrip, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        **/
		Collections.sort(this.recipes, new AnvilRecipeSorter(this));
		System.out.println(this.recipes.size() + " recipes");
	}

	public AnvilShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		String var3 = "";
		int var4 = 0;
		int var5 = 0;
		int var6 = 0;

		if (par2ArrayOfObj[var4] instanceof String[])
		{
			String[] var7 = (String[])((String[])par2ArrayOfObj[var4++]);

			for (int var8 = 0; var8 < var7.length; ++var8)
			{
				String var9 = var7[var8];
				++var6;
				var5 = var9.length();
				var3 = var3 + var9;
			}
		}
		else
		{
			while (par2ArrayOfObj[var4] instanceof String)
			{
				String var11 = (String)par2ArrayOfObj[var4++];
				++var6;
				var5 = var11.length();
				var3 = var3 + var11;
			}
		}

		HashMap var12;

		for (var12 = new HashMap(); var4 < par2ArrayOfObj.length; var4 += 2)
		{
			Character var13 = (Character)par2ArrayOfObj[var4];
			ItemStack var14 = null;

			if (par2ArrayOfObj[var4 + 1] instanceof Item)
			{
				var14 = new ItemStack((Item)par2ArrayOfObj[var4 + 1]);
			}
			else if (par2ArrayOfObj[var4 + 1] instanceof Block)
			{
				var14 = new ItemStack((Block)par2ArrayOfObj[var4 + 1], 1, -1);
			}
			else if (par2ArrayOfObj[var4 + 1] instanceof ItemStack)
			{
				var14 = (ItemStack)par2ArrayOfObj[var4 + 1];
			}

			var12.put(var13, var14);
		}

		ItemStack[] var15 = new ItemStack[var5 * var6];

		for (int var16 = 0; var16 < var5 * var6; ++var16)
		{
			char var10 = var3.charAt(var16);

			if (var12.containsKey(Character.valueOf(var10)))
			{
				var15[var16] = ((ItemStack)var12.get(Character.valueOf(var10))).copy();
			}
			else
			{
				var15[var16] = null;
			}
		}

		AnvilShapedRecipes var17 = new AnvilShapedRecipes(var5, var6, var15, par1ItemStack);
		this.recipes.add(var17);
		return var17;
	}

	public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
		ArrayList var3 = new ArrayList();
		Object[] var4 = par2ArrayOfObj;
		int var5 = par2ArrayOfObj.length;

		for (int var6 = 0; var6 < var5; ++var6)
		{
			Object var7 = var4[var6];

			if (var7 instanceof ItemStack)
			{
				var3.add(((ItemStack)var7).copy());
			}
			else if (var7 instanceof Item)
			{
				var3.add(new ItemStack((Item)var7));
			}
			else
			{
				if (!(var7 instanceof Block))
				{
					throw new RuntimeException("Invalid shapeless recipe!");
				}

				var3.add(new ItemStack((Block)var7));
			}
		}

		this.recipes.add(new AnvilShapelessRecipes(par1ItemStack, var3));
	}

	public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
	{
		int var3 = 0;
		ItemStack var4 = null;
		ItemStack var5 = null;
		int var6;

		for (var6 = 0; var6 < par1InventoryCrafting.getSizeInventory(); ++var6)
		{
			ItemStack var7 = par1InventoryCrafting.getStackInSlot(var6);

			if (var7 != null)
			{
				if (var3 == 0)
				{
					var4 = var7;
				}

				if (var3 == 1)
				{
					var5 = var7;
				}

				++var3;
			}
		}

		if (var3 == 2 && var4.itemID == var5.itemID && var4.stackSize == 1 && var5.stackSize == 1 && Item.itemsList[var4.itemID].isRepairable())
		{
			Item var11 = Item.itemsList[var4.itemID];
			int var13 = var11.getMaxDamage() - var4.getItemDamageForDisplay();
			int var8 = var11.getMaxDamage() - var5.getItemDamageForDisplay();
			int var9 = var13 + var8 + var11.getMaxDamage() * 5 / 100;
			int var10 = var11.getMaxDamage() - var9;

			if (var10 < 0)
			{
				var10 = 0;
			}

			return new ItemStack(var4.itemID, 1, var10);
		}
		else
		{
			for (var6 = 0; var6 < this.recipes.size(); ++var6)
			{
				IRecipe var12 = (IRecipe)this.recipes.get(var6);

				if (var12.matches(par1InventoryCrafting, par2World))
				{
					return var12.getCraftingResult(par1InventoryCrafting);
				}
			}

			return null;
		}
	}

	/**
	 * returns the List<> of all recipes
	 */
	public List getRecipeList()
	{
		return this.recipes;
	}
}