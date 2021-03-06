package net.skyrimcraft.src.base;

import java.util.Arrays;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.skyrimcraft.src.content.SkyrimBlocks;
import net.skyrimcraft.src.content.SkyrimDimensions;
import net.skyrimcraft.src.content.SkyrimEntities;
import net.skyrimcraft.src.content.SkyrimItems;
import net.skyrimcraft.src.creativetab.TabSkyrimcraft;
import net.skyrimcraft.src.gui.GuiSkyrimIngame;
import net.skyrimcraft.src.gui.recipes.SkyrimAnvilCraftingManager;
import net.skyrimcraft.src.handler.GameEventsHandler;
import net.skyrimcraft.src.handler.SkyrimTickHandler;
import net.skyrimcraft.src.packet.SkyrimcraftPacketHandler;
import net.skyrimcraft.src.proxy.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Util.MOD_ID, name = Util.MOD_NAME, version = Util.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels={"skyrimcraftii"}, packetHandler = SkyrimcraftPacketHandler.class)
public class SkyrimcraftII
{
	public static int helmet = 0;
	public static int chestplate = 1;
	public static int leggings = 2;
	public static int boots = 3;

	@Instance(Util.MOD_ID)
	public static SkyrimcraftII instance = new SkyrimcraftII();

	@SidedProxy(clientSide = "net.skyrimcraft.src.proxy.ClientProxy", serverSide = "net.skyrimcraft.src.proxy.CommonProxy")
	public static CommonProxy proxy = new CommonProxy();

	public static final CreativeTabs tab = new TabSkyrimcraft("Skyrimcraft II");
	public static Config config;
	public static SkyrimAnvilCraftingManager craftingManagerInstance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.init();
		ModMetadata data = event.getModMetadata();
		data.autogenerated = false;
		data.modId = Util.MOD_ID;
		data.name = Util.MOD_NAME;
		data.version = Util.VERSION;
		data.url = "Website?";
		data.authorList = Arrays.asList(new String[] { "Sheenrox82", "Mr_Simba", "Madcrazydrumma" });
		data.description = Util.MOD_NAME + " is a Minecraft mod that will ultimately bring as much of the" +
				" Skyrim world to Minecraft as possible. It will eventually contain an RPG realm;" +
				" where players can play one of the most exciting games in another amazing game, Minecraft!" +
				" While it's state may not include everything you are looking for, we can assure you that " +
				Util.MOD_NAME + " will overhaul your gaming experience bringing the realistic Skyrim world to" +
				" life inside a 3D blocky landscape. We hope you enjoy this mod just as much as we enjoyed making it!";

		config.init(event.getSuggestedConfigurationFile());
		SkyrimBlocks.add();
		SkyrimItems.add();
		SkyrimRegistry.register();
		SkyrimEntities.register();
		SkyrimDimensions.register();
		LanguageRegistry.instance().addStringLocalization("itemGroup.Skyrimcraft II", "en_US", "Skyrimcraft II");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
			MinecraftForge.EVENT_BUS.register(new GameEventsHandler());
			MinecraftForge.EVENT_BUS.register(new GuiSkyrimIngame());
			MinecraftForge.EVENT_BUS.register(new SkyrimTickHandler());
			proxy.addKeybinds();
			//MinecraftForgeClient.registerItemRenderer(SkyrimItems.daedricGreatsword.itemID, new TwoHandedRenderer());
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		config.initPost();
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
	}
}