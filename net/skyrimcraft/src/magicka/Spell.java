package net.skyrimcraft.src.magicka;

public interface Spell
{
	public EnumSpellType getSpellType();
	public String getSpellName();
	public int skillLevelRequired();
	public EnumSpellDifficulty getSpellDifficulty();
}