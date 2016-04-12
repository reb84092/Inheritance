package inheritance.controller;

import inheritance.model.DS;
import inheritance.model.GG;
import inheritance.model.SH;
import java.util.ArrayList;

public class InheritanceController
{
	public InheritanceController()
	{
		//build all model components
		makeFourGirlsList();
		//build view
	}
	
	private ArrayList<DS> fourGirls;
	
	public String showGirlsNames()
	{
		return "Michaela Danielle Olivia Caroline";
	}
	
	private void makeFourGirlsList()
	{
		DS.add(new SH());
		DS.add(new GG());
	}
	public void start()
	{
	
	}

}
