package inheritance.model;

public class GG extends DS
{

	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and has a name of: " + namesOfGroupMembers();

		return description;
	}

	/**
	 * If the supplied variable compared comes before the calling variable
	 * return -1. If the supplied variable is after the calling variable return
	 * 1 Else if they are the same, return 0.
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;

		if (compared instanceof DS)
		{
			if (this.getGirlsBirthdate() > ((DS) compared).getGirlsBirthdate())
			{
				comparedValue = 1;
			}
			else if (this.getGirlsBirthdate() > ((DS) compared).getGirlsBirthdate())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}

		return comparedValue;
	}

	@Override
	public String nameOfGroup()
	{
		return "LOTR";
	}

	@Override
	public String namesOfGroupMembers()
	{
		return "CB LT MO EL";
	}

	@Override
	public void sillyAction(int numberOfGroups)
	{

	}
}
