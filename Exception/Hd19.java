/*Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the user while executing the program.

In the same Program write your own Exception classes to take care of Negative values and 
values out of range (i.e. other than in the range of 0-100)*/
import java.util.Scanner;
public class Hd19 {

	
	public static void main(String[] args) throws NegativeValueException,OutOfRangeException  {
		
		Scanner sc= new Scanner(System.in);
        System.out.println("enter the name of students");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        System.out.println("enter the marks of students");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        try
        {   
        	int average=(a+b+c)/3;
        	
        	System.out.println(average);
        	
        }
        catch(NumberFormatException e)
        {  
        	e.printStackTrace();
        	
        }
        if(a<0||b<0||c<0)
        {
          	throw new NegativeValueException("negative no.");
        }
        if( a>100 ||b>100||c>100)
        {
          	throw new OutOfRangeException ("out of range");
        }
      
	}

}
class NegativeValueException extends Exception
{
	NegativeValueException(String message)
	{
		super(message);
	}
}
class OutOfRangeException extends Exception
{
	OutOfRangeException(String message)
	{
		super(message);
	}
}