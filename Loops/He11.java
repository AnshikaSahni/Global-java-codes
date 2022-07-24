//3) Write a program to check if a given number is prime or not.
import java.util.*;
public class He11 {

	public static void main(String[] args) {
	     Scanner sc= new Scanner(System.in);
	     System.out.println("enter the number");
        int a=sc.nextInt();
        int flag=0;
        for(int i=2;i<a/2;i++)
        {
        	if(a%i==0)
        	{
        		System.out.println("not a prime no.");
        	    flag=1;
        	    break;
        	}
        }
        if(flag==0)
        {
        	System.out.println("prime no");
        }
	}

}
