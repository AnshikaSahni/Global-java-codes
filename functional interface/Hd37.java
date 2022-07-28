/*2)
Write a program in java for LambdaExpressionComparator demo. The filter will sort the list of electronic products based on product name
Step1: Create a Product bean class with attributes id, name and price
Step2: create a main method and inside main method create the Product objects and products to the product list
Step3: Using the Collections. Sort , sort the Product List using lambda expression. Lambda expression will use the object compareTo method compare the name objects for sorting
Step4: Finally print the elements of sorted product list
Sample output
Sorting on the basis of name...
2 Dell Mouse 150.0
1 HP Laptop 25000.0
3 Keyboard 300.0
*/
import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

class Product{

  int id;

  String name;

  float price;

  public Product(int id, String name, float price) {

    super();

    this.id = id;

    this.name = name;

    this.price = price;

  }

}

public class Hd37{

  public static void main(String[] args) {

    List<Product> list=new ArrayList<Product>();

    //Adding Products

    list.add(new Product(1,"HP Laptop",25000f));

    list.add(new Product(3,"Keyboard",300f));

    list.add(new Product(2,"Dell Mouse",150f));

    System.out.println("Sorting on the basis of name...");

    // implementing lambda expression

    Collections.sort(list,(p1,p2)->{

    return p1.name.compareTo(p2.name);

    });

    for(Product p:list){

      System.out.println(p.id+" "+p.name+" "+p.price);

    }

  }

}










