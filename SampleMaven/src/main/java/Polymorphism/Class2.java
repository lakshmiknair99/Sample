package Polymorphism;

public class Class2 extends Class1 {
	
	public void print(int c,int d)
	{
		super.print(10,20);
		int sum=c+d;
		System.out.println("Sum of numbers: "+sum);
	}
	public void display()
	{
		System.out.println("method of child class");
	}
	
	
	public static void main(String args[])
	{
		Class1 d=new Class2();
		Class2 c=new Class2();
		d.print(30, 20);
		d.show();
		c.display();
		
		
	}

}
