package net.skyrimcraft.src.faction;

public interface IFaction
{
	public String setFactionName();
	public String setFactionLeader();
	public boolean isFactionJoinable();
	public String[] setHQLocation();
}