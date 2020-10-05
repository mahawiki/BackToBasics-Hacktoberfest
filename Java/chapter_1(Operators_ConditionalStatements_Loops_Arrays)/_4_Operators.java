
public class _4_Operators 
{

	public static void main(String[] args) 
	{
		//arithmetic 
		int n1=10,n2=5;
		System.out.println("10+5="+(n1+n2));
		System.out.println("10-5="+(n1-n2));
		System.out.println("10*5="+n1*n2);
		System.out.println("10/5="+n1/n2);
		System.out.println("10%5="+n1%n2);
		
		//increment decrement
		System.out.println("10++="+(n1++));
		System.out.println("++5="+(++n2));
		System.out.println("11--="+(n1--));
		System.out.println("--6="+(--n2));
		
		//arithmetic assignment
		System.out.println("10+=2 : "+(n1+=2)); n1=10;
		System.out.println("10-=2 : "+(n1-=2));	n1=10;
		System.out.println("10*=2 : "+(n1*=2));	n1=10;
		System.out.println("10/=2 : "+(n1/=2));	n1=11;
		System.out.println("11%=2 : "+(n1%=2));
		
		//bitwise
		int a=5,b=4;
		System.out.println("0101 & 0100= 0100 ->"+(a&b));
		System.out.println("0101 | 0100= 0101 ->"+(a|b));
		System.out.println("~0101 = "+(~a));	// msb=1...1010 so, it is negative take 2's complement of last 4 bits      
		System.out.println("0101 ^ 0100= 0001 "+(a^b)); a=5;
		System.out.println("0101<<2= 0001 0100 "+(a<<2));  a=5;
		System.out.println("0101>>2= "+(a>>2));	 a=5;
		System.out.println("0101>>>2=  "+(a>>>2));
		/*
		a=-2;
		System.out.println("0101<<2= 0100 "+(a<<2));  a=-2;
		//<< signed right shift msb is preserved
		int res=(a>>2); String ans=Integer.toBinaryString(res);
		System.out.println("1...0010>>2= "+ans+" "+res);	 a=-2;
		//<<< unsigned right shift msb isnt preserved
		 res=(a>>>2);  ans=Integer.toBinaryString(res);
		System.out.println("1...0010>>>2=  "+ans+" "+res); a=-2;
		*/
		
		 a=5;b=4;
		 System.out.println("0101 & 0100= 0100 ->"+(a&=b)); a=5;
		 System.out.println("0101 | 0100= 0101 ->"+(a|=b)); a=5;
		 System.out.println("0101 ^ 0100= 0001 "+(a^=b)); a=5;
		 System.out.println("0101<<2= 0100 "+(a<<=2));  a=5;
		 System.out.println("0101>>2= "+(a>>=2));	 a=5;
		 System.out.println("0101>>>2=  "+(a>>>=2)); 
		 
		 //relational
		 System.out.println("4==2 = "+(4==2));
		 System.out.println("4!=2 = "+(4!=2));
		 System.out.println("4>2 = "+(4>2));
		 System.out.println("4<2 = "+(4<2));
		 System.out.println("4>=2 = "+(4>=2));
		 System.out.println("4<=2 = "+(4<=2));
		 
		 //logical or short circuit 
		 System.out.println(" (4<2) && (10>5) = "+(true && false));
		 System.out.println(" (4<2) || (10>5) = "+((4<2) || (10>5)));


		 //conditional
		 n1=4;n2=5;
		 int largeNo= (n1>n2)?n1:n2;
		 System.out.println("greater no between "+n1+" "+n2+" = "+largeNo);
		

	}

}
