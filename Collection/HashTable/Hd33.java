//Write a program that will have a Properties class object which is capable of storing some States of India
//and their Capital. Use an Iterator to list all the elements stored in the Propertie
import java.util.Properties;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Hd33 {

	public static void main(String[] args) {
		Properties p = new Properties();
	      Set states;
	      String str;
	      
	      p.put("uttarpradesh", "lucknow");
	      p.put("assam", "dispur");
	   
	      states = p.keySet();  
	      Iterator itr = states.iterator();
	      
	      while(itr.hasNext()) {
	         str =(String) itr.next();
	         System.out.println("The capital of " + str + " is " + 
	            p.getProperty(str) + ".");
	      } 
	}
}
