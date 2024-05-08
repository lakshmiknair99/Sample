package ExceptionHandling;

import java.io.IOException;

public class License2 {
	public static void checkAge(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("Age is not applicable");
		}
		else
		{
			System.out.println("approved");
		}
		
	}

	public static void main(String[] args) throws LicenseException {
		// TODO Auto-generated method stub
		
		checkAge(10);
	}

}
