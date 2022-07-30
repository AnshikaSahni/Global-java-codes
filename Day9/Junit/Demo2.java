public class Demo2 {
     
	boolean Pallindrome(String s)
	{   
		 char c;
		 String str="";
		 for(int i=s.length()-1;i>=0;i--)
	        {
	        	c=s.charAt(i);
	        	str+=c;
	        }
	        
	        if(str.toLowerCase().equals(s.toLowerCase()))
	        {
	        	
	        		return true;
	        		
	        }
	        else
	        {
	        	
	        	return false;
	        }
	      
	        
	        	
	        

		
	}
}
