// Class 1- Bank
//One method to set pin from „User‟ class and validate Pin in another method
//[Valid pins – 1001, 1234, 1212]
//Pin number should declared as private
// Class 2 – User
//Get the pin from User

package Encapsulation;


public class Bank {
	
	private String validPin1;
	private String validPin2;
	private String validPin3;
	
	public void setPin(String validPin1,String validPin2, String validPin3)
	{
		this.validPin1=validPin1;
		this.validPin2=validPin2;
		this.validPin3=validPin3;
	}
	public void validatePin(String enteredPin)
	{
		if(enteredPin.equals(validPin1) || enteredPin.equals(validPin2) || enteredPin.equals(validPin3))
		{
			System.out.println("Pin is valid");
		}
		else
		{
			System.out.println("Pin is not valid");
		}
	}


}




