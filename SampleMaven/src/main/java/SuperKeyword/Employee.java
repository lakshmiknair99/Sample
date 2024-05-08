package SuperKeyword;

public class Employee extends Person {
	int salary;
	public Employee(String name, int id,int salary)
	{
		super(name,id);  //reusing parent constructor using super keyword
		this.salary=salary;
	}
	public void print()
	{
		System.out.println(name+ " "+id+" "+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee("Anu",1041947,30000);
		obj1.print();
		

	}

}
