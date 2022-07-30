/*11)Given two strings a and b, return a new string, following the rules given below.
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
Example1)
i/p:abcXY123XYijk,XY
o/p:c13i
Example2)
i/p:XY123XY,XY
o/p:13
Example3)
i/p:XY1XY,XY
o/p:11

*/
import java.util.Scanner;
public class StringCharAfterAndBefore {

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
