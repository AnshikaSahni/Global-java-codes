/* Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice message that is suitable to the specific type of compartment.
Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]*/


import java.util.Random;

abstract  class Compartment
{
	public abstract String notice();
}
class FirstClass extends Compartment
{
	public String  notice()
	{
		return  "First Class Compartment";
		
	}
}
class GeneralClass extends Compartment
{
	public String  notice()
	{
		return " General Compartment" ;
		
	}
}
class LadiesClass extends Compartment
{
	public String  notice()
	{
		return "Ladies Compartment" ;
		
	}
}
class LuggageClass extends Compartment
{
	public String  notice()
	{
		return "Lugguage Compartment" ;
		
	}
}





public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment compart[]=new Compartment[10];
		Random r= new Random();
		for(int i=0;i<compart.length;i++)
		{
			int randomNum = r.nextInt((4 - 1) + 1) + 1;
			if(randomNum==1)
			{
				compart[i]= new LuggageClass();
			}
			else if(randomNum==2)
			{
				compart[i]= new LadiesClass ();
			}
			else if(randomNum==3)
			{
				compart[i]= new GeneralClass();
			}
			else if(randomNum==4)
			{
				compart[i]=new FirstClass();
			}
			System.out.println(compart[i].notice());
		}
		
        
	}

}
