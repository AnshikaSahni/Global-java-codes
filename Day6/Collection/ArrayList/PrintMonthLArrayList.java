//Write a Java program to create an ArrayList, add all the months of a year and print the same.
import java.util.ArrayList;
public class PrintMonthLArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list= new ArrayList<>();
		list.add("january");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("june");
		list.add("july");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		System.out.println(list);
		for(int i=0;i<12;i++)
		{
			System.out.print(list.get(i)+" ");
		}

	}

}
