import java.io.*;
class Book
{
	int bookid;
	String bookname;
	int price;

	void getData(int id,String name,int pr)
	{
		bookid=id;
		bookname=name;
		price=pr;
	}

	void display()
	{
		System.out.println("bookid: "+bookid+" bookname: "+bookname+" price: "+price);
	}
}

class _1_arrayOfObjects
{
	public static void main(String[] args) 
	{
		Book b[]=new Book[7];
	try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter bookid bookname and price for 7 books: ");
		for(int i=0;i<2;i++)
		{
			int id=Integer.parseInt(br.readLine());
			String name=br.readLine();
			int price=Integer.parseInt(br.readLine());
			b[i]=new Book();
			b[i].getData(id,name,price);
		}

		System.out.println("data you entered: ");
		for(int i=0;i<2;i++)
		{
			b[i].display();
		}

		}catch(Exception e){}
		
	}
}