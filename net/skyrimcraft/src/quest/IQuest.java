package net.skyrimcraft.src.quest;

import net.minecraft.item.ItemStack;
import net.skyrimcraft.src.faction.IFaction;

public interface IQuest
{
	public IFaction setQuestFaction();
	public String setQuestName();
	public ItemStack setQuestReward();
	public String setQuestGiver();
	public String setQuestDescription();
	public String setQuestLocation();
}