/* Write a program to reverse a given number and print
Example1)
I/P: 1234
O/P:4321*/
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        System.out.println("enter the no");
	        int num=sc.nextInt();
	        String n=Integer.toString(num);
	        for(int i=n.length()-1;i>=0;i--)
	        {
	        	System.out.print(n.charAt(i));
	        }
	        sc.close();
	}
	

}
