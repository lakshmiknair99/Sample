package Polymorphism;

public class Offseason {
	
	public double finalAmount(double amount)
	{
		double discount=amount*0.15;
		
		return amount-discount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double totalPrice = 1000; 

        String season = "Offseason";
        
        double finalAmnt = 0;
        switch (season) {
            case "Onseason":
                Onseason onseason = new Onseason();
                finalAmnt = onseason.finalAmount(totalPrice);
                break;
            case "Offseason":
                Offseason offseason = new Offseason();
                finalAmnt = offseason.finalAmount(totalPrice);
                break;
            default:
                System.out.println("Invalid season");
                return;
        }
        
        System.out.println("Total Amount before discount: "+totalPrice);
        System.out.println("Discounted price in " + season + ": " +  finalAmnt);


	}

}
