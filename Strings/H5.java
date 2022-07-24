/*5)Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)

i/p:Suman

o/p:uma

*/
import java.util.*;
public class H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		for(int i=1;i<s.length()-1;i++)
		{
			System.out.print(s.charAt(i));
		}

	}

}
