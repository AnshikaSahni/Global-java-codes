/*
Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),weight(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.
 */
package anshi;
public class Calculator {
	double num1;
	double num2;
    
	public static double powerDouble(double num1,double num2)
	{
	   return Math.pow(num1,num2);
	}
	public static int powerInt(double num1,double num2)
	{
		int c=(int)Math.pow(num1,num2);
		return c;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerDouble(2.0, 2.0));
		System.out.println(powerInt(2.0, 2.0));
		
		
		

	}

}
