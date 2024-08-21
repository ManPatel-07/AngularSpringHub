package corejava;

public class StringFunctionality 
{
	public static void main(String[] args)
	{
		String s1 = "Man Patel";
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(2));
		System.out.println(s1.contains("te"));
		System.out.println(s1.startsWith("ma"));
		System.out.println(s1.toLowerCase().startsWith("ma"));
	}
}
