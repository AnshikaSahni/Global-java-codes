import java.util.Scanner;
import java.util.Arrays;

//Write a program to initialize an integer array and find the maximum and minimum value of the array.
public class ArrayMinMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("etner the length of array");
		int  n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values of array"); 
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
	    }
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[n-1];
		System.out.println("max:"+ max+""+"min"+min);
		 sc.close();
		
}
}