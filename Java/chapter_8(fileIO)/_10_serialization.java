import java.io.*;

class Student implements Serializable
{
	String name;
	int rid;
	transient String branch; //it will not be included in serialization

	Student(String n, int r, String b)
	{
		name=n;
		rid=r;
		branch=b;
	}
}

class _10_serialization
{
	public static void main(String args[])
	{
	try{
		Student s1=new Student("riddhi" ,44, "CM");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"));
		oos.writeObject(s1);
		System.out.println("success");
		oos.close();
		}
		catch(Exception e){}
	}
}