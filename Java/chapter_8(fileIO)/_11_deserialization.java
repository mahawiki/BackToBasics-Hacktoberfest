import java.io.*;

class _11_deserialization
{
	public static void main(String args[])
	{
		Student s2=null;
	try{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.txt"));
		s2=(Student)ois.readObject();

		}
		catch(Exception e){}
		System.out.println("name : "+s2.name+" rid : "+s2.rid+" branch : "+s2.branch);
	}
}