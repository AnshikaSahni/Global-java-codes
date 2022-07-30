/*Create a base class Fruit with name ,taste and size as its attributes.

Create a method called eat() which describes the name of the fruit and its taste.

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.*/


class Fruit
{
	String name;
	String taste;
	int size;
     void eat(String name,String taste)
	{  
    	 System.out.println("Name:"+"taste:");
		
	}
	
}
 class Apple extends Fruit
{    
	 @Override
	 void eat(String name,String taste)
		{  
	    	 System.out.println("taste:"+ " "+ taste);
			
		}
		
}

public class Orange extends Fruit {
	@Override
	 void eat(String name,String taste)
		{  
	    	 System.out.println("taste:"+ " "+ taste);
			
		}
		

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Fruit f= new Fruit();
		f.eat("name"," taste");
		Orange O = new Orange();
		Apple a= new Apple();
		a.eat("apple", "sweet");
		O.eat("orange", "sweet & Sour");

	}
}

