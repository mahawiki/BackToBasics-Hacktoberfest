
public class _8_NestedIfElse 
{

	public static void main(String[] args) 
	{
		int no1=40, no2=70, no3=86;
		if(no1>no2)
		{
			if(no1>no3)
			{
				System.out.println("no1 is greater "+no1);
			}
			else
			{
				System.out.println("no3 is greater "+no3);
			}
		}
		else
		{
			if(no2>no3)
			{
				System.out.println("no2 is greater "+no2);
			}
			else
			{
				System.out.println("no3 is greater "+no3);
			}
			
		}

	}

}
