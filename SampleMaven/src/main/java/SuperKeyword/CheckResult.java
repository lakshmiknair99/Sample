package SuperKeyword;

public class CheckResult extends Addition{
	
	
	public CheckResult(int a, int b)
	{
		super(a,b);
		
	}
	public void isDivisible()
	{
		int result=super.sum();
		
		if(result%10==0)
		{
			System.out.println("Sum of number is divisible by 10");
		}
		else
		{
			System.out.println("Sum of number is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		CheckResult obj1=new CheckResult(10,20);
		obj1.isDivisible();

	}

}
