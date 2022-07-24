/*Write a java program that will return the first half of the string, if the length of the string is even.
It should return null for odd length string.
Example1)
i/p:TomCat
o/p:Tom
Example2)
i/p:Apron
o/p:null
*/
public class H4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "TomCa";
		int n=s.length();
		if(n%2==0)
		{
			for(int i=0;i<s.length()/2;i++)
			{
				System.out.print(s.charAt(i));
			}
		}
		else
		{
			System.out.println("null");
		}

	}

}
