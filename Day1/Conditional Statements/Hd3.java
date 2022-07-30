//Initialize two character variables in a program and display the characters in alphabetical order.
import java.util.Scanner;

public class Hd3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the char1");
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        if(c1<c2)
        {
        	System.out.println(c1 +", "+c2);
        }
        else
        {
        	System.out.println("c2"+", "+c1);
        }
        sc.close();


	}

}
