import java.util.*;

public class _9_SwitchDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		//char ch=(char) sc.next().charAt(0);
		switch(ch)
		{
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":  System.out.println("it is vowel");
					break;
		default: System.out.println("it is consonant");
		}

	}

}
