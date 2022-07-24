/*
10)Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
Example1)
i/p:Hello,3
o/p:llollollo*/
public class Hd10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		int n=3;
		int i=1;
		while(i<4)
		{
			System.out.print(s.substring(s.length()-3,s.length()));
			i++;
		}

	}

}
