package Classes;


public class Book extends Items{ //Explanation of access right: public because will be used outside of the Classes package (will be used in Driver package)
	
	//Attribute
	//Explanation of access right: private because the attribute should not be directly accessible from outside the class; should be accessed and modified through accessors and mutators (encapsulation)
	private int numberOfPages;
	
	//Constructors
	//Explanation of access right: public because will be used outside of the Classes package (will be used in Driver package)
	public Book() {
		super();
	}
	public Book(String name, String author, int yearOfPublication, int numberOfPages) {
		super(name, author, yearOfPublication);
		this.numberOfPages = numberOfPages;
		this.ID = items_ID_Generator.generateBookID();
	}
	public Book(Book otherBook) {
		super(otherBook);
		this.numberOfPages = otherBook.numberOfPages;
		this.ID = items_ID_Generator.generateBookID();
	}
	
	//Accessor 
	//Explanation of access right: public because will be used outside of the Classes package (will be used in Driver package)
	public int getNumberOfPages() {
		return this.numberOfPages;
	}
	
	//Mutator
	//Explanation of access right: public because will be used outside of the Classes package (will be used in Driver package)
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	//toString()
	//Explanation of access right: public because will be used outside of the Classes package (will be used in Driver package)
	public String toString() {
		String bookMessage = "ID: " + this.ID + "\nName: " + this.name + "\nAuthor: " + this.author + "\nYear of Publication: " + this.yearOfPublication + "\nNumber of Pages: " + this.numberOfPages + "\n";
		return bookMessage;
	}
	
	//equals()
	//Explanation of access right: public because will be used outside of the Classes package (will be used in Driver package)
	public boolean equals(Book otherBook) {
		return ((otherBook != null) 
			&& (this.getClass() == otherBook.getClass()) 
			&& (this.name.equals(otherBook.name))
			&& (this.author.equals(otherBook.author))
			&& (this.yearOfPublication == otherBook.yearOfPublication)
			&& (this.numberOfPages == otherBook.numberOfPages));
	}
}
