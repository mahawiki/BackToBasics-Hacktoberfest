import java.util.*;

public class _5_IfDemo_ScannerClass 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks : ");

		int marks=sc.nextInt();
		if(marks>75)
		{
			System.out.println("distinction");
		}

	}

}
