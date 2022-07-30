//2) Create an ArrayList that can store only Strings.
//Create a printAll method that will print all the elements of the ArrayList using an Iterator.
import java.util.*;
public class StoreStringArrayList {
 void printAll(ArrayList<String> list)
	{   
		Iterator i=list.iterator();

        while(i.hasNext())

       {

         System.out.println(i.next());

        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("anshika");
		list.add("jitu");
		list.add("sahni");
		StoreStringArrayList a= new StoreStringArrayList();
		a.printAll(list);

	}

}
