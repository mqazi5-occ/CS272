/**
 * 
 */
package occ.cs272.ic06;

/**
 * @author Mohammad Usman Qazi
 * @version Sep 30, 2019
 */
public class Recursion 
{
	public static String reverse(String text)
	{
		int len = text.length() - 1;
		if (len + 1 == 1)
		{
			return text;
		}
		return text.substring(len) + reverse(text.substring(0, len));
	}
	
	public static String reverse(String text, int start, int end)
	{
		return text.substring(end) + reverse2(text.substring(start, end));
	}
	
	public static String reverse2 (String text)
	{
		int len = text.length();
		if (len == 1)
		{
			return text;
		}
		return reverse(text, 0, len - 1);
	}
	
	public static String reverseIt (String text)
	{
		char first = text.charAt(0);
		if (text.length() == 1)
		{
			return text;
		}
		String result = "";
		for (int i = text.length() - 1; i >= 1; i--)
		{
			result += text.charAt(i);
		}
		result += first;
		return result;
	}

	public static void main(String[] args) 
	{
		// Part A
		System.out.println("Part A:");
		System.out.println(reverse("Hello!"));
		System.out.println(reverse("Orange Coast College"));
		System.out.println(reverse("go"));
		System.out.println(reverse("x"));
		
		System.out.println();
		
		//	Part B
		System.out.println("Part B:");
		System.out.println(reverse2("Hello!"));
		System.out.println(reverse2("Orange Coast College"));
		System.out.println(reverse2("go"));
		System.out.println(reverse2("x"));
		
		System.out.println();
		
		//	Part C
		System.out.println("Part C:");
		System.out.println(reverseIt("Hello!"));
		System.out.println(reverseIt("Orange Coast College"));
		System.out.println(reverseIt("go"));
		System.out.println(reverseIt("x"));
		
	}

}
