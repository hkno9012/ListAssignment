package island.model;

import java.util.ArrayList;

public class Island
{
	private String Name;
	private int Inhabitants;
	private boolean isDesertIsland;
	//_________________________________
	public Island()
	{
		this.Name = "";
		this.Inhabitants = 0;
		this.isDesertIsland = false;
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
}
