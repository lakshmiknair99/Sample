package SuperKeyword;

public class Car extends Vehicle{
	String colour="white";
	int a;
	int b;
	public Car(int a, int b)
	{
		super(1, 2);
		System.out.println("This is child class constructor");
	}
	public void print()
	{
		super.display();
		System.out.println(colour);
		System.out.println(super.colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(3, 4);
		c.print();

	}

}
