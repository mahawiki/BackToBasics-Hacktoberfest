package p2;
import p1._2_accessProtection1;
// another pack non-subclass
public class _2_accessProtection5 
{
	public static void main(String args[]) 
	{
		_2_accessProtection1 obj4=new _2_accessProtection1();

		System.out.println(obj4.n1+" ");//+obj4.n2+" "+obj3.n3+" "+obj3.n4);   error
	}
} 