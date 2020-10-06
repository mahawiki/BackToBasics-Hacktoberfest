
public class _31_wrapperClass
{
	public static void main(String[] args) 
	{	int n1=10;
		Integer no1=new Integer(n1);	   //create object
		System.out.println(no1);

		no1=Integer.valueOf("40");   //string to object
		System.out.println(no1);
		no1=Integer.valueOf(20);   //primitive to object
		System.out.println(no1);

		n1=no1.intValue();			   // object to primitive type
		System.out.println(n1);

		n1=Integer.parseInt("30");	   //string to primitive
		System.out.println(n1);

		String s1=Integer.toString(n1);    //primitive to string 
		System.out.println(s1);
		s1=no1.toString();    //object to string
		System.out.println(s1);
		
		 
		
	}
}
