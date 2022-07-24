/* A student portal provides user to register their profile. During registration the system needs to validate the user should be located in India. If not the system should throw an exception.
Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
void registerUser(String username,String userCountry) with the below implementation
• if userCountry is not equal to “India” throw a InvalidCountryException with the message “User Outside India cannot be registered”
• if userCountry is equal to “India”, print the message “User registration done successfully”
Invoke the method registerUser from the main method with the data specified and see how the program behaves.
Example1)
i/p:Mickey,US
o/p:InvalidCountryException should be thrown.
The message should be “User Outside India cannot be registered”*/
public class Hd20  {
	void registerUser(String username,String userCountry)throws InvalidCountryException  {
		if(!userCountry.equalsIgnoreCase("india"))
		{
			throw new InvalidCountryException("User Outside India cannot be registered");
		}
		else
		{
			System.out.println("User registration done successfully");
		}
	}
	public static void main(String[] args) throws InvalidCountryException  {
		// TODO Auto-generated method stub
		Hd20 h= new Hd20();
		h.registerUser("anshi","India");
		
		

	}

}
class InvalidCountryException extends Exception
{
	InvalidCountryException(String message)
	{
		super(message);
	}
	
}
