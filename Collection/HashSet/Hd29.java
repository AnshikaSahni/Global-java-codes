//Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Hd29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s;
				
         HashSet<String> h= new HashSet<>();
         for(int i=0;i<3;i++)
         {
        	 s=sc.next();
        	 h.add(s);
         }
         Iterator<String> i= h.iterator();
         while(i.hasNext())
         {
        	 Object e= i.next();
        	 System.out.print(e+" ");
         }
	}

}
