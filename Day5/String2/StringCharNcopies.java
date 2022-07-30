/*Given a string, return a new string made of 'n' copies of the first 2 chars of the original string
where 'n' is the length of the string.
Example1)
i/p:Hello
o/p:HeHeHeHeHe*/

public class StringCharNcopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "hello";
		int n=1;
		String k=(s1.substring(0, 2));
		String s3=" ";
		while(n<=5)
		{
			s3+=k;
			n++;
		}
		System.out.println(s3);
	}

}