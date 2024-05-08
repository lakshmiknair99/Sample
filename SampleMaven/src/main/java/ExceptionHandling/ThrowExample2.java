package ExceptionHandling;

import java.io.IOException;
public class ThrowExample2 {
	public static void Method() throws ArithmeticException  //Unchecked exception
	{
		throw new ArithmeticException("Exception Occured");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method();
		System.out.println("rest of the code");
		
	}

}
