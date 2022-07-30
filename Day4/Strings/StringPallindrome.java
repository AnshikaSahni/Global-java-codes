//Write a Program to check whether a given String is Palindrome or not.
import java.util.*;
public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the string");
         String s= sc.nextLine();
         String s1="";
         for(int i=s.length()-1;i>=0;i--)
         {
        	 s1+=s.charAt(i);
         }
         if(s1.equals(s))
         {
        	 System.out.println("pallindrome");
         }
         else
         {
        	 System.out.println("not pallindrome");
         }
         sc.close();
	}

}
