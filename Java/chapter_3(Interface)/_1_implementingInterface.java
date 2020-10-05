interface area1
{
	double pi=3.14;
	void areaOfCircle();
}

class _1_implementingInterface implements area1
{
	public void areaOfCircle()
	{
		int r=10;
		double area=pi*r*r;
		System.out.println("area of circle is "+area);
	}

	public static void main(String args[])
	{
		_1_implementingInterface c1=new _1_implementingInterface();
		c1.areaOfCircle();
	}
}