// Initialize an integer array with ascii values and print the corresponding character values in a single row.
public class He21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= new int[] {65,66,67,68};
          char c[]=new char[arr.length];
          for(int i=0;i<arr.length;i++)
          {   
        	  c[i]=(char) arr[i];
        	
          }
          for(char j:c)
          {
        	  System.out.print(j+" ");
          }
	}

}
