//Write a program to check if a given integer number is Positive, Negative, or Zero.
import java.util.*;
public class Hd1 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 int i=sc.nextInt();
		 System.out.println("enter the integer");
		 if(i<0)
		 {
			 System.out.println("negaive");
		 }
		 else if(i>0)
		 {
			 System.out.println("positive");
		 }
		 else
		 {
			 System.out.println("zero");
		 }
		 sc.close();
	}

}
