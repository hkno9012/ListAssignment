package island.controller;

import island.model.Island;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//______________________________________


public class IslandController
{
	private Island Hawaii;
	private Island England;
	private Island Gilligan;
	private ArrayList<Island> IslandList;
	//___________________________________
	public IslandController()
	{
		Hawaii = new Island();
		England = new Island();
		Gilligan = new Island();
		ArrayList<Island> IslandList = new ArrayList<Island>();
	}
	//------------------------------------
	public Island getHawaii()
	{
		return Hawaii;
	}
	//-------------------------------------
	public Island getEngland()
	{
		return England;
	}
	//-------------------------------------
	public Island getGilligan()
	{
		return Gilligan;
	}
	//____________________________________
	public void start()
	{
		
	}
	//____________________________________
	public void buildTheLists()
	{
		IslandList.add(Hawaii);
		IslandList.add(England);
		IslandList.add(Gilligan);
	}
	//____________________________________________
	/*private boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException exception)
		{
			JOptionPane.showMessageDialog(null, "Type in a whole number");
		}
		
		return isValid;
	}*/
	//-------------------------------------------------------------------------------------
	/*private boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException exception)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value");
		}
		
		return isValid;
	}*/
	//-----------------------------------------------------------------------------------
	/*private boolean validBoolean(String maybeBoolean)
	{
		boolean isValid = false;
		
		try
		{
			Boolean.parseBoolean(maybeBoolean);
			isValid = true;
		}
		catch (NumberFormatException exception)
		{
			JOptionPane.showMessageDialog(null, "Type True or False");
		}
		return isValid;
	}*/
}
