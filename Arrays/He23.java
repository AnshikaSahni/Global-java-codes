//Write a program to initialize an array and print them in a sorted order.

public class He23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] a = new int[] {2,4,5,1};
          for(int i=0;i<a.length;i++)
          { 
        	  int index=i;
        	  for(int j=i+1;j<a.length;j++)
        	  {
        		  if(a[j]<a[index])
        		  {
        			  index=j;
        		  }
        	  }
        	 int min=a[index];
        	 a[index]=a[i];
        	 a[i]=min;
        	 
          }
          for(int i=0;i<a.length;i++)
          {
        	  System.out.println(a[i]);
          }
          

}
}