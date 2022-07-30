// Write a program to print * in Floyds format (using for and while loop)
import  java.util.Scanner;
public class FloydsFormatPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the no");
       int num=sc.nextInt();
       for(int i=0;i<num;i++)
       {
    	   for(int j=0;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       sc.close();
	}

}
