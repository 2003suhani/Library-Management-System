package LibraryManagement;
import java.util.ArrayList;

//This class manages all library operations.
public class Library {

	
	    // ArrayList is used to store multiple Book objects.
	    private ArrayList<Book> books = new ArrayList<>();

	    // Method to add a new book.
	    public void addBook(Book book) {

	        // Check whether a book with the same ID already exists.
	        for (Book b : books) {

	            if (b.getBookId() == book.getBookId()) {

	                System.out.println("Book ID already exists.");
	                return;
	            }
	        }

	        // Add the book object to the ArrayList.
	        books.add(book);

	        System.out.println("Book added successfully.");
	    }

	    // Method to display all books.
	    public void displayBooks() {

	        // Check whether the ArrayList is empty.
	        if (books.isEmpty()) {

	            System.out.println("No books available.");

	            return;
	        }

	        System.out.println("\n===== BOOK LIST =====");

	        // Enhanced for loop is used to visit every book.
	        for (Book book : books) {

	            // Calling the displayBook() method.
	            book.displayBook();
	        }
	    }

	    // Method to search a book using its ID.
	    public void searchBook(int bookId) {

	        // Loop through all books.
	        for (Book book : books) {

	            // Compare entered ID with book ID.
	            if (book.getBookId() == bookId) {

	                System.out.println("\nBook found:");

	                book.displayBook();

	                return;
	            }
	        }

	        // If no book is found.
	        System.out.println("Book not found.");
	    }

	    // Method to issue a book.
	    public void issueBook(int bookId) {

	        // Search for the book.
	        for (Book book : books) {

	            if (book.getBookId() == bookId) {

	                // Check whether the book is available.
	                if (book.isAvailable()) {

	                    // Change status to issued.
	                    book.setAvailable(false);

	                    System.out.println("Book issued successfully.");

	                } else {

	                    // Book is already issued.
	                    System.out.println("Book is already issued.");
	                }

	                return;
	            }
	        }

	        System.out.println("Book not found.");
	    }

	    // Method to return a book.
	    public void returnBook(int bookId) {

	        // Search for the book.
	        for (Book book : books) {

	            if (book.getBookId() == bookId) {

	                // Check whether the book is currently issued.
	                if (!book.isAvailable()) {

	                    // Change status to available.
	                    book.setAvailable(true);

	                    System.out.println("Book returned successfully.");

	                } else {

	                    System.out.println("This book is already available.");
	                }

	                return;
	            }
	        }

	        System.out.println("Book not found.");
	    }

	    // Method to delete a book.
	    public void deleteBook(int bookId) {

	        // Loop through the ArrayList using an index.
	        for (int i = 0; i < books.size(); i++) {

	            // Check whether the ID matches.
	            if (books.get(i).getBookId() == bookId) {

	                // Remove the book from ArrayList.
	                books.remove(i);

	                System.out.println("Book deleted successfully.");

	                return;
	            }
	        }

	        System.out.println("Book not found.");
	    }
	
}
