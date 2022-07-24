/*
1) Get an input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output).
Sample input and output 1:
Enter an integer: 12
The square value is 144
The work has been done successfully
Sample input and output 2:
Enter an integer: Java
Entered input is not a valid format for an integer.
*/
import java.util.*;
class Hd15
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		try
		{   
			int i= Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Entered input is not a valid format for an integer.");
		}
		
		
	}
}