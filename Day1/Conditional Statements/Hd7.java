/* Write a program to receive a color code from the user (an Alphabhet). 
The program should then print the color name, based on the color code given.
The following are the color codes and their corresponding color names.
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. */

import java.util.*;
public class Hd7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the color code");
            char c= sc.next().charAt(0);
             switch(c)
             {
               case 'R':
            	   System.out.println("RED");
            	   break;
               case 'B':
            	   System.out.println("Blue");
            	   break;
               case 'G':
            	   System.out.println("Green");
            	   break;
               case 'O':
            	   System.out.println("Orange");
            	   break;
               case 'Y':
            	   System.out.println("Yellow");
            	   break;
               case 'W':
            	   System.out.println("White");
            	   break;
               default:
            	   System.out.println("Invalid Code");
            	   break;
                   
               
             }
             sc.close();
	}

	

}
