package net.skyrimcraft.src.content;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import net.skyrimcraft.src.base.Config;
import net.skyrimcraft.src.base.SkyrimRegistry;
import net.skyrimcraft.src.item.SkyrimArmor;
import net.skyrimcraft.src.item.SkyrimArrow;
import net.skyrimcraft.src.item.SkyrimBow;
import net.skyrimcraft.src.item.SkyrimFood;
import net.skyrimcraft.src.item.SkyrimItem;
import net.skyrimcraft.src.item.SkyrimPotion;
import net.skyrimcraft.src.item.SkyrimShield;
import net.skyrimcraft.src.item.SkyrimTwoHanded;
import net.skyrimcraft.src.item.SkyrimWeapon;
import net.skyrimcraft.src.proxy.CommonProxy;

public class SkyrimItems 
{
	public static int armor = CommonProxy.addArmor("armor");
	
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
	
	public static EnumToolMaterial GlassSword = EnumHelper.addToolMaterial("GlassSword", 8, -1, 8.0F, 13, 2);
	public static EnumToolMaterial GlassDagger = EnumHelper.addToolMaterial("GlassDagger", 8, -1, 8.0F, 10, 2);
	public static EnumToolMaterial GlassWarhammer = EnumHelper.addToolMaterial("GlassWarhammer", 8, -1, 8.0F, 25, 2);
	public static EnumToolMaterial GlassWaraxe = EnumHelper.addToolMaterial("GlassWaraxe", 8, -1, 8.0F, 15, 2);
	public static EnumToolMaterial GlassMace = EnumHelper.addToolMaterial("GlassMace", 8, -1, 8.0F, 16, 2);
	public static EnumToolMaterial GlassGreatsword = EnumHelper.addToolMaterial("GlassGreatsword", 8, -1, 8.0F, 22, 2);
	public static EnumToolMaterial GlassBattleaxe = EnumHelper.addToolMaterial("GlassBattleaxe", 8, -1, 8.0F, 23, 2);
	
	public static EnumToolMaterial AncientNordSword = EnumHelper.addToolMaterial("AncientNordSword", 8, -1, 8.0F, 13, 2);
	public static EnumToolMaterial AncientNordDagger = EnumHelper.addToolMaterial("AncientNordDagger", 8, -1, 8.0F, 10, 2);
	public static EnumToolMaterial AncientNordWarhammer = EnumHelper.addToolMaterial("AncientNordWarhammer", 8, -1, 8.0F, 25, 2);
	public static EnumToolMaterial AncientNordWaraxe = EnumHelper.addToolMaterial("AncientNordWaraxe", 8, -1, 8.0F, 15, 2);
	public static EnumToolMaterial AncientNordMace = EnumHelper.addToolMaterial("AncientNordMace", 8, -1, 8.0F, 16, 2);
	public static EnumToolMaterial AncientNordGreatsword = EnumHelper.addToolMaterial("AncientNordGreatsword", 8, -1, 8.0F, 22, 2);
	public static EnumToolMaterial AncientNordBattleaxe = EnumHelper.addToolMaterial("AncientNordBattleaxe", 8, -1, 8.0F, 23, 2);
	
	public static EnumToolMaterial DwarvenSword = EnumHelper.addToolMaterial("DwarvenSword", 8, -1, 8.0F, 13, 2);
	public static EnumToolMaterial DwarvenDagger = EnumHelper.addToolMaterial("DwarvenDagger", 8, -1, 8.0F, 10, 2);
	public static EnumToolMaterial DwarvenWarhammer = EnumHelper.addToolMaterial("DwarvenWarhammer", 8, -1, 8.0F, 25, 2);
	public static EnumToolMaterial DwarvenWaraxe = EnumHelper.addToolMaterial("DwarvenWaraxe", 8, -1, 8.0F, 15, 2);
	public static EnumToolMaterial DwarvenMace = EnumHelper.addToolMaterial("DwarvenMace", 8, -1, 8.0F, 16, 2);
	public static EnumToolMaterial DwarvenGreatsword = EnumHelper.addToolMaterial("DwarvenGreatsword", 8, -1, 8.0F, 22, 2);
	public static EnumToolMaterial DwarvenBattleaxe = EnumHelper.addToolMaterial("DwarvenBattleaxe", 8, -1, 8.0F, 23, 2);
	
