import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//Assigment1-Write a Java program to create an ArrayList, add all the months of a year and print the same.
//Implement the assignment 1 using TreeSet
public class PrintMonthTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>T= new TreeSet<>();
		T.add("january");
 		T.add("February");
 		T.add("March");
 		T.add("April");
 		T.add("May");
 		T.add("june");
 		T.add("july");
 		T.add("August");
 		T.add("September");
 		T.add("October");
 		T.add("November");
 		T.add("December");
 		Iterator<String> i= T.iterator();
        while(i.hasNext())
         {
        	 Object e= i.next();
        	 System.out.print(e+" ");
         }
        Iterator<String> j= T.descendingIterator();
        while(j.hasNext())
        {
       	 System.out.print(j.next()+" ");
        }
	}

}
