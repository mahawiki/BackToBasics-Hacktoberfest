import java.util.*;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

class _7_throwsInvalidAgeException
{
	static void check(int age) throws InvalidAgeException
	{
			if(age<18)
			{
				throw new InvalidAgeException("you must be above 18");
			}
	}
	
	public static void main(String args[])
	{
	try{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter age: ");
			int age=sc.nextInt();
			check(age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}