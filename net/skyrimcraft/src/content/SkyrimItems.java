package net.skyrimcraft.src.content;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import net.skyrimcraft.src.base.Config;
import net.skyrimcraft.src.base.SkyrimRegistry;
import net.skyrimcraft.src.item.SkyrimArrow;
import net.skyrimcraft.src.item.SkyrimBow;
import net.skyrimcraft.src.item.SkyrimFood;
import net.skyrimcraft.src.item.SkyrimItem;
import net.skyrimcraft.src.item.SkyrimTwoHanded;
import net.skyrimcraft.src.item.SkyrimWeapon;

public class SkyrimItems 
{
	public static EnumToolMaterial DaedricSword = EnumHelper.addToolMaterial("DaedricSword", 8, -1, 8.0F, 14, 2);
	public static EnumToolMaterial DaedricDagger = EnumHelper.addToolMaterial("DaedricDagger", 8, -1, 8.0F, 11, 2);
	public static EnumToolMaterial DaedricWarhammer = EnumHelper.addToolMaterial("DaedricWarhammer", 8, -1, 8.0F, 27, 2);
	public static EnumToolMaterial DaedricWaraxe = EnumHelper.addToolMaterial("DaedricWaraxe", 8, -1, 8.0F, 15, 2);
	public static EnumToolMaterial DaedricMace = EnumHelper.addToolMaterial("DaedricMace", 8, -1, 8.0F, 16, 2);
	public static EnumToolMaterial DaedricGreatsword = EnumHelper.addToolMaterial("DaedricGreatsword", 8, -1, 8.0F, 24, 2);
	public static EnumToolMaterial DaedricBattleaxe = EnumHelper.addToolMaterial("DaedricBattleaxe", 8, -1, 8.0F, 25, 2);
	public static EnumToolMaterial EbonySword = EnumHelper.addToolMaterial("EbonySword", 8, -1, 8.0F, 13, 2);
	public static EnumToolMaterial EbonyDagger = EnumHelper.addToolMaterial("EbonyDagger", 8, -1, 8.0F, 10, 2);
	public static EnumToolMaterial EbonyWarhammer = EnumHelper.addToolMaterial("EbonyWarhammer", 8, -1, 8.0F, 25, 2);
	public static EnumToolMaterial EbonyWaraxe = EnumHelper.addToolMaterial("EbonyWaraxe", 8, -1, 8.0F, 15, 2);
	public static EnumToolMaterial EbonyMace = EnumHelper.addToolMaterial("EbonyMace", 8, -1, 8.0F, 16, 2);
	public static EnumToolMaterial EbonyGreatsword = EnumHelper.addToolMaterial("EbonyGreatsword", 8, -1, 8.0F, 22, 2);
	public static EnumToolMaterial EbonyBattleaxe = EnumHelper.addToolMaterial("EbonyBattleaxe", 8, -1, 8.0F, 23, 2);
	
	public static final Item ebonyIngot = new SkyrimItem(Config.addItem("Ebony Ingot")).setUnlocalizedName("EbonyIngot");
	public static final Item malachiteIngot = new SkyrimItem(Config.addItem("Malachite Ingot")).setUnlocalizedName("MalachiteIngot");
	public static final Item moonstoneIngot = new SkyrimItem(Config.addItem("Moonstone Ingot")).setUnlocalizedName("MoonstoneIngot");
	public static final Item daedraHeart = new SkyrimItem(Config.addItem("Daedra Heart")).setUnlocalizedName("DaedraHeart");
	public static final Item cabbage = new SkyrimFood(Config.addItem("Cabbage"), 4, 2, false).setUnlocalizedName("Cabbage");
	public static final Item carrot = new SkyrimFood(Config.addItem("Carrot"), 2, 2, false).setUnlocalizedName("Carrot");
	public static final Item skooma = new SkyrimFood(Config.addItem("Skooma"), 2, 2, false).setUnlocalizedName("Skooma");
	public static final Item sweetRoll = new SkyrimFood(Config.addItem("Sweet Roll"), 2, 2, false).setUnlocalizedName("SweetRoll");
	public static final Item manaPotion = new SkyrimFood(Config.addItem("Mana Potion"), 2, 2, false).setUnlocalizedName("ManaPotion");
	public static final Item extraMagickaPotion = new SkyrimFood(Config.addItem("Extra Magicka Potion"), 2, 2, false).setUnlocalizedName("ExtraMagickaPotion");
	public static final Item leatherStrips = new SkyrimItem(Config.addItem("Leather Strips")).setUnlocalizedName("LeatherStrips");
	
