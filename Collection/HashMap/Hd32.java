/*Create a Collection called HashMap which is capable of storing String objects.
The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.*/

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Hd32 {
       
	public static void main(String[]args)
	{
	     HashMap<String,Integer> map= new HashMap<>();
	     Scanner sc= new Scanner(System.in);
	     System.out.println("enter the keys and values");
	     for(int i=0;i<3;i++)
	     {
	    	 map.put(sc.next(),sc.nextInt());
	     }
	     
	     Iterator<Entry<String, Integer>> i= map.entrySet().iterator();
	     while(i.hasNext())
	     {
	        	 System.out.println(i.next());
	        	 System.out.println(" ");
	     }
	    		 
	    		 
	     System.out.println("enter the key want to search");
	     String n=sc.next();
	     boolean keycheck= map.containsKey(n);
	     System.out.println(" key  is present="+" "+keycheck);
	    
	     System.out.println("enter the Value want to search");
	     int n1=sc.nextInt();
	     if(map.containsValue(n1))
	     {
	    	 System.out.println("value exist");
	     }
	     else
	     {
	    	 System.out.println("value not exist");
	     }
	    
	 
	     
	     
	     
	     
		
	}
}
