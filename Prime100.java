class Prime
{
	public static void main(String args[])
	{
		for (int i = 2; i < 100; i++)
		{
			int number = i;
			boolean found = false;			
			for (int j = 2; j < number; j++)
			{
				if (i%j == 0)
				{
					found = true;
				}
			}
			if (!found)
			{
				System.out.println(number);
			}
		}
	}
}
