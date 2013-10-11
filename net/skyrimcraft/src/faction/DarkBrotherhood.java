package net.skyrimcraft.src.faction;

public class DarkBrotherhood implements IFaction
{
	public final String[] hq = {
		"Falkreath Sanctuary", "Dawnstar Sanctuary"
	};
	
	@Override
	public String setFactionName() {
		return "Dark Brotherhood";
	}
	
	@Override
	public String setFactionLeader() {
		return "Astrid";
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