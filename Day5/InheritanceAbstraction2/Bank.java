/*)Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and

getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate

that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.

Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class.

The following are the interest rates of these banks.

ICICIBank - Savings 4% Fixed 8.5% and

KotMBank - Savings 6% Fixed 9%.

Create a main method to test the above classes and their methods. Try one by one and observe your findings

a) ICICIBank i=new ICICIBank();

b) KotMBank k=new KotMBank();

c) GeneralBank g=new KotMBank();

d) GeneralBank g=new ICICIBank();*/

abstract class GeneralBank
{
	double SavingInterestRate;
	double FixedDepositInterestRate;
	abstract double getSavingsInterestRate ();
	abstract double  getFixedDepositInterestRate();
	
	
	

}
class ICICIBank extends GeneralBank{

	@Override
	double getSavingsInterestRate() {
		// TODO Auto-generated method stub
		return 4;
		
	}

	@Override
	double getFixedDepositInterestRate() {
		return 8.5;
		
	}
	
}
class KoTMbank extends GeneralBank{

	@Override
	double getSavingsInterestRate() {
		// TODO Auto-generated method stub
		return 6;
		
	}

	@Override
	double getFixedDepositInterestRate() {
		return 9;
		
	}
	
}


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ICICIBank i=new ICICIBank();

		 KoTMbank k=new KoTMbank();
		 GeneralBank g=new KoTMbank();
		 GeneralBank g1=new ICICIBank();
		 

		System.out.println( "kotak fixed interest rate"+k.getFixedDepositInterestRate());
		System.out.println( "kotak saving interest rate"+k.getSavingsInterestRate());
		System.out.println( "ICICI saving interest rate"+i.getSavingsInterestRate());
		System.out.println( "ICICI fixed interest rate"+i.getFixedDepositInterestRate());
		System.out.println( g1.getFixedDepositInterestRate());
		System.out.println( g1.getSavingsInterestRate());
		System.out.println( g.getFixedDepositInterestRate());
		System.out.println(g.getSavingsInterestRate());
		
		
		
		
		 
		 

	}

}

