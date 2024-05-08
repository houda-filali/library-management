package Driver;

import Classes.Items;
import Classes.Book;
import Classes.Journal;
import Classes.Media;
import Classes.Library;
import Clients.Client;

import java.util.Scanner;

class DriverClass {  //Explanation of access right: package-private because it is not meant to be accessed outside of the package (Driver)

	private static void menu() { //Explanation of access right: private because it is not meant to be accessed outside of the class (DriverClass)
		Scanner scanner = new Scanner(System.in);
		
		boolean exit = false;

		while (!exit) {
			System.out.println("Menu:");
			System.out.println("1. Add an item");
			System.out.println("2. Delete an item");
			System.out.println("3. Change information of an item");
			System.out.println("4. List all items in a specific category (book, journal, or media)");
			System.out.println("5. Print all items (from all categories)");
			System.out.println("6. Add a client:");
			System.out.println("7. Edit a client");
			System.out.println("8. Delete a client");
			System.out.println("9. Lease an item to a client");
			System.out.println("10. Return an item from a client");
			System.out.println("11. Show all items leased by a client");
			System.out.println("12. Show all leased items (by all clients)");
			System.out.println("13. Display the biggest book");
			System.out.println("14. Make a copy of the books array");
			System.out.println("15. Exit the menu");
	
			System.out.println("\nPlease insert an option of the menu (1-15): ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			
			  case 1: 
				  System.out.println("\nOption 1: Add an item\n"); 
				  Library.addItem(); 
				  break;
			  
			  case 2: 
				  System.out.println("\nOption 2: Delete an item\n"); 
				  Library.deleteItem(); 
				  break;
			  
			  case 3: 
				  System.out.println("\nOption 3: Change information of an item\n");
				  Library.changeItemInformation(); 
				  break;
			  
			  case 4: 
				  System.out.println("\nOption 4: List all items in a specific category (book, journal, or media)\n"); 
				  Library.listCategoryItems(); 
				  break;
			  
			  case 5:
				  System.out.println("\nOption 5: Print all items (from all categories)\n");
				  Library.listAllItems(); 
				  break;
			  
			  case 6: 
				  System.out.println("\nOption 6: Add a client\n"); 
				  Library.addClient(); 
				  break;
			  
			  case 7: 
				  System.out.println("\nOption 7: Edit a client\n");
				  Library.changeClientInformation(); 
				  break;
			  
			  case 8: 
				  System.out.println("\nOption 8: Delete a client\n"); 
				  Library.deleteClient();
				  break;
			  
			  case 9: 
				  System.out.println("\nOption 9: Lease an item to a client\n");
				  Library.leaseItem(); 
				  break;
			  
			  case 10: 
				  System.out.println("\nOption 10: Return an item from a client\n");
				  Library.returnItem(); 
				  break;
			  
			  case 11: 
				  System.out.println("\nOption 11: Show all items leased by a client\n");
				  Library.showClientLeasedItems(); 
				  break;
			  
			  case 12:
				  System.out.println("\nOption 12: Show all leased items (by all clients)\n");
				  Library.showAllLeasedItems(); 
				  break;
			  
			  case 13: 
				  System.out.println("\nOption 13: Display the biggest book\n");
				  Book biggestBook = getBiggestBook(Library.getBookArray()); 
				  System.out.println(biggestBook.toString());
				  break;
			  
			  case 14: 
				  System.out.println("\nOption 14: Make a copy of the books array\n");
				  copyOfBooks(Library.getBookArray()); 
				  System.out.println("\nCopy successfull! \nYou will be brought back to the menu.");
				  break;
			 
                    
                case 15:
                    System.out.println("Exiting the program. Goodbye!");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please insert an option of the menu (1-15)\n");
			}
		}
		
		scanner.close();

	}


