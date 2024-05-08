package Encapsulation;

public class Sports {
	
	private String name;
	
	public Sports(String name)
	{
		this.name=name;
	}
	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
	public String getName()
	{
		return name;
	}
	public void play()
	{
		System.out.println("Playing "+name);
	}

}
