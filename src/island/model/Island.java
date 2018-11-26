package island.model;

public class Island
{
	private String Name;
	private int Inhabitants;
	private boolean isWarm;
	//_________________________________
	public Island()
	{
		/*this.Name = "";
		this.Inhabitants = 0;
		this.isWarm = true;*/
	}
	//---------------------------------
	public Island(String Name, int Inhabitants, boolean isWarm)
	{
		this.Inhabitants = Inhabitants;
		this.Name = "My Island: " + Inhabitants + " people";
		this.isWarm = true;
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
	public boolean getIsWarm()
	{
		return isWarm;
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
	public void setIsWarm(boolean isWarm)
	{
		this.isWarm = isWarm;
	}
}
