package ExceptionHandling;

import java.io.IOException;
public class ThrowEg3 {
	public static void Method() throws IOException  //checked exception
	{
		throw new IOException("Exception Occured");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Method();
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}
	
	}

}
