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
	private Island[] IslandArray;
	//____________________________________________________________
	public IslandController()
	{
		Hawaii = new Island("Hawaii", 15000, true);
		England = new Island("England", 400000, false);
		Gilligan = new Island("Gilligan's Island", 7, true);
		ArrayList<Island> IslandList = new ArrayList<Island>();
		Island[] IslandArray = new Island[3];
		
		Island[] IslandImageArray = new Island[3];
		IslandImageArray = new Island[3];
		IslandImageArray[0] = new Island(getClass().getResource());
		IslandImageArray[1] = new Island(getClass().getResource());
		IslandImageArray[2] = new Island(getClass().getResource());
	}
	//____________________________________
	public void start()
	{
		arrayInitialization();
	}
	//____________________________________
	private void arrayInitialization()
	{
		JOptionPane.showMessageDialog(null, "When youu initialize an array of objects, \nit is filled with a bunch of null");
		JOptionPane.showMessageDialog(null, "If you try to use them it will crash");
		JOptionPane.showMessageDialog(null, "But if you fill he array with values it is good");
		
		for(int index = 0; index < IslandArray.length; index += 1)
		{
			if (index % 2 == 0)
			{
				IslandArray[index] = new Island();
			}
			else
			{
				IslandArray[index] = new Island();
			}
		}
	}
	//____________________________________
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
	public void buildTheLists()
	{
		IslandList.add(Hawaii);
		IslandList.add(England);
		IslandList.add(Gilligan);
	}
	//_______________________________________________________________________
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
