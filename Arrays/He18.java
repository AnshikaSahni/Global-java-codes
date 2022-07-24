//1)Write a program to initialize an integer array and print the sum and average of the array.
import java.util.Scanner;
public class He18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("etner the length of array");
		int  n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the values of array"); 
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		float avg=0.0f;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		avg=sum/n;
		System.out.println("sum:"+sum+" "+"average:"+avg);
		

	}

}
