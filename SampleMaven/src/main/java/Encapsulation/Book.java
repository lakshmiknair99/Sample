package Encapsulation;

public class Book {
	private String bookname;
	private int year;
	private String authorname;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void getYear() {
		System.out.println("Name of book: "+name);
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

}
