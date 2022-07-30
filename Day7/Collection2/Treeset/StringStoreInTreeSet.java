

/*3) Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.*/




import java.util.*;
public class StringStoreInTreeSet {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<>();
		
		tset.add("Apple");
		tset.add("Orange");
		tset.add("Banana");
		tset.add("Mango");
		
		Iterator<String> itrev = tset.descendingIterator();
		
		System.out.println("Tree set values in reverse order :: ");
		while(itrev.hasNext()) {
			System.out.println(itrev.next());
		}
		
		System.out.println();
		
		Iterator<String> it = tset.iterator();
		
		System.out.println("TreeSet contains in normal order :: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("Check for a particular element exists or not ? ");
		System.out.println("Tree Set Contains Rahul : "+tset.contains("Rahul"));
		System.out.println("Tree Set Contains Apple: "+tset.contains("Apple"));
	}
}
