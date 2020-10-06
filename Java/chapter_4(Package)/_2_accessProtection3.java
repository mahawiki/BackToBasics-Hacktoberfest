package p1;
//same pack subclass
public class _2_accessProtection3 extends _2_accessProtection1
{
	public static void main(String args[])
	{
		_2_accessProtection3 obj2=new _2_accessProtection3();

		System.out.println(obj2.n1+" "+obj2.n2+" "+obj2.n3+" "); //+obj2.n4);  error

		/*_2_accessProtection1 obj1=new _2_accessProtection1();

		System.out.println(obj1.n1+" "+obj1.n2+" "+obj1.n3+" ");//+obj.n4);   error
		*/
	}
} 