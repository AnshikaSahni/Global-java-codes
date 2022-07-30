/*Initialize a character variable in a program and 
print" Alphabet" if the initialized value is an alphabhet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the initialized value is anything else.*/

import java.util.*;
public class Hd4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(Character.isDigit(c))
		{
			System.out.println("Digit");
		}
		else if(Character.isAlphabetic(c))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Special Charcter");
		}
		 sc.close();
	}

}
