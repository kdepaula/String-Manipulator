/**
 * 
 * @author kdepaula20
 *
 */

public class StringManipulator 
{	
	public String noVowel(String s)
	{
		String str = s;
		String stringNew = "";
		
		for(int i = 0; i<str.length(); i++)
			{
			
			if(str.substring(i, i+1).equals("a") || str.substring(i, i+1).equals("i") || 
				str.substring(i, i+1).equals("o") || str.substring(i, i+1).equals("e") || 
				str.substring(i, i+1).equals("u") || str.substring(i, i+1).equals("A") || 
				str.substring(i, i+1).equals("I") || str.substring(i, i+1).equals("O") || 
				str.substring(i, i+1).equals("E") || str.substring(i, i+1).equals("U"))
				{
					stringNew += "*";
				}
			else
				{
					stringNew += str.substring(i, i+1);
				}
			
			}
		return stringNew;
	}
	
	public String reverse(String rev)
	{
		String str = rev;
		String stringNew = "";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			stringNew += str.charAt(i);
		}
		
		return stringNew;
	}
}

