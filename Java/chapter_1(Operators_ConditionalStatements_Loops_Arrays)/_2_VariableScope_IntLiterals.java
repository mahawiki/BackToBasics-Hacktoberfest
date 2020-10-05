
class Demo
{
	int n1=10;	//instance level scope
	static int n2=20;	//class or static level scope
	void display()
	{
		int n3=30;	//local level scope
		System.out.println("n1= "+n1+" n2= "+n2+" n3= "+n3);
	}
	
}

public class _2_VariableScope_IntLiterals 
{
	public static void main(String[] args) 
	{
		Demo o=new Demo();
		o.display();
		System.out.println("n1= "+o.n1+"    n2= "+Demo.n2);
		//Integer Literals other bases will be converted into decimal values
		int n1=010;	//octal    =8
		int n2=0xA;	//hexadecimal   =10
		int n3=0b101; //binary  =5
		int n4=12;    //decimal   =12
		System.out.println(" octal no: "+n1+"\n hexadecimal no: "+n2+"\n binary no: "+n3+"\n decimal no: "+n4);

	}
}
