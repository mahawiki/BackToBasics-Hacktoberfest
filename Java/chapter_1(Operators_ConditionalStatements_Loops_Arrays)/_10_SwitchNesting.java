
public class _10_SwitchNesting 
{

	public static void main(String[] args) 
		{
			int ch=1;
			System.out.println("enter choice 1.fruits 2.flowers 3.veggies");
				switch(ch)
				{
				case 1:  System.out.println("\tEnter subchoice: 1.mango 2.kiwi 3.watermelon ");
						 ch=2;
						 switch(ch)
						 {
						 case 1: System.out.println("im mango");
						 		  break;
						 case 2: System.out.println("\t\tim kiwi");
				 		  		  break;
						 case 3: System.out.println("im watermelon");
				 		  		  break;  
						 }
						break;
				case 2: System.out.println("you chose flower");
				 		 break;  
				case 3: System.out.println("you chose veggies");
						break;  
				default: System.out.println("Enter valid choice");			
				}
		}

}
