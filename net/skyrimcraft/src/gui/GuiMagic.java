package net.skyrimcraft.src.gui;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.skyrimcraft.src.magicka.EnumSpellType;

public class GuiMagic extends GuiScreen
{
	private List<EnumSpellType> spellTypes;
	
	public GuiMagic() {
		allowUserInput = true;
		spellTypes = new ArrayList<EnumSpellType>(EnumSet.allOf(EnumSpellType.class));
	}
	
	public boolean doesGuiPauseGame() {
		return true;
	}
	
	public void drawScreen(int par1, int par2, float par3) {
		drawDefaultBackground();
		
		drawRect(width - 90, 0, width - 10, height, 0xAA000000);
		drawRect(width - 88, 0, width - 87, height, 0xAAFFFFFF);
		drawRect(width - 13, 0, width - 12, height, 0xAAFFFFFF);
		
		drawRect(width - 190, 0, width - 110, height, 0x88CCCCCC);
		drawRect(width - 188, 0, width - 187, height, 0xAAFFFFFF);
		drawRect(width - 113, 0, width - 112, height, 0xAAFFFFFF);
		
		drawRect(0, (height * 3) / 4 + 20, width, height, 0xBB000000);
		drawRect(0, (height * 3) / 4 + 22, width, (height * 3) / 4 + 23, 0xAAFFFFFF);
		
		for(int i = 0; i < spellTypes.size(); i++) {
			drawString(fontRenderer, spellTypes.get(i).toString(), width - 84, (height / 4 ) + (20 * i), 0xffffff);
		}
		
		/*drawGradientRect(width - 180, (height + 50) / 2, width - 20, (height + 50) / 2 + 80, 0xc0101010, 0xd0101010);
        drawHorizontalLine(width - 178, width - 23, (height + 50) / 2 + 2, 0xc0c9c9c9);
        drawHorizontalLine(width - 178, width - 23, (height + 50) / 2 + 77, 0xc0c9c9c9);
        drawVerticalLine(width - 178, (height + 50) / 2 + 77, (height + 50) / 2 + 2, 0xc0c9c9c9);
        drawVerticalLine(width - 23, (height + 50) / 2 + 77, (height + 50) / 2 + 2, 0xc0c9c9c9);*/
		
		//The above will draw a box for describing the spell!
		
		super.drawScreen(par1, par2, par3);
	}
}