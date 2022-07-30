/* Write a java program that will concatenate 2 strings and return the result.
The result should be in lowercase.
Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar*/

public class StringConcatLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mark";
		String s2="kate";
		if(s1.length()!=0 && s2.length()!=0)
		{
			if(s1.charAt(s1.length()-1)==s2.charAt(0))
			{
				String y= s1+s2.substring(1);
				System.out.println(y);
			}
			else
			{
				System.out.println(s1+s2);
			}
		}

	}

}
