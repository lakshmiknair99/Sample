package Encapsulation;

public class Employee {
	private String name;
	private String mailId;
	private long accntNo;
	
	public void setter(String name, String mailId, long accntNo)
	{
		this.name=name;
		this.mailId=mailId;
		this.accntNo=accntNo;
	}
	public void getter()
	{
		System.out.println("Name: "+name);
		System.out.println("Email ID: "+mailId);
		System.out.println("AccountNo: "+accntNo);
		
	}

}
