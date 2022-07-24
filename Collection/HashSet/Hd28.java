/*Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,

the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
Develop a method getCountry(String CountryName) which iterates through the HashSet and
returns the country if exist else return null.*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hd28 {
	HashSet<String> h1= new HashSet<>();
    void  saveCountryNames(String CountryName)
	{  
		
		h1.add(CountryName);
		
    }
	void getCountry(String s)
	{

	       if(h1.equals(s))
	       {
	    	   System.out.println(s);
	    	   
	       }
	       else
	       {
	    	   System.out.println("null");
	       }
	       
	     
      
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hd28 h= new Hd28();
		h.saveCountryNames("india");
		h.saveCountryNames("Australia");
		h.saveCountryNames("china");
		h.getCountry("Srilanka");
		

		
		

	}

}
