package Aggregation;

public class Student {
	String name;
	int classNo;
	StudentDetails studentdetails;
	public Student(String name, int classNo, StudentDetails studentdetails)
	{
		this.name=name;
		this.classNo=classNo;
		this.studentdetails=studentdetails;
	}
	public void display()
	{
		System.out.println(name+ " " +classNo+ " "+studentdetails.rollno+" "+studentdetails.place+" "+studentdetails.contNo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj1=new StudentDetails(11, "Kottayam", 964468774);
		Student obj2=new Student("Anu", 8, obj1 );
		obj2.display();	

	}

}
