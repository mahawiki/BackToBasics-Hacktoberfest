class _6_staticMethodOverloading
{
	static void area(int l)
	{
		System.out.println("area of square is: "+(l*l));
	}

	static void area(int l, int b)
	{
		System.out.println("area of rectangle is: "+(0.5*l*b));
	}

	public static void main(String args[])
	{
		area(2);
		area(2,8);
	}

}