/*
.Create an abstract class Instrument which is having the abstract function play.
Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message
“Piano is playing tan tan tan tan ” for Piano class
“Flute is playing toot toot toot toot” for Flute class
“Guitar is playing tin tin tin ” for Guitar class
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of play method.
Use the instanceof operator to print which object is stored at which index of instrument array.
*/



import java.util.Random;

abstract  class  Instrument
{
	public abstract String  play();
}
class Piano extends Instrument
{
	public String  play()
	{
		return  "Piano is playing tan tan tan tan";
		
	}
}

class Flute extends Instrument
{
	public String   play()
	{
		return "Flute is playing toot toot toot toot" ;
		
	}
}
class Guitar extends Instrument
{
	public String  play()
	{
		return "Guitar is playing tin tin tin" ;
		
	}
}





public class Hd14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piano p = new Piano();
		Flute f = new Flute();
		Guitar g = new Guitar();
		
		System.out.println(p.play());
		System.out.println(f.play());
		System.out.println(g.play());
		System.out.println();
		
		Instrument in;
		
		in = new Piano();
		System.out.println(in.play());
		in = new Flute();
		System.out.println(in.play());
		in = new Guitar();
		System.out.println(in.play());
	
		
		
		Instrument I[]=new Instrument [10];
		
		for(int i=0;i<I.length;i++)
		{ 
			
			I[0] = new Piano();
			I[1] = new Flute();
		    I[2] = new Guitar();
			I[3] = new Flute();
			I[4] = new Flute();
			I[5] = new Guitar();
			I[6] = new Guitar();
			I[7] = new Piano();
			I[8] = new Flute();
			I[9] = new Piano();
			
		}
			System.out.println();
			for(int i=0;i<I.length;i++) {
				System.out.println("At index "+i+" "+I[i].getClass().getSimpleName()+ " class object is stored.");

			
		}
		
            
	    }

}
