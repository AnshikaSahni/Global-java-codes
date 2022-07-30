/*9) Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
*/

import java.util.Scanner;
public class StringCharSideBySide{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String input = sc.next();
		System.out.println("Enter the Keyword : ");
		String key = sc.next();
		
		System.out.println("The output after concatinating adjacents characters : "+getAdjacents(input,key,"",input.indexOf(key)));
		
		
	sc.close();
	}
	
	public static String getAdjacents(String input, String key, String output, int position ) {
		
		if(position != -1) {
			String temp = "";
			
			if(position>0) {
				temp += input.charAt(position-1);
			}
			
			if(position + key.length() < input.length()) {
				temp += input.charAt(position + key.length());
			}
			
			return getAdjacents(input, key, output+temp, input.indexOf(key, position + key.length() + 1));
		}
		
		else {
			return output;
		}
		
	}
}
