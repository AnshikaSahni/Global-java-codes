// Write a program to print prime numbers between 10 and 99.
public class PrimeNumberRange {
    
	public static boolean Prime (int n)
	{ 
		if(n==0||n==1)
		{
			return false;
		}
		if(n==2)
		{
			return true;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=11;i<99;i++)
		{
			if(Prime(i))
			{
				System.out.println(i+" ");
			}
		}
            
	}

}
