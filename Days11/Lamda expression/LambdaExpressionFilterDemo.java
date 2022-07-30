/*3)Write a program in java for LambdaExpressionFilter demo. The filter will filter the list of electronic products
whose cost is less than 20000 and print the details of products in the list whose cost is greater than 20000
Step1: Create an Electronic Product bean class with attributes id , name and price
Step2: create a main method and add list of products created to product list
Step3: create a stream object and filter the list using stream filter and lambda expression
Step4: Using lambda expression iterate through list to print product name and product price
Sample output
Iphone 6S: 65000.0
Sony Xperia: 25000.0
Redmi4 : 26000.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product1{
	
	int id;  
    String name;  
    float price;
    
	public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}  
	public String toString()
	{
		return name+" "+":"+price;
		
	}
    
}
public class LambdaExpressionFilterDemo {

	public static void main(String[] args) {
		
		List<Product1> productsList = new ArrayList<Product1>();
		
		productsList.add(new Product1(1,"Iphone 6S", 65000.0f));
		productsList.add(new Product1(2,"Sony Xperia", 25000.0f));
		productsList.add(new Product1(3,"Redmi 14", 26000.0f));
		productsList.add(new Product1(4,"IQOO Z6", 16000.0f));
		productsList.add(new Product1(5,"Realme 6", 13000.0f));
		
		
		 List<Product1>productPriceList2 = productsList.stream()
				 .filter(p -> p.price>20000) .collect(Collectors.toList());  
				 
		productPriceList2 .forEach((res)->System.out.println(res.toString()));
		 
	}

}