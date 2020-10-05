package p2;
import p1._2_accessProtection1;
// another pack subclass
public class _2_accessProtection4 extends _2_accessProtection1
{
	public static void main(String args[]) 
	{

		_2_accessProtection4 obj3=new _2_accessProtection4();

		System.out.println(obj3.n1+" "+obj3.n2+" ");//+obj3.n3+" "+obj3.n4);   error

		/*_2_accessProtection1 obj1=new _2_accessProtection1();

		System.out.println(obj1.n1);//+" "+obj1.n2+" "+obj1.n3+" "+obj.n4);   error
		*/
	}
} 
