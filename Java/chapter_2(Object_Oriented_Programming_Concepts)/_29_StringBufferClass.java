public class _29_StringBufferClass 
{
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("welcome");
		System.out.println(str.append("ho"));
		System.out.println(str.insert(3, " - "));
		System.out.println(str.replace(10, 11, " dear"));
		System.out.println(str.delete(3, 6));
		System.out.println(str.charAt(5));
		System.out.println(str.substring(2));
		System.out.println(str.reverse());
		System.out.println(str);
		System.out.println(str.length());
	}

}
