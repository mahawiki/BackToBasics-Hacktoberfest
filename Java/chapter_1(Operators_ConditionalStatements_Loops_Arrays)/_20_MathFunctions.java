
public class _20_MathFunctions 
{
	public static void main(String[] args) 
	{
		System.out.println("max()= "+Math.max(4.30f,5));  //5.0
		
		System.out.println("min()= "+Math.min(4.30f,5));	//4.3
		
		System.out.println("exp()= "+Math.exp(0));	//e^0	//1.0
		
		System.out.println("pow()= "+Math.pow(2,3));	//8.0
		
		System.out.println("random()= "+Math.random());	//returns betn 0.0 to 1.0
		
		System.out.println("abs(-5)= "+Math.abs(-5)+"   abs(5)= "+Math.abs(5));	//5  5
		
		System.out.println("ceil()= "+Math.ceil(4.73));		// 5.0
			
		System.out.println("floor()= "+Math.floor(4.73));	//4.0
		
		System.out.println("round()= "+Math.round(4.73));	//5     
		System.out.println("round()= "+Math.round(4.3));	//4

		System.out.println("rint()= "+Math.rint(4.73));		//5.0
		System.out.println("rint()= "+Math.rint(4.3));		//4.0

		System.out.println("log()= "+Math.log(1));			//0.0
		
		System.out.println("sqrt()= "+Math.sqrt(4));		//2.0
	}

}
