package inheritance.model;

/**
 * @author rbar3155
 */

public abstract class DS implements GroupsOfFour, Comparable
{
	
	//Three Data Members
	private int girlsAge;
	public int getGirlsAge()
	{
		return girlsAge;
	}
	public void setGirlsAge(int girlsAge)
	{
		this.girlsAge = girlsAge;
	}
	public String getGirlsName()
	{
		return girlsName;
	}
	public void setGirlsName(String girlsName)
	{
		this.girlsName = girlsName;
	}
	public double getGirlsBirthdate()
	{
		return girlsBirthdate;
	}
	public void setGirlsBirthdate(double girlsBirthdate)
	{
		this.girlsBirthdate = girlsBirthdate;
	}
	private String girlsName;
	private double girlsBirthdate;
	public static void add(SH sh)
	{
		// TODO Auto-generated method stub
		
	}
	public static void add(GG gg)
	{
		// TODO Auto-generated method stub
		
	}
	public static Object get(int secondLocation)
	{
		// TODO Auto-generated method stub
		return null;
	}
	public static void set(int secondLocation, DS temp)
	{
		// TODO Auto-generated method stub
		
	}
	public static int size()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
