package Encapsulation;

public class Hockey extends Sports {
	
	public Hockey()
	{
		super("Hockey");  
	}
	public void play()
	{
		System.out.println("Playing Hockey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Sports obj1=new Cricket();
		Sports obj2=new Football();
		Sports obj3=new Hockey();
		
		obj1.play();
		obj2.play();
		obj3.play();

	}

}