	public static EnumToolMaterial ElvenSword = EnumHelper.addToolMaterial("ElvenSword", 8, -1, 8.0F, 13, 2);
	public static EnumToolMaterial ElvenDagger = EnumHelper.addToolMaterial("ElvenDagger", 8, -1, 8.0F, 10, 2);
	public static EnumToolMaterial ElvenWarhammer = EnumHelper.addToolMaterial("ElvenWarhammer", 8, -1, 8.0F, 25, 2);
	public static EnumToolMaterial ElvenWaraxe = EnumHelper.addToolMaterial("ElvenWaraxe", 8, -1, 8.0F, 15, 2);
	public static EnumToolMaterial ElvenMace = EnumHelper.addToolMaterial("ElvenMace", 8, -1, 8.0F, 16, 2);
	public static EnumToolMaterial ElvenGreatsword = EnumHelper.addToolMaterial("ElvenGreatsword", 8, -1, 8.0F, 22, 2);
	public static EnumToolMaterial ElvenBattleaxe = EnumHelper.addToolMaterial("ElvenBattleaxe", 8, -1, 8.0F, 23, 2);
	
	public static EnumToolMaterial OrcishSword = EnumHelper.addToolMaterial("OrcishSword", 8, -1, 8.0F, 13, 2);
	public static EnumToolMaterial OrcishDagger = EnumHelper.addToolMaterial("OrcishDagger", 8, -1, 8.0F, 10, 2);
	public static EnumToolMaterial OrcishWarhammer = EnumHelper.addToolMaterial("OrcishWarhammer", 8, -1, 8.0F, 25, 2);
	public static EnumToolMaterial OrcishWaraxe = EnumHelper.addToolMaterial("OrcishWaraxe", 8, -1, 8.0F, 15, 2);
	public static EnumToolMaterial OrcishMace = EnumHelper.addToolMaterial("OrcishMace", 8, -1, 8.0F, 16, 2);
	public static EnumToolMaterial OrcishGreatsword = EnumHelper.addToolMaterial("OrcishGreatsword", 8, -1, 8.0F, 22, 2);
	public static EnumToolMaterial OrcishBattleaxe = EnumHelper.addToolMaterial("OrcishBattleaxe", 8, -1, 8.0F, 23, 2);
	
	public static EnumToolMaterial DragonboneSword = EnumHelper.addToolMaterial("DragonboneSword", 8, -1, 8.0F, 13, 2);
	public static EnumToolMaterial DragonboneDagger = EnumHelper.addToolMaterial("DragonboneDagger", 8, -1, 8.0F, 10, 2);
	public static EnumToolMaterial DragonboneWarhammer = EnumHelper.addToolMaterial("DragonboneWarhammer", 8, -1, 8.0F, 25, 2);
	public static EnumToolMaterial DragonboneWaraxe = EnumHelper.addToolMaterial("DragonboneWaraxe", 8, -1, 8.0F, 15, 2);
	public static EnumToolMaterial DragonboneMace = EnumHelper.addToolMaterial("DragonboneMace", 8, -1, 8.0F, 16, 2);
	public static EnumToolMaterial DragonboneGreatsword = EnumHelper.addToolMaterial("DragonboneGreatsword", 8, -1, 8.0F, 22, 2);
	public static EnumToolMaterial DragonboneBattleaxe = EnumHelper.addToolMaterial("DragonboneBattleaxe", 8, -1, 8.0F, 23, 2);
	
	public static final Item ebonyIngot = new SkyrimItem(Config.addItem("Ebony Ingot")).setUnlocalizedName("ebonyIngot");
	public static final Item malachiteIngot = new SkyrimItem(Config.addItem("Malachite Ingot")).setUnlocalizedName("malachiteIngot");
	public static final Item moonstoneIngot = new SkyrimItem(Config.addItem("Moonstone Ingot")).setUnlocalizedName("moonstoneIngot");
	public static final Item orichalcumIngot = new SkyrimItem(Config.addItem("Orichalcum Ingot")).setUnlocalizedName("orichalcumIngot");
	public static final Item dwarvenIngot = new SkyrimItem(Config.addItem("Dwarven Ingot")).setUnlocalizedName("dwarvenIngot");
	public static final Item steelIngot = new SkyrimItem(Config.addItem("Steel Ingot")).setUnlocalizedName("steelIngot");
	
	public static final Item daedraHeart = new SkyrimItem(Config.addItem("Daedra Heart")).setUnlocalizedName("daedraHeart");
	public static final Item cabbage = new SkyrimFood(Config.addItem("Cabbage"), 4, 2, false).setUnlocalizedName("cabbage");
	public static final Item carrot = new SkyrimFood(Config.addItem("Carrot"), 2, 2, false).setUnlocalizedName("carrot");
	public static final Item skooma = new SkyrimFood(Config.addItem("Skooma"), 2, 2, false).setUnlocalizedName("skooma");
	public static final Item sweetRoll = new SkyrimFood(Config.addItem("Sweet Roll"), 2, 2, false).setUnlocalizedName("sweetRoll");
	public static final Item leatherStrips = new SkyrimItem(Config.addItem("Leather Strips")).setUnlocalizedName("leatherStrips");
	public static final Item dragonBone = new SkyrimItem(Config.addItem("Dragonbone")).setUnlocalizedName("dragonBone");
	
