/*9) Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
*/

public class H9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="world";
	    String s5="";
	    for(int i=1;i<s1.length();i++)
	    {
	    	s5+=s1.charAt(i);
	    	
	    }
	    for(int i=1;i<s2.length();i++)
	    {
	    	s5+=s2.charAt(i);
	    	
	    }
		System.out.println(s1.charAt(0)+""+s2.charAt(0)+""+s5);
		
	
		
		
		
	}

}
