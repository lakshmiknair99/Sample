package Abstraction;

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    

    double calculateSalary() {
        return salary * 8; 
    }



    public static void main(String[] args) {

        Contractor contractor = new Contractor("John", 101, 20, 40); 
        

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 102, 4000); 

        System.out.println("Contractor Salary: " + contractor.calculateSalary());
        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
    }
}
