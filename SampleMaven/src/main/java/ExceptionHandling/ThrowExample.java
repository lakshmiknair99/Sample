package ExceptionHandling;


import java.io.IOException;
public class ThrowExample {
	public static void check(int a, int b)
	{
		int sum=a+b;
		if(sum>10)
		{
			throw new ArithmeticException("Sum is greater than 10");
		}
		else
		{
			System.out.println("Sum is less than 10");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			check(5,6);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sum is greater");
		}
		
		
	
	}
	

}
