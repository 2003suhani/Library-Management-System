package LibraryManagement;

public class Book {

	    // Private variables provide encapsulation.
	    private int bookId;
	    private String bookName;
	    private String author;
	    private boolean available;

	    // Constructor is used to initialize the book object.
	    public Book(int bookId, String bookName, String author) {

	        // Assigning the parameter values to instance variables.
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.author = author;

	        // A newly added book is available by default.
	        this.available = true;
	    }

	    // Getter method to get the book ID.
	    public int getBookId() {
	        return bookId;
	    }

	    // Getter method to get the book name.
	    public String getBookName() {
	        return bookName;
	    }

	    // Getter method to get the author name.
	    public String getAuthor() {
	        return author;
	    }

	    // Getter method to check whether the book is available.
	    public boolean isAvailable() {
	        return available;
	    }

	    // Setter method to change the availability status.
	    public void setAvailable(boolean available) {
	        this.available = available;
	    }

	    // Method to display complete book information.
	    public void displayBook() {

	        System.out.println(
	            "ID: " + bookId +
	            " | Name: " + bookName +
	            " | Author: " + author +
	            " | Status: " +
	            (available ? "Available" : "Issued")
	        );
	    }
	

}
