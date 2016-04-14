package inheritance.controller;

import inheritance.model.DS;
import inheritance.model.GG;
import inheritance.model.SH;
import java.util.ArrayList;
import inheritance.model.GroupsOfFour;

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
		fourGirls.add(new SH());
		fourGirls.add(new GG());
	}
	
	public void start()
	{
	
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		DS temp = fourGirls.get(firstLocation);
		fourGirls.set(firstLocation, fourGirls.get(secondLocation));
		fourGirls.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < fourGirls.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (fourGirls.get(innerLoop-1).compareTo(fourGirls.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint-1);
			quicksort(midPoint+1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int position= low;
		DS pivot = fourGirls.get(high);
		
		for(int spot = low; spot < high-1; spot++)
		{
			if(fourGirls.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		
		return position;
	}
}
