/*Q.1.)i. Develop a java class with a instance variable M1 (HashMap) create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country Value - Capital
India Delhi
Japan Tokyo
ii. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
iii. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
iv. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital Value – Country
Delhi India
Tokyo Japan
v. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.*/
import java.util.*;
import java.util.Map.Entry;
class Country{
	
	Map<String,String>m1= new HashMap<>();
	public Map<String,String> saveCountryCapital(String CountryName, String capital)
	{
		 m1.put(CountryName,capital);
	     return m1;
	    
	}
	public String getCapital(String CountryName)
	{
		Iterator<Map.Entry<String,String>> it= m1.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			if(entry.getKey().equals(CountryName))
				return entry.getValue();
		}
		return null;
	}
	public String getCountry(String CountryName)
	{
		Iterator<Map.Entry<String,String>> it= m1.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			if(entry.getKey().equals(CountryName))
				return entry.getKey();
		}
		return null;
	}
	public ArrayList<String> getArrayList()
	{
		ArrayList<String> list = new ArrayList<>();
		Iterator<Map.Entry<String,String>> it= m1.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			list.add(entry.getKey());
				
		}
		return list;
		
	}
	public HashMap<String,String> NewMap2(){
		HashMap<String, String> M2 = new HashMap<String, String>();
		Set<Entry<String,String>> set= m1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> m = it.next();
			M2.put(m.getValue(), m.getKey());
			
			
		}
		return M2;
		
		
	}
	
}


public class TestCountryCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Country c= new Country();
        c.saveCountryCapital("India", "delhi");
        c.saveCountryCapital("Japan", "Tokyo");
        System.out.println(c.getCapital("India"));
        System.out.println(c.getCapital("Japan"));
        System.out.println(c.getCountry("India"));
        System.out.println(c.getCountry("Japan"));
        System.out.println(c.getArrayList());
        HashMap<String,String> m2=c.NewMap2();
        System.out.println(m2);
        
        
	}

}