	public static final Item daedricSword = new SkyrimWeapon(Config.addItem("Daedric Sword"), DaedricSword).setUnlocalizedName("daedricSword");
	public static final Item daedricDagger = new SkyrimWeapon(Config.addItem("Daedric Dagger"), DaedricDagger).setUnlocalizedName("daedricDagger");
	public static final Item daedricWarhammer = new SkyrimTwoHanded(Config.addItem("Daedric Warhammer"), DaedricWarhammer).setUnlocalizedName("daedricWarhammer");
	public static final Item daedricWaraxe = new SkyrimWeapon(Config.addItem("Daedric Waraxe"), DaedricWaraxe).setUnlocalizedName("daedricWaraxe");
	public static final Item daedricMace = new SkyrimWeapon(Config.addItem("Daedric Mace"), DaedricMace).setUnlocalizedName("daedricMace");
	public static final Item daedricGreatsword = new SkyrimTwoHanded(Config.addItem("Daedric Greatsword"), DaedricGreatsword).setUnlocalizedName("daedricGreatsword");
	public static final Item daedricBattleaxe = new SkyrimTwoHanded(Config.addItem("Daedric Battleaxe"), DaedricBattleaxe).setUnlocalizedName("daedricBattleaxe");
	public static final Item daedricBow = new SkyrimBow(Config.addItem("Daedric Bow")).setUnlocalizedName("daedricBow");
	public static final Item daedricArrow = new SkyrimArrow(Config.addItem("Daedric Arrow")).setUnlocalizedName("daedricArrow");
	
	public static final Item ebonySword = new SkyrimWeapon(Config.addItem("Ebony Sword"), EbonySword).setUnlocalizedName("ebonySword");
	public static final Item ebonyDagger = new SkyrimWeapon(Config.addItem("Ebony Dagger"), EbonyDagger).setUnlocalizedName("ebonyDagger");
	public static final Item ebonyWarhammer = new SkyrimTwoHanded(Config.addItem("Ebony Warhammer"), EbonyWarhammer).setUnlocalizedName("ebonyWarhammer");
	public static final Item ebonyWaraxe = new SkyrimWeapon(Config.addItem("Ebony Waraxe"), EbonyWaraxe).setUnlocalizedName("ebonyWaraxe");
	public static final Item ebonyMace = new SkyrimWeapon(Config.addItem("Ebony Mace"), EbonyMace).setUnlocalizedName("ebonyMace");
	public static final Item ebonyGreatsword = new SkyrimTwoHanded(Config.addItem("Ebony Greatsword"), EbonyGreatsword).setUnlocalizedName("ebonyGreatsword");
	public static final Item ebonyBattleaxe = new SkyrimTwoHanded(Config.addItem("Ebony Battleaxe"), EbonyBattleaxe).setUnlocalizedName("ebonyBattleaxe");
	public static final Item ebonyBow = new SkyrimBow(Config.addItem("Ebony Bow")).setUnlocalizedName("ebonyBow");
	public static final Item ebonyArrow = new SkyrimArrow(Config.addItem("Ebony Arrow")).setUnlocalizedName("ebonyArrow");
	
	public static final Item glassSword = new SkyrimWeapon(Config.addItem("Glass Sword"), GlassSword).setUnlocalizedName("glassSword");
	public static final Item glassDagger = new SkyrimWeapon(Config.addItem("Glass Dagger"), GlassDagger).setUnlocalizedName("glassDagger");
	public static final Item glassWarhammer = new SkyrimTwoHanded(Config.addItem("Glass Warhammer"), GlassDagger).setUnlocalizedName("glassWarhammer");
	public static final Item glassWaraxe = new SkyrimWeapon(Config.addItem("Glass Waraxe"), GlassWaraxe).setUnlocalizedName("glassWaraxe");
	public static final Item glassMace = new SkyrimWeapon(Config.addItem("Glass Mace"), GlassMace).setUnlocalizedName("glassMace");
	public static final Item glassGreatsword = new SkyrimTwoHanded(Config.addItem("Glass Greatsword"), GlassGreatsword).setUnlocalizedName("glassGreatsword");
	public static final Item glassBattleaxe = new SkyrimTwoHanded(Config.addItem("Glass Battleaxe"), GlassBattleaxe).setUnlocalizedName("glassBattleaxe");
	public static final Item glassBow = new SkyrimBow(Config.addItem("Glass Bow")).setUnlocalizedName("glassBow");
	public static final Item glassArrow = new SkyrimArrow(Config.addItem("Glass Arrow")).setUnlocalizedName("glassArrow");
	
