//Write a Program with a division method which receives two integer numbers and performs the division operation.
import java.util.Scanner;
public class Hd18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
		      int c=a/b;
		      System.out.println(c);
		}
		catch(ArithmeticException e )
		{
			e.printStackTrace();
		}
	}

}
