package net.skyrimcraft.src.magicka;

public class SpellCandlelight implements Spell
{
	@Override
	public EnumSpellType getSpellType() {
		return EnumSpellType.ALTERATION;
	}
	
	@Override
	public String getSpellName() {
		return "Candlelight";
	}
	
	@Override
	public int skillLevelRequired() {
		return 0;
	}
	
	@Override
	public EnumSpellDifficulty getSpellDifficulty() {
		return EnumSpellDifficulty.NOVICE;
	}
}