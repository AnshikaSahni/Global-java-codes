/*Write a Java program to find if the given number is palindrome or not
Example1)
I/P: 110011
O/P: 110011 is a palindrome*/

import java.util.*;
public class He15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("enter the ");
        int num=sc.nextInt();
        String n=Integer.toString(num);
        String str="";
        char c;
        for(int i=n.length()-1;i>=0;i--)
        {
        	c=n.charAt(i);
        	str=c+str;
        }
        
        if(str.toLowerCase().equals(n.toLowerCase()))
        	{
        		System.out.println("is pallindrome");
        	}
        else
        {
        	System.out.println("not pallindrome");
        }

	}

}
