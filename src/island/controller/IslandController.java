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
		
		userInput = JOptionPane.showInputDialog(null, "How many people are on the island?");
		
		GilligansIsland.setInhabitants(userInput);
	}
	//____________________________________
	private boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);//If the String can turn into an integer, then it's valid
			isValid = true;
		}
		//If this particular exception is caught, fix it with the following
		catch (NumberFormatException exception)//Always use this exception with parse methods
		{
			JOptionPane.showMessageDialog(null, "Type in a whole number");
		}
		
		return isValid;
	}
	//-------------------------------------------------------------------------------------
	private boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(maybeDouble);//If the String can turn into a double, then it's valid
			isValid = true;
		}
		//If this particular exception is thrown, catch it with the following
		catch (NumberFormatException exception)//Always use this exception with parse methods
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value");
		}
		
		return isValid;
	}
}
