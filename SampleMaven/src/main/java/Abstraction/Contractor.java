package Abstraction;

class Contractor extends Employee {
    double paymentPerHour;
    int workingHours;

    Contractor(String name, int id, double paymentPerHour, int workingHours) {
        this.name = name;
        this.id = id;
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

    double calculateSalary() {
        return paymentPerHour * workingHours;
    }
}