	public static final Item ancientNordSword = new SkyrimWeapon(Config.addItem("Ancient Nord Sword"), AncientNordSword).setUnlocalizedName("ancientNordSword");
	public static final Item ancientNordWaraxe = new SkyrimWeapon(Config.addItem("Ancient Nord Waraxe"), AncientNordWaraxe).setUnlocalizedName("ancientNordWaraxe");
	public static final Item ancientNordGreatsword = new SkyrimTwoHanded(Config.addItem("Ancient Nord Greatsword"), AncientNordGreatsword).setUnlocalizedName("ancientNordGreatsword");
	public static final Item ancientNordBattleaxe = new SkyrimTwoHanded(Config.addItem("Ancient Nord Battleaxe"), AncientNordBattleaxe).setUnlocalizedName("ancientNordBattleaxe");
	public static final Item ancientNordBow = new SkyrimBow(Config.addItem("Ancient Nord Bow")).setUnlocalizedName("ancientNordBow");
	public static final Item ancientNordArrow = new SkyrimArrow(Config.addItem("Ancient Nord Arrow")).setUnlocalizedName("ancientNordArrow");
	
	public static final Item dwarvenSword = new SkyrimWeapon(Config.addItem("Dwarven Sword"), DwarvenSword).setUnlocalizedName("dwarvenSword");
	public static final Item dwarvenDagger = new SkyrimWeapon(Config.addItem("Dwarven Dagger"), DwarvenDagger).setUnlocalizedName("dwarvenDagger");
	public static final Item dwarvenWarhammer = new SkyrimTwoHanded(Config.addItem("Dwarven Warhammer"), DwarvenDagger).setUnlocalizedName("dwarvenWarhammer");
	public static final Item dwarvenWaraxe = new SkyrimWeapon(Config.addItem("Dwarven Waraxe"), DwarvenWaraxe).setUnlocalizedName("dwarvenWaraxe");
	public static final Item dwarvenMace = new SkyrimWeapon(Config.addItem("Dwarven Mace"), DwarvenMace).setUnlocalizedName("dwarvenMace");
	public static final Item dwarvenGreatsword = new SkyrimTwoHanded(Config.addItem("Dwarven Greatsword"), DwarvenGreatsword).setUnlocalizedName("dwarvenGreatsword");
	public static final Item dwarvenBattleaxe = new SkyrimTwoHanded(Config.addItem("Dwarven Battleaxe"), DwarvenBattleaxe).setUnlocalizedName("dwarvenBattleaxe");
	public static final Item dwarvenBow = new SkyrimBow(Config.addItem("Dwarven Bow")).setUnlocalizedName("dwarvenBow");
	public static final Item dwarvenArrow = new SkyrimArrow(Config.addItem("Dwarven Arrow")).setUnlocalizedName("dwarvenArrow");
	
	public static final Item elvenSword = new SkyrimWeapon(Config.addItem("Elven Sword"), ElvenSword).setUnlocalizedName("elvenSword");
	public static final Item elvenDagger = new SkyrimWeapon(Config.addItem("Elven Dagger"), ElvenDagger).setUnlocalizedName("elvenDagger");
	public static final Item elvenWarhammer = new SkyrimTwoHanded(Config.addItem("Elven Warhammer"), ElvenDagger).setUnlocalizedName("elvenWarhammer");
	public static final Item elvenWaraxe = new SkyrimWeapon(Config.addItem("Elven Waraxe"), ElvenWaraxe).setUnlocalizedName("elvenWaraxe");
	public static final Item elvenMace = new SkyrimWeapon(Config.addItem("Elven Mace"), ElvenMace).setUnlocalizedName("elvenMace");
	public static final Item elvenGreatsword = new SkyrimTwoHanded(Config.addItem("Elven Greatsword"), ElvenGreatsword).setUnlocalizedName("elvenGreatsword");
	public static final Item elvenBattleaxe = new SkyrimTwoHanded(Config.addItem("Elven Battleaxe"), ElvenBattleaxe).setUnlocalizedName("elvenBattleaxe");
	public static final Item elvenBow = new SkyrimBow(Config.addItem("Elven Bow")).setUnlocalizedName("elvenBow");
	public static final Item elvenArrow = new SkyrimArrow(Config.addItem("Elven Arrow")).setUnlocalizedName("elvenArrow");
	
