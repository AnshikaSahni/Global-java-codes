/*Initialize a character variable with an alphabhet in a program.
If the character value is in lowercase, the output should be displayed in uppercase and 
If the character value is in uppercase, the output should be displayed in lowercase 
*/

import java.util.*;
class Hd6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c= sc.next().charAt(0);
		if(Character.isLowerCase(c))
		{
			c=Character.toUpperCase(c);
		}
		else
		{
			c=Character.toLowerCase(c);
		}
           System.out.println(c);
           sc.close();
	}

}
