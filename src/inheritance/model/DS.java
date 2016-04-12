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
}
