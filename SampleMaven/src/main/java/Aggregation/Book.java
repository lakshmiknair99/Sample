package Aggregation;


public class Book {
	
	String bookname;
	int year;
	Author author;
	public Book(String bookname, int year, Author author)
	{
		this.bookname=bookname;
		this.year=year;
		this.author=author;
	}
	public void display()
	{
		System.out.println("Name of the book: "+bookname);
		System.out.println("Year of publication: "+year);
		System.out.println("Name of the author: "+author.authorname);
		System.out.println("Age of the author: "+author.age);
		System.out.println("place of the author: "+author.place);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author obj1=new Author("Paulo",90,"France");
		Book obj2=new Book("Alchemist",2000,obj1);
		obj2.display();

	}

}
