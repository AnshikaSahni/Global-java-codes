//Write a program to print first 5 values which are divisible by 2, 3, and 5

public class He16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
		int flag=1;
		while(n<=1000 && flag<=5)
		{
			if(n%2==0 && n%3==0 && n%5==0)
			{ 
				 flag++;
				System.out.println(n);
				
			
           }
			n++;
		}	
			
		
	}
}