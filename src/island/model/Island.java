package island.model;

import java.util.ArrayList;

public class Island
{
	private String Name;
	private int Inhabitants;
	private boolean isDesertIsland;
	private ArrayList<String> IslandList;
	//_________________________________
	public Island()
	{
		this.Name = "";
		this.Inhabitants = 0;
		this.isDesertIsland = false;
		this.IslandList = new ArrayList<String>();
	}
	//_________________________________
	public String getName()
	{
		return Name;
	}
	//---------------------------------
	public int getInhabitants()
	{
		return Inhabitants;
	}
	//---------------------------------
	public boolean getIsDesertIsland()
	{
		return isDesertIsland;
	}
	//---------------------------------
	public ArrayList<String> getIslandList()
	{
		return IslandList;
	}
	//__________________________________
	public void setName(String Name)
	{
		this.Name = Name;
	}
	//----------------------------------
	public void setInhabitants(int Inhabitants)
	{
		this.Inhabitants = Inhabitants;
	}
	//----------------------------------
	public void setIsDesertIsland(boolean isDesertIsland)
	{
		this.isDesertIsland = isDesertIsland;
	}
	//----------------------------------
	public void setIslandList(ArrayList<String> IslandList)
	{
		this.IslandList = IslandList;
	}
}
