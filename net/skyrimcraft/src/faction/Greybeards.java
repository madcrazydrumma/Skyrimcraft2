package net.skyrimcraft.src.faction;

public class Greybeards implements IFaction
{
	public final String[] hq = {
		"High Hrothgar"
	};
	
	@Override
	public String setFactionName() {
		return "Greybeards";
	}
	
	@Override
	public String setFactionLeader() {
		return "Paarthurnax";
	}
	
	@Override
	public boolean isFactionJoinable() {
		return true;
	}
	
	@Override
	public String[] setHQLocation() {
		return hq;
	}
}