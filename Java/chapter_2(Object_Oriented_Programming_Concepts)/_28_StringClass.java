public class _28_StringClass 
{
	public static void main(String[] args) 
	{
		String s1="welcome   ";
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(3));
		System.out.println(s1.contains("wel"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.trim());
		System.out.println(s1.concat(" India"));
		System.out.println(s1.indexOf("come"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.compareTo(s1));
	}

}
