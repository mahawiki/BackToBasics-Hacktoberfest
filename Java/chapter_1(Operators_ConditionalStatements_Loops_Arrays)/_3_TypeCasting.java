
public class _3_TypeCasting 
{

	public static void main(String[] args) 
	{	//implicit conversions
		int n1=40;
		long n2=n1;
		System.out.println("n2= "+n2);
		float n3=50.20f;
		double n4=n3;
		System.out.println("n4= "+n4);
		n3=n1;	// float=int;
		System.out.println("n3= "+n3);
		char n5='A';
		n1=n5;	// int=char;
		System.out.println("n1= "+n1);
		n1=66;
		System.out.println();
		
		//explicit conversions
		long m1=40745398;
		int m2=(int) m1;
		System.out.println("m2= "+m2);
		double m3=50.2069000987;
		float m4=(float) m3;
		System.out.println("m4= "+m4);
		m2=(int) m4;
		System.out.println("m2= "+m2);
		char m5=(char) n1;
		System.out.println("  "+m5);
	}

}
