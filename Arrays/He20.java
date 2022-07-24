/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given number in the array.

Example 1) If the Array elements are {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/

import java.util.*;
public class He20 {

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
		System.out.println("enter the no. to be searched");
		int num=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==num)
			{
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("-1");
		}

	}

}
