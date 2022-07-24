/*Write a class MathOperation which accepts 5 integers through command line. 
Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.*/

public class Hd17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
		int array[]= new int[5];
		array[0]=a;
		array[1]=b;
		array[2]=c;
		array[3]=d;
		array[4]=d;
		try
		{   
			int sum=0;
			for(int i=0;i<5;i++)
			{
				sum+=array[i];
				
			}
			System.out.print(sum);
		}
		catch(Exception w)
		{
			w.printStackTrace();
		}
		

	}

}