	public static final Item ironSword = new SkyrimWeapon(Config.addItem("Iron Sword"), EnumToolMaterial.IRON).setUnlocalizedName("ironSword");
	public static final Item ironDagger = new SkyrimWeapon(Config.addItem("Iron Dagger"), EnumToolMaterial.IRON).setUnlocalizedName("ironDagger");
	public static final Item ironWarhammer = new SkyrimWeapon(Config.addItem("Iron Warhammer"), EnumToolMaterial.IRON).setUnlocalizedName("ironWarhammer");
	public static final Item ironWaraxe = new SkyrimWeapon(Config.addItem("Iron Waraxe"), EnumToolMaterial.IRON).setUnlocalizedName("ironWaraxe");
	public static final Item ironMace = new SkyrimWeapon(Config.addItem("Iron Mace"), EnumToolMaterial.IRON).setUnlocalizedName("ironMace");
	public static final Item ironGreatsword = new SkyrimWeapon(Config.addItem("Iron Greatsword"), EnumToolMaterial.IRON).setUnlocalizedName("ironGreatsword");
	public static final Item ironBattleaxe = new SkyrimWeapon(Config.addItem("Iron Battleaxe"), EnumToolMaterial.IRON).setUnlocalizedName("ironBattleaxe");
	public static final Item ironArrow = new SkyrimArrow(Config.addItem("Iron Arrow")).setUnlocalizedName("ironArrow");
	
	public static final Item steelSword = new SkyrimWeapon(Config.addItem("Steel Sword"), EnumToolMaterial.IRON).setUnlocalizedName("steelSword");
	public static final Item steelDagger = new SkyrimWeapon(Config.addItem("Steel Dagger"), EnumToolMaterial.IRON).setUnlocalizedName("steelDagger");
	public static final Item steelWarhammer = new SkyrimWeapon(Config.addItem("Steel Warhammer"), EnumToolMaterial.IRON).setUnlocalizedName("steelWarhammer");
	public static final Item steelWaraxe = new SkyrimWeapon(Config.addItem("Steel Waraxe"), EnumToolMaterial.IRON).setUnlocalizedName("steelWaraxe");
	public static final Item steelMace = new SkyrimWeapon(Config.addItem("Steel Mace"), EnumToolMaterial.IRON).setUnlocalizedName("steelMace");
	public static final Item steelGreatsword = new SkyrimWeapon(Config.addItem("Steel Greatsword"), EnumToolMaterial.IRON).setUnlocalizedName("steelGreatsword");
	public static final Item steelBattleaxe = new SkyrimWeapon(Config.addItem("Steel Battleaxe"), EnumToolMaterial.IRON).setUnlocalizedName("steelBattleaxe");
	public static final Item steelArrow = new SkyrimArrow(Config.addItem("Steel Arrow")).setUnlocalizedName("steelArrow");
	
	public static final Item orcishSword = new SkyrimWeapon(Config.addItem("Orcish Sword"), OrcishSword).setUnlocalizedName("orcishSword");
	public static final Item orcishDagger = new SkyrimWeapon(Config.addItem("Orcish Dagger"), OrcishDagger).setUnlocalizedName("orcishDagger");
	public static final Item orcishWarhammer = new SkyrimTwoHanded(Config.addItem("Orcish Warhammer"), OrcishDagger).setUnlocalizedName("orcishWarhammer");
	public static final Item orcishWaraxe = new SkyrimWeapon(Config.addItem("Orcish Waraxe"), OrcishWaraxe).setUnlocalizedName("orcishWaraxe");
	public static final Item orcishMace = new SkyrimWeapon(Config.addItem("Orcish Mace"), OrcishMace).setUnlocalizedName("orcishMace");
	public static final Item orcishGreatsword = new SkyrimTwoHanded(Config.addItem("Orcish Greatsword"), OrcishGreatsword).setUnlocalizedName("orcishGreatsword");
	public static final Item orcishBattleaxe = new SkyrimTwoHanded(Config.addItem("Orcish Battleaxe"), OrcishBattleaxe).setUnlocalizedName("orcishBattleaxe");
	public static final Item orcishBow = new SkyrimBow(Config.addItem("Orcish Bow")).setUnlocalizedName("orcishBow");
	public static final Item orcishArrow = new SkyrimArrow(Config.addItem("Orcish Arrow")).setUnlocalizedName("orcishArrow");
	