	public static final Item daedricSword = new SkyrimWeapon(Config.addItem("Daedric Sword"), DaedricSword).setUnlocalizedName("DaedricSword");
	public static final Item daedricDagger = new SkyrimWeapon(Config.addItem("Daedric Dagger"), DaedricDagger).setUnlocalizedName("DaedricDagger");
	public static final Item daedricWarhammer = new SkyrimTwoHanded(Config.addItem("Daedric Warhammer"), DaedricWarhammer).setUnlocalizedName("DaedricWarhammer");
	public static final Item daedricWaraxe = new SkyrimWeapon(Config.addItem("Daedric Waraxe"), DaedricWaraxe).setUnlocalizedName("DaedricWaraxe");
	public static final Item daedricMace = new SkyrimWeapon(Config.addItem("Daedric Mace"), DaedricMace).setUnlocalizedName("DaedricMace");
	public static final Item daedricGreatsword = new SkyrimTwoHanded(Config.addItem("Daedric Greatsword"), DaedricGreatsword).setUnlocalizedName("DaedricGreatsword");
	public static final Item daedricBattleaxe = new SkyrimTwoHanded(Config.addItem("Daedric Battleaxe"), DaedricBattleaxe).setUnlocalizedName("DaedricBattleaxe");
	public static final Item daedricBow = new SkyrimBow(Config.addItem("Daedric Bow")).setUnlocalizedName("DaedricBow");
	public static final Item daedricArrow = new SkyrimArrow(Config.addItem("Daedric Arrow")).setUnlocalizedName("DaedricArrow");
	public static final Item ebonySword = new SkyrimWeapon(Config.addItem("Ebony Sword"), EbonySword).setUnlocalizedName("EbonySword");
	public static final Item ebonyDagger = new SkyrimWeapon(Config.addItem("Ebony Dagger"), EbonyDagger).setUnlocalizedName("EbonyDagger");
	public static final Item ebonyWarhammer = new SkyrimTwoHanded(Config.addItem("Ebony Warhammer"), EbonyWarhammer).setUnlocalizedName("EbonyWarhammer");
	public static final Item ebonyWaraxe = new SkyrimWeapon(Config.addItem("Ebony Waraxe"), EbonyWaraxe).setUnlocalizedName("EbonyWaraxe");
	public static final Item ebonyMace = new SkyrimWeapon(Config.addItem("Ebony Mace"), EbonyMace).setUnlocalizedName("EbonyMace");
	public static final Item ebonyGreatsword = new SkyrimTwoHanded(Config.addItem("Ebony Greatsword"), EbonyGreatsword).setUnlocalizedName("EbonyGreatsword");
	public static final Item ebonyBattleaxe = new SkyrimTwoHanded(Config.addItem("Ebony Battleaxe"), EbonyBattleaxe).setUnlocalizedName("EbonyBattleaxe");
	public static final Item ebonyBow = new SkyrimBow(Config.addItem("Ebony Bow")).setUnlocalizedName("EbonyBow");
	public static final Item ebonyArrow = new SkyrimArrow(Config.addItem("Ebony Arrow")).setUnlocalizedName("EbonyArrow");
	
	public static void add()
	{
		SkyrimRegistry.registerItem(cabbage, "Cabbage");
		SkyrimRegistry.registerItem(carrot, "Carrot");
		SkyrimRegistry.registerItem(daedraHeart, "Daedra Heart");
		SkyrimRegistry.registerItem(leatherStrips, "Leather Strips");
		SkyrimRegistry.registerItem(ebonyIngot, "Ebony Ingot");
		SkyrimRegistry.registerItem(malachiteIngot, "Malachite Ingot");
		SkyrimRegistry.registerItem(moonstoneIngot, "Moonstone Ingot");
		SkyrimRegistry.registerItem(ebonySword, "Ebony Sword");
		SkyrimRegistry.registerItem(ebonyDagger, "Ebony Dagger");
		SkyrimRegistry.registerItem(ebonyWarhammer, "Ebony Warhammer");
		SkyrimRegistry.registerItem(ebonyWaraxe, "Ebony Waraxe");
		SkyrimRegistry.registerItem(ebonyMace, "Ebony Mace");
		SkyrimRegistry.registerItem(ebonyArrow, "Ebony Arrow");
		SkyrimRegistry.registerItem(ebonyBow, "Ebony Bow");
		SkyrimRegistry.registerItem(ebonyGreatsword, "Ebony Greatsword");
		SkyrimRegistry.registerItem(ebonyBattleaxe, "Ebony Battleaxe");
		SkyrimRegistry.registerItem(daedricSword, "Daedric Sword");
		SkyrimRegistry.registerItem(daedricDagger, "Daedric Dagger");
		SkyrimRegistry.registerItem(daedricWarhammer, "Daedric Warhammer");
		SkyrimRegistry.registerItem(daedricWaraxe, "Daedric Waraxe");
		SkyrimRegistry.registerItem(daedricMace, "Daedric Mace");
		SkyrimRegistry.registerItem(daedricArrow, "Daedric Arrow");
		SkyrimRegistry.registerItem(daedricBow, "Daedric Bow");
		SkyrimRegistry.registerItem(daedricGreatsword, "Daedric Greatsword");
		SkyrimRegistry.registerItem(daedricBattleaxe, "Daedric Battleaxe");
	}
}
