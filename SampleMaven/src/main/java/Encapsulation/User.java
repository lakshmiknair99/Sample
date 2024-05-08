package Encapsulation;

import java.util.Scanner;
public class User extends Bank {

	public User()
	{
		super();
	}

    public String getPin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin: ");
        return scanner.next();
    }   

    public static void main(String[] args) {
        User bank = new User();
        bank.setPin("1001", "1234", "1212");
        String pin = bank.getPin();
        bank.validatePin(pin);
    }
}
