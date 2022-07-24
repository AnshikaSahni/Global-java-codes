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
public class Hd11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "XY123XY";
		String s2= "XY";
		if(s1.contains(s2))
	{
	
System.out.print(s1.charAt(s1.indexOf(s2)-1)+ ""+s1.charAt(s1.indexOf(s2)+2)+""+s1.charAt(s1.indexOf(s2,(s1.indexOf(s2)+1))-1)+""+s1.charAt(s1.indexOf(s2,(s1.indexOf(s2)+1))+2));
	}
		
	
				

	}

}
