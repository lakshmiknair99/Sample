package Abstraction;

public class VehicleSearch extends Vehicle {
	void search()
	{
		System.out.println("Search for a vehicle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VehicleSearch obj=new VehicleSearch();
		obj.message();
		obj.search();

	}

}