	public static final Item dragonBoneSword = new SkyrimWeapon(Config.addItem("Dragonbone Sword"), DragonboneSword).setUnlocalizedName("dragonBoneSword");
	public static final Item dragonBoneDagger = new SkyrimWeapon(Config.addItem("Dragonbone Dagger"), DragonboneDagger).setUnlocalizedName("dragonBoneDagger");
	public static final Item dragonBoneWarhammer = new SkyrimTwoHanded(Config.addItem("Dragonbone Warhammer"), DragonboneDagger).setUnlocalizedName("dragonBoneWarhammer");
	public static final Item dragonBoneWaraxe = new SkyrimWeapon(Config.addItem("Dragonbone Waraxe"), DragonboneWaraxe).setUnlocalizedName("dragonBoneWaraxe");
	public static final Item dragonBoneMace = new SkyrimWeapon(Config.addItem("Dragonbone Mace"), DragonboneMace).setUnlocalizedName("dragonBoneMace");
	public static final Item dragonBoneGreatsword = new SkyrimTwoHanded(Config.addItem("Dragonbone Greatsword"), DragonboneGreatsword).setUnlocalizedName("dragonBoneGreatsword");
	public static final Item dragonBoneBattleaxe = new SkyrimTwoHanded(Config.addItem("Dragonbone Battleaxe"), DragonboneBattleaxe).setUnlocalizedName("dragonBoneBattleaxe");
	public static final Item dragonBoneBow = new SkyrimBow(Config.addItem("Dragonbone Bow")).setUnlocalizedName("dragonBoneBow");
	public static final Item dragonBoneArrow = new SkyrimArrow(Config.addItem("Dragonbone Arrow")).setUnlocalizedName("dragonBoneArrow");
	
	public static final Item longbow = new SkyrimBow(Config.addItem("Longbow")).setUnlocalizedName("longBow");
	
	public static final Item imperialChestplate = new SkyrimArmor(Config.addItem("Imperial Chestplate"), EnumArmorMaterial.DIAMOND, armor, 1, "imperial").setUnlocalizedName("imperialChestplate");
	public static final Item imperialLeggings = new SkyrimArmor(Config.addItem("Imperial Leggings"), EnumArmorMaterial.DIAMOND, armor, 2, "imperial").setUnlocalizedName("imperialLeggings");
	public static final Item imperialHelmet = new SkyrimArmor(Config.addItem("Imperial Helmet"), EnumArmorMaterial.DIAMOND, armor, 0, "imperial").setUnlocalizedName("imperialHelmet");
	public static final Item imperialBoots = new SkyrimArmor(Config.addItem("Imperial Boots"), EnumArmorMaterial.DIAMOND, armor, 3, "imperial").setUnlocalizedName("imperialBoots");
	public static final Item imperialShield = new SkyrimShield(Config.addItem("Imperial Shield")).setUnlocalizedName("imperialShield");
	
	public static final Item daedricChestplate = new SkyrimArmor(Config.addItem("Daedric Chestplate"), EnumArmorMaterial.DIAMOND, armor, 1, "daedric").setUnlocalizedName("daedricChestplate");
	public static final Item daedricLeggings = new SkyrimArmor(Config.addItem("Daedric Leggings"), EnumArmorMaterial.DIAMOND, armor, 2, "daedric").setUnlocalizedName("daedricLeggings");
	public static final Item daedricHelmet = new SkyrimArmor(Config.addItem("Daedric Helmet"), EnumArmorMaterial.DIAMOND, armor, 0, "daedric").setUnlocalizedName("daedricHelmet");
	public static final Item daedricBoots = new SkyrimArmor(Config.addItem("Daedric Boots"), EnumArmorMaterial.DIAMOND, armor, 3, "daedric").setUnlocalizedName("daedricBoots");
	public static final Item daedricShield = new SkyrimShield(Config.addItem("Daedric Shield")).setUnlocalizedName("daedricShield");
	
	public static final Item glassChestplate = new SkyrimArmor(Config.addItem("Glass Chestplate"), EnumArmorMaterial.DIAMOND, armor, 1, "glass").setUnlocalizedName("glassChestplate");
	public static final Item glassLeggings = new SkyrimArmor(Config.addItem("Glass Leggings"), EnumArmorMaterial.DIAMOND, armor, 2, "glass").setUnlocalizedName("glassLeggings");
	public static final Item glassHelmet = new SkyrimArmor(Config.addItem("Glass Helmet"), EnumArmorMaterial.DIAMOND, armor, 0, "glass").setUnlocalizedName("glassHelmet");
	public static final Item glassBoots = new SkyrimArmor(Config.addItem("Glass Boots"), EnumArmorMaterial.DIAMOND, armor, 3, "glass").setUnlocalizedName("glassBoots");
	public static final Item glassShield = new SkyrimShield(Config.addItem("Glass Shield")).setUnlocalizedName("glassShield");
	
	public static final Item ancientNordChestplate = new SkyrimArmor(Config.addItem("Ancient Nord Chestplate"), EnumArmorMaterial.DIAMOND, armor, 1, "ancientNord").setUnlocalizedName("ancientNordChestplate");
	public static final Item ancientNordLeggings = new SkyrimArmor(Config.addItem("Ancient Nord Leggings"), EnumArmorMaterial.DIAMOND, armor, 2, "ancientNord").setUnlocalizedName("ancientNordLeggings");
	public static final Item ancientNordHelmet = new SkyrimArmor(Config.addItem("Ancient Nord Helmet"), EnumArmorMaterial.DIAMOND, armor, 0, "ancientNord").setUnlocalizedName("ancientNordHelmet");
	public static final Item ancientNordBoots = new SkyrimArmor(Config.addItem("Ancient Nord Boots"), EnumArmorMaterial.DIAMOND, armor, 3, "ancientNord").setUnlocalizedName("ancientNordBoots");
	
