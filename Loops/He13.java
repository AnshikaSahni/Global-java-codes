/* Write a program to print the sum of all the digits of a given number.
Example1)
I/P:1234
O/P:10*/

import java.util.*;
public class He13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no");
        int num=sc.nextInt();
        int d,sum=0;
        while(num>0)
        {
        	d=num%10;
        	sum=sum+d;
        	num=num/10;
        }
        System.out.println(sum);
	}

}
