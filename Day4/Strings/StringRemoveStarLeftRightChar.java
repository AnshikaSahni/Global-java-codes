/*8) Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *
Example1)
i/p:ab*cd
o/p:ad*/

import java.util.Scanner;
public class StringRemoveStarLeftRightChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		if(s.charAt(0)=='*') {
			String res = s.substring(2,s.length());
			System.out.println(res);
		}
		
		else if(s.charAt(s.length()-1)=='*') {
			String res = s.substring(0,s.length()-2);
			System.out.println(res);
		}
		else {
			int num=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='*') {
					num = i;
				}
			}
			
			String res = s.substring(0,num-1) +  s.substring(num+2,s.length());
			System.out.println(res);
		}
		
		sc.close();
	}
}
