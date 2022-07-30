/*/*1)Develop a java class with a instance variable H1 (TreeSet) add a method saveCountryNames(String CountryName) ,
the method should add the passed country to a TreeSet (H1) and return the added TreeSet(H1).
Develop a method getCountry(String CountryName) which iterates through the TreeSet and
returns the country if exist else return null.
NOTE: You can test the methods using a main method.*/
import java.util.TreeSet;

public class GetCountryNameTreeSet {
	TreeSet<String> h1= new TreeSet<>();
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
		GetCountryNameTreeSet h= new GetCountryNameTreeSet();
		h.saveCountryNames("india");
		h.saveCountryNames("Australia");
		h.saveCountryNames("china");
		h.getCountry("Srilanka");
		

		
		

	}

}
