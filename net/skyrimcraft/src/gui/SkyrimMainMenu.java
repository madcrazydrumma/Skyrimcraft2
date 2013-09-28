package net.skyrimcraft.src.gui;

import static org.lwjgl.opengl.GL11.glColor4f;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glRotatef;
import static org.lwjgl.opengl.GL11.glScalef;
import static org.lwjgl.opengl.GL11.glTranslatef;

import java.io.IOException;
import java.net.URI;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiConfirmOpenLink;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreenOnlineServers;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.client.mco.ExceptionMcoService;
import net.minecraft.client.mco.GuiScreenClientOutdated;
import net.minecraft.client.mco.McoClient;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.demo.DemoWorldServer;
import net.minecraft.world.storage.ISaveFormat;
import net.minecraft.world.storage.WorldInfo;
import cpw.mods.fml.client.GuiModList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SkyrimMainMenu extends GuiMainMenu
{
    /** The RNG used by the Main Menu Screen. */
    private static final Random rand = new Random();

    /** Counts the number of screen updates. */
    private float updateCounter;
    private GuiClearButton buttonResetDemo;

    /** Timer used to rotate the panorama, increases every tick. */
    private int panoramaTimer;

    /**
     * Texture allocated for the current viewport of the main menu's panorama background.
     */
    private DynamicTexture viewportTexture;
    private boolean field_96141_q = true;
    private static boolean field_96140_r;
    private static boolean field_96139_s;
    private final Object field_104025_t = new Object();
    private String field_92025_p;
    private String field_104024_v;
    //private static final ResourceLocation field_110353_x = new ResourceLocation("texts/splashes.txt");
    private static final ResourceLocation field_110352_y = new ResourceLocation("skyrimcraftii", "/textures/title/mclogo.png");

    /** An array of all the paths to the panorama pictures. */
    //private static final ResourceLocation[] titlePanoramaPaths = new ResourceLocation[] {new ResourceLocation("textures/gui/title/background/panorama_0.png"), new ResourceLocation("textures/gui/title/background/panorama_1.png"), new ResourceLocation("textures/gui/title/background/panorama_2.png"), new ResourceLocation("textures/gui/title/background/panorama_3.png"), new ResourceLocation("textures/gui/title/background/panorama_4.png"), new ResourceLocation("textures/gui/title/background/panorama_5.png")};
    public static final String field_96138_a = "Please click " + EnumChatFormatting.UNDERLINE + "here" + EnumChatFormatting.RESET + " for more information.";
    private int field_92024_r;
    private int field_92023_s;
    private int field_92022_t;
    private int field_92021_u;
    private int field_92020_v;
    private int field_92019_w;
    private ResourceLocation field_110351_G;
    private GuiClearButton field_130023_H;
    
    private GuiClearButton fmlModButton = null;
    
    //EDIT
    
    //EDIT

    public SkyrimMainMenu()
    {
        this.updateCounter = rand.nextFloat();
        this.field_92025_p = "";
        String s1 = System.getProperty("os_architecture");

        if ("ppc".equalsIgnoreCase(s1))
        {
            this.field_92025_p = "" + EnumChatFormatting.BOLD + "Notice!" + EnumChatFormatting.RESET + " PowerPC compatibility will be dropped in Minecraft 1.6";
            this.field_104024_v = "http://tinyurl.com/javappc";
        }
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        ++this.panoramaTimer;
    }

    /**
     * Returns true if this GUI should pause the game when it is displayed in single-player
     */
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    /**
     * Fired when a key is typed. This is the equivalent of KeyListener.keyTyped(KeyEvent e).
     */
    protected void keyTyped(char par1, int par2) {
    	//edit
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        this.viewportTexture = new DynamicTexture(256, 256);
        this.field_110351_G = this.mc.func_110434_K().func_110578_a("background", this.viewportTexture);

        boolean flag = true;
        int i = this.height / 4 + 48;

        if (this.mc.isDemo())
        {
            this.addDemoButtons(i, 24);
        }
        else
        {
            this.addSingleplayerMultiplayerButtons(i, 24);
        }
        
        this.buttonList.add(new GuiClearButton(0, this.width - 120, i + 24 * 3, 98, 20, I18n.func_135053_a("menu.options")));
        this.buttonList.add(new GuiClearButton(4, this.width - 120, i + 24 * 4, 98, 20, I18n.func_135053_a("menu.quit")));
    }

    private void func_130022_h()
    {
        this.field_130023_H.drawButton = true;
        fmlModButton.width = 98;
        fmlModButton.xPosition = this.width / 2 + 2;
    }
    
    private void addSingleplayerMultiplayerButtons(int par1, int par2)
    {
        this.buttonList.add(new GuiClearButton(1, this.width - 120, par1, 98, 20, I18n.func_135053_a("menu.singleplayer")));
        this.buttonList.add(new GuiClearButton(2, this.width - 120, par1 + par2 * 1, 98, 20, I18n.func_135053_a("menu.multiplayer")));
        //If Minecraft Realms is enabled, halve the size of both buttons and set them next to eachother.
        fmlModButton = new GuiClearButton(6, this.width - 120, par1 + par2 * 2, 98, 20, "Mods");
        this.buttonList.add(fmlModButton);

        field_130023_H = new GuiClearButton(14, this.width - 120, par1 + par2 * 2, 98, 20, I18n.func_135053_a("menu.online"));
        field_130023_H.width = 98;
        field_130023_H.xPosition = this.width - 120;
        this.buttonList.add(field_130023_H);
        this.field_130023_H.drawButton = false;
    }
    
    private void addDemoButtons(int par1, int par2)
    {
        this.buttonList.add(new GuiClearButton(11, this.width - 200, par1, 98, 20, I18n.func_135053_a("menu.playdemo")));
        this.buttonList.add(this.buttonResetDemo = new GuiClearButton(12, this.width - 200, par1 + par2 * 1, 98, 20, I18n.func_135053_a("menu.resetdemo")));
        ISaveFormat isaveformat = this.mc.getSaveLoader();
        WorldInfo worldinfo = isaveformat.getWorldInfo("Demo_World");

        if (worldinfo == null)
        {
            this.buttonResetDemo.enabled = false;
        }
    }

    /**
     * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
     */
    protected void actionPerformed(GuiButton par1GuiClearButton)
    {
        if (par1GuiClearButton.id == 0)
        {
            this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
        }

        if (par1GuiClearButton.id == 1)
        {
            this.mc.displayGuiScreen(new GuiSelectWorld(this));
        }

        if (par1GuiClearButton.id == 2)
        {
            this.mc.displayGuiScreen(new GuiMultiplayer(this));
        }

        if (par1GuiClearButton.id == 14 && this.field_130023_H.drawButton)
        {
            this.func_140005_i();
        }

        if (par1GuiClearButton.id == 4)
        {
            this.mc.shutdown();
        }

        if (par1GuiClearButton.id == 6)
        {
            this.mc.displayGuiScreen(new GuiModList(this));
        }

        if (par1GuiClearButton.id == 11)
        {
            this.mc.launchIntegratedServer("Demo_World", "Demo_World", DemoWorldServer.demoWorldSettings);
        }

        if (par1GuiClearButton.id == 12)
        {
            ISaveFormat isaveformat = this.mc.getSaveLoader();
            WorldInfo worldinfo = isaveformat.getWorldInfo("Demo_World");

            if (worldinfo != null)
            {
                GuiYesNo guiyesno = GuiSelectWorld.getDeleteWorldScreen(this, worldinfo.getWorldName(), 12);
                this.mc.displayGuiScreen(guiyesno);
            }
        }
    }

    private void func_140005_i()
    {
        McoClient mcoclient = new McoClient(this.mc.func_110432_I());

        try
        {
            if (mcoclient.func_140054_c().booleanValue())
            {
                this.mc.displayGuiScreen(new GuiScreenClientOutdated(this));
            }
            else
            {
                this.mc.displayGuiScreen(new GuiScreenOnlineServers(this));
            }
        }
        catch (ExceptionMcoService exceptionmcoservice)
        {
            this.mc.getLogAgent().logSevere(exceptionmcoservice.toString());
        }
        catch (IOException ioexception)
        {
            this.mc.getLogAgent().logSevere(ioexception.getLocalizedMessage());
        }
    }

    public void confirmClicked(boolean par1, int par2)
    {
        if (par1 && par2 == 12)
        {
            ISaveFormat isaveformat = this.mc.getSaveLoader();
            isaveformat.flushCache();
            isaveformat.deleteWorldDirectory("Demo_World");
            this.mc.displayGuiScreen(this);
        }
        else if (par2 == 13)
        {
            if (par1)
            {
                try
                {
                    Class oclass = Class.forName("java.awt.Desktop");
                    Object object = oclass.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
                    oclass.getMethod("browse", new Class[] {URI.class}).invoke(object, new Object[] {new URI(this.field_104024_v)});
                }
                catch (Throwable throwable)
                {
                    throwable.printStackTrace();
                }
            }

            this.mc.displayGuiScreen(this);
        }
    }
    
    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        //this.renderSkybox(par1, par2, par3);
        Tessellator tessellator = Tessellator.instance;
        short short1 = 200;
        int k = this.width / 2 - short1;
        int b0 = this.height / 2 + 300;
        //this.drawGradientRect(0, 0, this.width, this.height, 0xAA000000, 0xAA111111);
        //this.drawGradientRect(0, 0, this.width, this.height, 0xAA000000, 0xAA111111);
        drawRect(0, 0, this.width, this.height, 0xAA000000);
        this.mc.func_110434_K().func_110577_a(field_110352_y);
        glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        glPushMatrix();
        glScalef(0.5F, 0.5F, 0.5F);

        if ((double)this.updateCounter < 1.0E-4D)
        {
            this.drawTexturedModalRect(k + 0, b0 + 0, 0, 0, 99, 44);
            this.drawTexturedModalRect(k + 99, b0 + 0, 129, 0, 27, 44);
            this.drawTexturedModalRect(k + 99 + 26, b0 + 0, 126, 0, 3, 44);
            this.drawTexturedModalRect(k + 99 + 26 + 3, b0 + 0, 99, 0, 26, 44);
            this.drawTexturedModalRect(k + 155, b0 + 0, 0, 45, 155, 44);
        }
        else
        {
            this.drawTexturedModalRect(k + 0, b0 + 0, 0, 0, 155, 44);
            this.drawTexturedModalRect(k + 155, b0 + 0, 0, 45, 155, 44);
        }
        
        glPopMatrix();

        tessellator.setColorOpaque_I(16777215);
        glPushMatrix();
        glTranslatef((float)(this.width / 2 + 90), 70.0F, 0.0F);
        glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
        glPopMatrix();
        
        ResourceLocation emblem = new ResourceLocation("skyrimcraftii", "/textures/title/emblem1.png");
        this.mc.func_110434_K().func_110577_a(emblem);
        glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        glPushMatrix();
        glScalef(1.4F, 1.25F, 1.25F);
        drawTexturedModalRect(width / 2 - 140, 20, 0, 0, 69, 128);
        glPopMatrix();

        super.drawScreen(par1, par2, par3);
    }

    /**
     * Called when the mouse is clicked.
     */
    protected void mouseClicked(int par1, int par2, int par3)
    {
        super.mouseClicked(par1, par2, par3);
        Object object = this.field_104025_t;

        synchronized (this.field_104025_t)
        {
            if (this.field_92025_p.length() > 0 && par1 >= this.field_92022_t && par1 <= this.field_92020_v && par2 >= this.field_92021_u && par2 <= this.field_92019_w)
            {
                GuiConfirmOpenLink guiconfirmopenlink = new GuiConfirmOpenLink(this, this.field_104024_v, 13, true);
                guiconfirmopenlink.func_92026_h();
                this.mc.displayGuiScreen(guiconfirmopenlink);
            }
        }
    }

    static Minecraft func_110348_a(SkyrimMainMenu par0GuiMainMenu)
    {
        return par0GuiMainMenu.mc;
    }

    static void func_130021_b(SkyrimMainMenu par0GuiMainMenu)
    {
        par0GuiMainMenu.func_130022_h();
    }

    static boolean func_110349_a(boolean par0)
    {
        field_96139_s = par0;
        return par0;
    }

    static Minecraft func_130018_c(SkyrimMainMenu par0GuiMainMenu)
    {
        return par0GuiMainMenu.mc;
    }

    static Minecraft func_130019_d(SkyrimMainMenu par0GuiMainMenu)
    {
        return par0GuiMainMenu.mc;
    }
}