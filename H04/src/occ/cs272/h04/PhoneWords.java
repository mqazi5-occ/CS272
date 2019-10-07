package occ.cs272.h04;

public class PhoneWords 
{	
	public static void phoneWords(String num) 
	{
		if (num != null)
		{
			phoneWords(num, "");
		}
	}

	public static void phoneWords(String num, String word) 
	{
		if (num.length() == 0)
		{
			System.out.println(word);
		}
		else 
		{
			int digit = num.charAt(0) - '0';
			char keys[] = phoneKey(digit);

			if (keys != null)
			{
				for (int i = 0; i < keys.length; i++) 
				{
					phoneWords(num.substring(1), word + keys[i]);
				}
			}
		}
	}
	
	public static char[] phoneKey(int num)
	{
		switch (num)
		{
		case 0:
			return new char[] {' '};
		case 1:
			return new char[] {'.'};
		case 2:
			return new char[] {'A', 'B', 'C'};
		case 3:
			return new char[] {'D', 'E', 'F'};
		case 4:
			return new char[] {'G', 'H', 'I'};
		case 5:
			return new char[] {'J', 'K', 'L'};
		case 6:
			return new char[] {'M', 'N', 'O'};
		case 7:
			return new char[] {'P', 'Q', 'R', 'S'};
		case 8:
			return new char[] {'T', 'U', 'V'};
		case 9:
			return new char[] {'W', 'X', 'Y', 'Z'};
		}
		return null;
	}
}