	private static void predefinedScenario() { //Explanation of access right: private because it is not meant to be accessed outside of the class (DriverClass)
		System.out.println("\nPredifined scenario\n");

		//create 3 objects from Book, Journal, Media and Client classes
		Book book1 = new Book("Mockingbird", "Harper Lee", 2020, 200);
		Book book2 = new Book("Frankestein", "Mary Shelly", 1990, 300);
		Book book3 = new Book("Anne Frank", "Bob Frank", 1970, 120);

		Journal journal1 = new Journal("TVA", "Mike John", 2024, 20);
		Journal journal2 = new Journal("LaPresse", "Amy Smith", 2010, 14);
		Journal journal3 = new Journal("NBC", "Ana Abigail", 2021, 10);
		
		Media media1 = new Media("Epic", "Malak", 2020, "Youtube video");
		Media media2 = new Media("Narnia", "Mark El", 2000, "Movie");
		Media media3 = new Media("Hunger Games", "Jessica Abbot", 2015, "Movie");
		
		Client client1 = new Client("Houda", "4381112222", "filali@gmail.com");
		Client client2 = new Client("Manel", "5143334444", "manel@gmail.com");
		Client client3 = new Client("Houda", "4381112222", "filali@gmail.com");

		//display their information using toString()
        System.out.println("-----The information of the book objects-----\n");

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
        System.out.println("-----The information of the journal objects-----\n");

        System.out.println(journal1.toString());
        System.out.println(journal2.toString());
        System.out.println(journal3.toString());
		
        System.out.println("-----The information of the media objects-----\n");

        System.out.println(media1.toString());
        System.out.println(media2.toString());
        System.out.println(media3.toString());
		
        System.out.println("-----The information of the client objects-----\n");
		
        System.out.println(client1.toString());
        System.out.println(client2.toString());
        System.out.println(client3.toString());
		
		//test the equality of some of the created objects using the equals() method

        System.out.println("\n-----Equality Tests-----\n");
        System.out.println("Testing the equality of book #1 and book #2. \n"
        					+ "Are those objects equal? " + book1.equals(book2) + "\n");
        
        System.out.println("Testing the equality of journal #1 and media #3. \n"
				+ "Are those objects equal? " + journal1.equals(media3) + "\n");
        
        System.out.println("Testing the equality of client #1 and client #3. \n"
				+ "Are those objects equal? " + client1.equals(client3) + "\n");

        System.out.println("Testing the equality of media #1 and book #3. \n"
				+ "Are those objects equal? " + media1.equals(book3) + "\n");

		System.out.println("Testing the equality of client #1 and journal #2. \n"
			+ "Are those objects equal? " + client1.equals(journal2) + "\n");
		
		System.out.println("Testing the equality of client #1 and client #2. \n"
			+ "Are those objects equal? " + client1.equals(client2) + "\n");
		
		//create an array for each one of the types of items
		Book[] booksPredefinedArray = {book1, book2, book3};
		Journal[] journalsPredefinedArray = {journal1, journal2, journal3};
		Media[] mediasPredefinedArray = {media1, media2, media3};
		Client[] clientsPredefinedArray = {client1, client2, client3};

		//create another array for all items
		Items[] itemsPrefinedArray = {book1, book2, book3, 
									  journal1, journal2, journal3, 
									  media1, media2, media3};
		
		//call the getBiggestBook() with the array of books and display the result
		System.out.println("\n-----Biggest Book-----\n");
		System.out.println("The biggest book from the Book array from the predifened scenario is " 
							+ getBiggestBook(booksPredefinedArray));
		
		//call the method copyBooks() on the array of Media is not possible because the parameter that copyOfBooks takes in is Book[] 
		//to execute this method we will insert a Book[] array called booksPredefinedArray
		System.out.println("\n-----Copy Books-----\n");
		System.out.println("The method copyBooks() applied on the Media array from the predefined scenario is executed? (true or false) \n");
		System.out.println(copyOfBooks(mediasPredefinedArray));

	}
	
	
	private static Book getBiggestBook(Book[] bookArray) {  //Explanation of access right: private because it is not meant to be accessed outside of the class (DriverClass)
	  Book biggestBook= bookArray[0]; 
	  for(int i=1; i<bookArray.length; i++) { 
		  if(bookArray[i].getNumberOfPages()>biggestBook.getNumberOfPages()) {
			  biggestBook = bookArray[i]; } 
		  } 
	  return biggestBook; 
	}
	
	//This method creates a deep copy of a Book[] array that is inserted as a parameter
	//This method may be applied to arrays of datatype Book[] therefore other datatypes such as Media[] will not execute the deep copy method and return a boolean type of false.
	/*
	 * private static Book[] copyOfBooks(Book[] bookArray) { //Explanation of access
	 * right: private because it is not meant to be accessed outside of the class
	 * (DriverClass) Book[] copiedBookArray=new Book[bookArray.length];
	 * 
	 * for (int i=0; i<bookArray.length; i++) { copiedBookArray[i] = bookArray[i]; }
	 * return copiedBookArray;
	 * 
	 * }
	 */
	
	private static boolean copyOfBooks(Items[] bookArray) {
	    if (bookArray == null || bookArray.length == 0 || !(bookArray instanceof Book[])) {
	    	if (bookArray == null) {
	            System.out.println("The method copyOfBooks(Items[] bookArray) was not executed because the array inserted is null.");
	        } 
	    	else if (bookArray.length == 0) {
	            System.out.println("The method copyOfBooks(Items[] bookArray) was not executed because the array inserted is empty.");
	        } 
	    	else {
	            System.out.println("The method copyOfBooks(Items[] bookArray) was not executed because the array inserted is not a Book[] array.");
	        }
	    	
	        return false;
	    }

	    else { 
	    	Book[] copiedBookArray = new Book[bookArray.length];
	    
		    for (int i=0; i<bookArray.length; i++) {
		        copiedBookArray[i] = new Book((Book) bookArray[i]); 
		    }
	    
		    return true;
	    }
	}
	 
	
	public static void main(String[] args) { //Explanation of access right: public because it is the main method 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the FunReadings Library program that manages all the items "
						+ "in your library and your leases as well as returns to and from your clients.");
		System.out.println("Dear employee, do you want to get the menu "
				+ "or to run a predefined scenario? " 
				+ "\nInsert 1 (to get the menu) or 2 (to run the predefined scenario): ");
		int menu_scenario_choice = scanner.nextInt();
		switch (menu_scenario_choice) {
		
		  case 1: 
			  menu();
			  break;
		  
		  case 2: 
			  predefinedScenario(); 
			  break;
			  
		  default:
              System.out.println("Invalid choice. Insert 1 (to get the menu) or 2 (to run the predefined scenario): \n");
		}
	
	
	scanner.close();

	}

}
