/*Write a program to accept gender ("Male" or "Female")  and age from the key board and print the percentage of interest based on the given conditions.
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.")*/ 
import java.util.*;
public class Hd5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the gender");
		String s=sc.nextLine();
		System.out.println("enter the age");
		int i=sc.nextInt();
		if(s.equalsIgnoreCase("Female") )
		{ 
			if((i>1 && i<58))
			{
			System.out.println("percentage of interest is 8.2%");
			}
			else if( (i>58 && i<100))
			{ 
				System.out.println("percentage of interest is 9.2%");
				
			}
			
		}
		else if(s.equalsIgnoreCase("Male")) 
		{   
			if((i>1 && i<58))
			System.out.println("percentage of interest is 8.4%.");
			
			else if( (i>58 && i<100))
			{   
				System.out.println("the percentage of interest is 10.5%");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
		
		 sc.close();

	}

}
