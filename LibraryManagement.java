package LibraryManagement;
import java.util.Scanner;

//This is the main class of the Library Management System.
public class LibraryManagement {

	    public static void main(String[] args) {

	        // Scanner is used to take input from the user.
	        Scanner sc = new Scanner(System.in);

	        // Creating an object of Library class.
	        Library library = new Library();

	        // Infinite loop keeps showing the menu.
	        while (true) {

	            // Displaying the main menu.
	            System.out.println("\n================================");
	            System.out.println("     LIBRARY MANAGEMENT SYSTEM");
	            System.out.println("================================");

	            System.out.println("1. Add Book");
	            System.out.println("2. Display Books");
	            System.out.println("3. Search Book");
	            System.out.println("4. Issue Book");
	            System.out.println("5. Return Book");
	            System.out.println("6. Delete Book");
	            System.out.println("7. Exit");

	            // Ask the user to enter a choice.
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            // Switch is used to execute the selected operation.
	            switch (choice) {

	                // Add Book
	                case 1:

	                    System.out.print("Enter Book ID: ");
	                    int id = sc.nextInt();

	                    // Consume the leftover newline.
	                    sc.nextLine();

	                    System.out.print("Enter Book Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Author Name: ");
	                    String author = sc.nextLine();

	                    // Create a Book object using constructor.
	                    Book book = new Book(id, name, author);

	                    // Add the book to the library.
	                    library.addBook(book);

	                    break;

	                // Display Books
	                case 2:

	                    library.displayBooks();

	                    break;

	                // Search Book
	                case 3:

	                    System.out.print("Enter Book ID: ");
	                    int searchId = sc.nextInt();

	                    library.searchBook(searchId);

	                    break;

	                // Issue Book
	                case 4:

	                    System.out.print("Enter Book ID: ");
	                    int issueId = sc.nextInt();

	                    library.issueBook(issueId);

	                    break;

	                // Return Book
	                case 5:

	                    System.out.print("Enter Book ID: ");
	                    int returnId = sc.nextInt();

	                    library.returnBook(returnId);

	                    break;

	                // Delete Book
	                case 6:

	                    System.out.print("Enter Book ID: ");
	                    int deleteId = sc.nextInt();

	                    library.deleteBook(deleteId);

	                    break;

	                // Exit
	                case 7:

	                    System.out.println("Thank you for using Library Management System.");

	                    // Close Scanner.
	                    sc.close();

	                    // End the program.
	                    return;

	                // Invalid option
	                default:

	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	

}