	public static final Item minorHealing = new SkyrimPotion(Config.addItem("Potion of Minor Healing"), 0, 0, false).setUnlocalizedName("minorHealing");
	public static final Item minorMagicka = new SkyrimPotion(Config.addItem("Potion of Minor Magicka"), 0, 0, false).setUnlocalizedName("minorMagicka");
	
	public static void add()
	{
		SkyrimRegistry.registerItem(cabbage, "Cabbage");
		SkyrimRegistry.registerItem(carrot, "Carrot");
		SkyrimRegistry.registerItem(skooma, "Skooma");
		SkyrimRegistry.registerItem(sweetRoll, "Sweet Roll");
		SkyrimRegistry.registerItem(daedraHeart, "Daedra Heart");
		SkyrimRegistry.registerItem(leatherStrips, "Leather Strips");
		SkyrimRegistry.registerItem(dragonBone, "Dragonbone");
		
		SkyrimRegistry.registerItem(ebonyIngot, "Ebony Ingot");
		SkyrimRegistry.registerItem(malachiteIngot, "Malachite Ingot");
		SkyrimRegistry.registerItem(moonstoneIngot, "Moonstone Ingot");
		SkyrimRegistry.registerItem(orichalcumIngot, "Orichalcum Ingot");
		SkyrimRegistry.registerItem(steelIngot, "Steel Ingot");
		SkyrimRegistry.registerItem(dwarvenIngot, "Iron Ingot");
		
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
		
		SkyrimRegistry.registerItem(glassSword, "Glass Sword");
		SkyrimRegistry.registerItem(glassDagger, "Glass Dagger");
		SkyrimRegistry.registerItem(glassWarhammer, "Glass Warhammer");
		SkyrimRegistry.registerItem(glassWaraxe, "Glass Waraxe");
		SkyrimRegistry.registerItem(glassMace, "Glass Mace");
		SkyrimRegistry.registerItem(glassArrow, "Glass Arrow");
		SkyrimRegistry.registerItem(glassBow, "Glass Bow");
		SkyrimRegistry.registerItem(glassGreatsword, "Glass Greatsword");
		SkyrimRegistry.registerItem(glassBattleaxe, "Glass Battleaxe");
		
		SkyrimRegistry.registerItem(ancientNordSword, "Ancient Nord Sword");
		SkyrimRegistry.registerItem(ancientNordWaraxe, "Ancient Nord Waraxe");
		SkyrimRegistry.registerItem(ancientNordArrow, "Ancient Nord Arrow");
		SkyrimRegistry.registerItem(ancientNordBow, "Ancient Nord Bow");
		SkyrimRegistry.registerItem(ancientNordGreatsword, "Ancient Nord Greatsword");
		SkyrimRegistry.registerItem(ancientNordBattleaxe, "Ancient Nord Battleaxe");
		
		SkyrimRegistry.registerItem(dwarvenSword, "Dwarven Sword");
		SkyrimRegistry.registerItem(dwarvenDagger, "Dwarven Dagger");
		SkyrimRegistry.registerItem(dwarvenWarhammer, "Dwarven Warhammer");
		SkyrimRegistry.registerItem(dwarvenWaraxe, "Dwarven Waraxe");
		SkyrimRegistry.registerItem(dwarvenMace, "Dwarven Mace");
		SkyrimRegistry.registerItem(dwarvenArrow, "Dwarven Arrow");
		SkyrimRegistry.registerItem(dwarvenBow, "Dwarven Bow");
		SkyrimRegistry.registerItem(dwarvenGreatsword, "Dwarven Greatsword");
		SkyrimRegistry.registerItem(dwarvenBattleaxe, "Dwarven Battleaxe");
		
		SkyrimRegistry.registerItem(elvenSword, "Elven Sword");
		SkyrimRegistry.registerItem(elvenDagger, "Elven Dagger");
		SkyrimRegistry.registerItem(elvenWarhammer, "Elven Warhammer");
		SkyrimRegistry.registerItem(elvenWaraxe, "Elven Waraxe");
		SkyrimRegistry.registerItem(elvenMace, "Elven Mace");
		SkyrimRegistry.registerItem(elvenArrow, "Elven Arrow");
		SkyrimRegistry.registerItem(elvenBow, "Elven Bow");
		SkyrimRegistry.registerItem(elvenGreatsword, "Elven Greatsword");
		
		SkyrimRegistry.registerItem(orcishSword, "Orcish Sword");
		SkyrimRegistry.registerItem(orcishDagger, "Orcish Dagger");
		SkyrimRegistry.registerItem(orcishWarhammer, "Orcish Warhammer");
		SkyrimRegistry.registerItem(orcishWaraxe, "Orcish Waraxe");
		SkyrimRegistry.registerItem(orcishMace, "Orcish Mace");
		SkyrimRegistry.registerItem(orcishArrow, "Orcish Arrow");
		SkyrimRegistry.registerItem(orcishBow, "Orcish Bow");
		SkyrimRegistry.registerItem(orcishGreatsword, "Orcish Greatsword");
		SkyrimRegistry.registerItem(orcishBattleaxe, "Orcish Battleaxe");
		
		SkyrimRegistry.registerItem(ironSword, "Iron Sword");
		SkyrimRegistry.registerItem(ironDagger, "Iron Dagger");
		SkyrimRegistry.registerItem(ironWarhammer, "Iron Warhammer");
		SkyrimRegistry.registerItem(ironWaraxe, "Iron Waraxe");
		SkyrimRegistry.registerItem(ironMace, "Iron Mace");
		SkyrimRegistry.registerItem(ironArrow, "Iron Arrow");
		SkyrimRegistry.registerItem(ironGreatsword, "Iron Greatsword");
		SkyrimRegistry.registerItem(ironBattleaxe, "Iron Battleaxe");
		
		SkyrimRegistry.registerItem(steelSword, "Steel Sword");
		SkyrimRegistry.registerItem(steelDagger, "Steel Dagger");
		SkyrimRegistry.registerItem(steelWarhammer, "Steel Warhammer");
		SkyrimRegistry.registerItem(steelWaraxe, "Steel Waraxe");
		SkyrimRegistry.registerItem(steelMace, "Steel Mace");
		SkyrimRegistry.registerItem(steelArrow, "Steel Arrow");
		SkyrimRegistry.registerItem(steelGreatsword, "Steel Greatsword");
		SkyrimRegistry.registerItem(steelBattleaxe, "Steel Battleaxe");
		
		SkyrimRegistry.registerItem(dragonBoneSword, "Dragonbone Sword");
		SkyrimRegistry.registerItem(dragonBoneDagger, "Dragonbone Dagger");
		SkyrimRegistry.registerItem(dragonBoneWarhammer, "Dragonbone Warhammer");
		SkyrimRegistry.registerItem(dragonBoneWaraxe, "Dragonbone Waraxe");
		SkyrimRegistry.registerItem(dragonBoneMace, "Dragonbone Mace");
		SkyrimRegistry.registerItem(dragonBoneArrow, "Dragonbone Arrow");
		SkyrimRegistry.registerItem(dragonBoneBow, "Dragonbone Bow");
		SkyrimRegistry.registerItem(dragonBoneGreatsword, "Dragonbone Greatsword");
		SkyrimRegistry.registerItem(dragonBoneBattleaxe, "Dragonbone Battleaxe");
		
		SkyrimRegistry.registerItem(longbow, "Longbow");
		
		SkyrimRegistry.registerItem(imperialChestplate, "Imperial Chestplate");
		SkyrimRegistry.registerItem(imperialLeggings, "Imperial Leggings");
		SkyrimRegistry.registerItem(imperialHelmet, "Imperial Helmet");
		SkyrimRegistry.registerItem(imperialBoots, "Imperial Boots");
		
		SkyrimRegistry.registerItem(daedricChestplate, "Daedric Chestplate");
		SkyrimRegistry.registerItem(daedricLeggings, "Daedric Leggings");
		SkyrimRegistry.registerItem(daedricHelmet, "Daedric Helmet");
		SkyrimRegistry.registerItem(daedricBoots, "Daedric Boots");
		
		SkyrimRegistry.registerItem(glassChestplate, "Glass Chestplate");
		SkyrimRegistry.registerItem(glassLeggings, "Glass Leggings");
		SkyrimRegistry.registerItem(glassHelmet, "Glass Helmet");
		SkyrimRegistry.registerItem(glassBoots, "Glass Boots");
		
		SkyrimRegistry.registerItem(ancientNordChestplate, "Ancient Nord Chestplate");
		SkyrimRegistry.registerItem(ancientNordLeggings, "Ancient Nord Leggings");
		SkyrimRegistry.registerItem(ancientNordHelmet, "Ancient Nord Helmet");
		SkyrimRegistry.registerItem(ancientNordBoots, "Ancient Nord Boots");
		
		SkyrimRegistry.registerItem(minorHealing, "Potion of Minor Healing");
		SkyrimRegistry.registerItem(minorMagicka, "Potion of Minor Magicka");
	}
}