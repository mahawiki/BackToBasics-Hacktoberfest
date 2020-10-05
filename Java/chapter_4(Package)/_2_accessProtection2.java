package p1;
//same pack non-subclass
public class _2_accessProtection2
{
	public static void main(String args[])
	{
		_2_accessProtection1 obj1=new _2_accessProtection1();

		System.out.println(obj1.n1+" "+obj1.n2+" "+obj1.n3+" ");//+obj.n4);   error
	}
} 

//to compile-> javac -d . _2_accessProtection2.java
//to run-> java p2._2_accessProtection2