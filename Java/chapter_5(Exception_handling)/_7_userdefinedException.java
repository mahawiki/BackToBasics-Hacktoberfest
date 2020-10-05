
class UserException extends Exception
{
	UserException(String s)
	{
		super(s);
	}
}


class _7_userdefinedException
{	
	public static void main(String args[])
	{ int marks=8;
		try{

				 if(marks<35)
				 	throw new UserException("failed in exams ");
				 else
			 	 System.out.println("passed congratulation");
			}
			catch(Exception e)
			{
				System.out.println("exception "+e);
			}
		System.out.println("rest code");
	}
}