package Abstraction;

import java.util.Scanner;
public class HDFC implements RBI {
	
	// Formula to calculate maturity amount for recurring deposit
    // A = P * (1 + r/n)^(nt)
	// A = Maturity amount
    // P = Monthly installment
    // r = Annual interest rate
    // n = Number of times the interest is compounded in a year
    // t = Number of years
	
	public double reccuringDepst(double amount, int duration)
	{
		int n=12;
		double r=INTERSTRATE;
		double p=amount;
		int t=duration;
		
		double a=p * Math.pow(1 + r/n, n*t);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI obj=new HDFC(); //upcasting
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amount=sc.nextDouble();
		System.out.println("Enter the duration: ");
		int duration=sc.nextInt();
		double maturityAmnt=obj.reccuringDepst(amount, duration);
		System.out.println("After depositing " + amount + " for " + duration + " years, you will get " + maturityAmnt);
		
		

	}

}
