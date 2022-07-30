/*A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.*/

package anshi;
public class Patient {
	String patientName;
	double height;
	double weight;
	
	
	Patient(double h, double w){
		height=h;
		weight=w;
		
	}
	
    double computeBMI()
	{   
    	
		return (weight+ (height*height));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Patient p1= new Patient(7.0,7.0);
       System.out.println(p1.computeBMI());
	}

}
