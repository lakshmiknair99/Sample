package ExcelRead;

import java.io.IOException;
public class ExcelMain {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String s=ExcelReadEg1.readStringData(0, 1);
		System.out.println(s);
		String a=ExcelReadEg1.readIntegerData(1, 1);
		System.out.println(a);
		

	}

}
