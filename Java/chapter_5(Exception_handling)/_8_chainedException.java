
class _8_chainedException
{
	 void m1()
	{
		NullPointerException ne=new NullPointerException("(top Exception)");

		ne.initCause(new ArithmeticException("(causing Exception)"));

		throw ne;
	}

	public static void main(String args[])
	{
		_8_chainedException obj=new _8_chainedException();

		try{
			   obj.m1();
			}
		catch(Exception e)
			{
			    System.out.println("exception occured = "+e+"\n due to = "+e.getCause());
			}
	}
}



