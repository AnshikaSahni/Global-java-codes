/*Create a class named ‘Animal’ which includes methods like eat() and sleep().


Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/

package anshi;

class Animal
{
	void eat()
	{  
		System.out.println("eat");
		
	}
	void sleep()
	{
		System.out.println("sleep");
	}
}

public class Bird extends Animal {
	@Override
	void sleep()
	{
		System.out.println("sleepchild");
	}
	@Override
	void eat()
	{  
		System.out.println("eatchild");
		
	}
	
	
    void fly(){
    	System.out.println("fly");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal a= new Animal();
       a.eat();
       a.sleep();
       Bird b= new Bird();
       b.eat();
       b.sleep();
       b.fly();
	}

}
