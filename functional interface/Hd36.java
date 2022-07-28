/*

Write a program in Java to demonstrate Java 8 Functional Interface Predicate feature. The class will print all numbers , 
even numberrs and number greater than 3 of the numbers in the array list

Step1: create Java main class Java8 Tester
Step2: create a method eval which will take 2 parameters (list of numbers from 1 to 9 and predicate condition)
Step3: call the eval method from main method to print all the even numbers by passing appropriate parameters
Step4: call the eval method from main method to print all the numbers greater than 3 by passing appropriate parameters
Sample output
Print all numbers:
1 2 3 4 5 6 7 8
Print even numbers:2 4 6 8
Print numbers greater than 3:
4 5 6 7 8 9

*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Hd36
{
	public static void eval(List<Integer>list,Predicate<Integer>pred)
	{
		for(int i:list)
		{
			if(pred.test(i))
			{
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[]args)
	{
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Print all numbers:");
		eval(list,(n)->true);
		System.out.println();
		System.out.println("print even numbers");
		eval(list,(n)->n%2==0);
		System.out.println();
		System.out.println("print no greator than 3");
		eval(list,(n)->n>3);

		
	}
}