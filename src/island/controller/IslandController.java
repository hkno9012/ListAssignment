package island.controller;

import island.model.Island;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//______________________________________

public class IslandController
{
	private Island GilligansIsland;
	//___________________________________
	public IslandController()
	{
		GilligansIsland = new Island();
	}
	//------------------------------------
	public Island getIsland()
	{
		return GilligansIsland;
	}
	//____________________________________
	public void start()
	{
		String userInput = JOptionPane.showInputDialog(null, "What's the name of the TV show that's on an island?");
		GilligansIsland.setName(userInput);
		//-----------------------------------------------------------------------------------------------------------
		int userInputInhabitants = 0;
		userInput = JOptionPane.showInputDialog(null, "How many people are on the island?");
		if(validInt(userInput))
		{
			userInputInhabitants = Integer.parseInt(userInput);
		}
		GilligansIsland.setInhabitants(userInputInhabitants);
		//-----------------------------------------------------------------------------------------------------------
		boolean userInputIsDesertIsland = false;
		userInput = JOptionPane.showInputDialog(null, "Is the island a desert island? (True or False");
		if(validBoolean(userInput))
		{
			userInputIsDesertIsland = Boolean.parseBoolean(userInput);
		}
		GilligansIsland.setIsDesertIsland(userInputIsDesertIsland);
	}
	//____________________________________
	private boolean validInt(String maybeInt)
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
	}
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
	private boolean validBoolean(String maybeBoolean)
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
	}
}
