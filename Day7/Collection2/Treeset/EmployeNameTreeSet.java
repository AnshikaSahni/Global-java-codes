//Write a program to store a group of employee names into a TreeSet, retrieve the elements one by one using an Iterator.


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class EmployeNameTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>h= new TreeSet<>();
		h.add("anshika");
		h.add("jitin");
		h.add("sahni");
		Iterator<String> i= h.iterator();
        while(i.hasNext())
         {
        	 Object e= i.next();
        	 System.out.print(e+" ");
         }
        if(h.contains("anshika"))
        {
        	System.out.println("exist");
        }
        else
        {
        	System.out.println("not exist");
        }
        
        

	}

}
