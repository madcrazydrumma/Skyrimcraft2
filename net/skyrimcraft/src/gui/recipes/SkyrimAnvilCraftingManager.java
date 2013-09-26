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
import net.skyrimcraft.src.content.SkyrimItems;

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
		
		this.addRecipe(new ItemStack(SkyrimItems.leatherStrips, 2), new Object[] {
			"   ", " # ", "   ", Character.valueOf('#'), Item.leather
		});
		
    	//DAEDRIC
		this.addRecipe(new ItemStack(SkyrimItems.daedricSword, 1), new Object[] {
        	" F ", " F ", "#!#", " F ", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.daedricDagger, 1), new Object[] {
        	" F ", "#!#", " F ", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.daedricWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.daedricWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.daedricMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.daedricArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.ebonyIngot, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.daedricBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), SkyrimItems.daedraHeart, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.daedricGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.daedricBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.daedraHeart, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });

    	//EBONY
        this.addRecipe(new ItemStack(SkyrimItems.ebonySword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.ebonyDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.ebonyWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.ebonyWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.ebonyMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.ebonyArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.ebonyIngot, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.ebonyBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.ebonyGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.ebonyBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.ebonyIngot
        });

    	//DWARVEN
        /**this.addRecipe(new ItemStack(SkyrimItems.dwarvenSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.dwarvenDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.dwarvenWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.dwarvenWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.dwarvenMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.dwarvenArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.dwarvenIngot, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.dwarvenBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.dwarvenGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.dwarvenBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.dwarvenIngot
        });

    	//ELVEN
        this.addRecipe(new ItemStack(SkyrimItems.elvenSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.elvenDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.elvenWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.elvenWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.elvenMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.elvenArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.moonstoneIngot, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.elvenBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.elvenGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.elvenBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.moonstoneIngot
        });

    	//GLASS
        this.addRecipe(new ItemStack(SkyrimItems.glassSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.glassDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.glassWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.glassWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.glassMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.glassArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.malmoonIngot, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.glassBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.glassGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.glassBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), SkyrimItems.malmoonIngot
        });

    	//IRON
        this.addRecipe(new ItemStack(SkyrimItems.ironSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimItems.ironDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimItems.ironWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimItems.ironWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimItems.ironMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimItems.ironArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), Item.ingotIron, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.ironGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });
        this.addRecipe(new ItemStack(SkyrimItems.ironBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.stick, Character.valueOf('F'), Item.ingotIron
        });

    	//STEEL
        this.addRecipe(new ItemStack(SkyrimItems.steelSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.steelDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.steelWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.steelWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.steelMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.steelArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.steelIngot, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.steelGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.steelBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.steelIngot
        });

    	//ORCISH
        this.addRecipe(new ItemStack(SkyrimItems.orcishSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.orcishDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.orcishWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.orcishWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.orcishMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.orcishArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.orichalcumIngot, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.orcishBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.orcishGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });
        this.addRecipe(new ItemStack(SkyrimItems.orcishBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), Item.ingotIron, Character.valueOf('F'), SkyrimItems.orichalcumIngot
        });

    	//DRAGONBONE
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneSword, 1), new Object[] {
        	" F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneDagger, 1), new Object[] {
        	" F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneWarhammer, 1), new Object[] {
        	"FFF", "FFF", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneWaraxe, 1), new Object[] {
        	"FFF", "F!F", " ! ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneMace, 1), new Object[] {
        	"FFF", " F ", " F ", "#!#", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneArrow, 24), new Object[] {
    		"#", "!", "F", Character.valueOf('#'), SkyrimItems.ebonyIngot, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), Block.wood
    	});
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneBow, 1), new Object[] {
        	" F#", "F #", "F #", " F#", Character.valueOf('#'), Item.silk, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneGreatsword, 1), new Object[] {
        	" F ", " F ", "F!F", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
        });
        this.addRecipe(new ItemStack(SkyrimItems.dragonBoneBattleaxe, 1), new Object[] {
        	"FFF", "FF ", " ! ", "###", Character.valueOf('#'), SkyrimItems.leatherStrips, Character.valueOf('!'), SkyrimItems.ebonyIngot, Character.valueOf('F'), SkyrimItems.dragonBone
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