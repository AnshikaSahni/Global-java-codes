import java.util.Scanner;
import java.util.Arrays;

//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
public class ArrayLargestAndSmallestTwo {

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
		System.out.println("smallest 2"+" "+arr[0]+" "+arr[1]);
		System.out.println("largest 2"+" "+ arr[n-2]+" "+arr[n-1]);
        sc.close();
	}

}
