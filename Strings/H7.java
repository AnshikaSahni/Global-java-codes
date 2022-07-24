/*7) Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.
If the input is "xHix", then output is "Hi".
If the input is "America", then the output is "America".*/
import java.util.*;
class H7

{ 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		if(s.startsWith("x") && s.endsWith("x"))
		{
			for(int i=1;i<s.length()-1;i++)
			{
				System.out.print(s.charAt(i));
			}
		}
		else
		{
			System.out.println(s);
		}
	}

  
}
