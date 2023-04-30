import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class LibraryManagementSystem {

  // map to store the books by category
  private static Map<String, String[]> booksByCategory = new HashMap<>();

  // map to store the user credentials
  private static Map<String, String> users = new HashMap<>();

  // variable to store the currently logged in user
  private static String currentUser = null;

  public static void main(String[] args) {

    // Initialize the books by category map
    booksByCategory.put("Fiction", new String[] { "To Kill a Mockingbird", "The Great Gatsby", "Pride and Prejudice" });
    booksByCategory.put("Non-Fiction", new String[] { "The Selfish Gene", "Sapiens", "Thinking, Fast and Slow" });
    booksByCategory.put("Children",
        new String[] { "Where the Wild Things Are", "Green Eggs and Ham", "The Cat in the Hat" });
    booksByCategory.put("Youth", new String[] { "The Hunger Games", "Harry Potter and the Philosopher's Stone",
        "Percy Jackson and the Lightning Thief" });

    // Initialize the user credentials
    users.put("dharani", "dhara");

    // Create a scanner to read user input
    Scanner sc = new Scanner(System.in);

    // Main loop
    while (true) {
      // If no user is logged in, show the login screen
      if (currentUser == null) {
        System.out.println("Welcome to the Library Management System!");
        System.out.println("Please enter your username:");
        String username = sc.nextLine();
        System.out.println("Please enter your password:");
        String password = sc.nextLine();
        if (users.containsKey(username) && users.get(username).equals(password)) {
          System.out.println("Login successful!");
          currentUser = username;
        } else {
          System.out.println("Invalid username or password. Please try again.");
        }
      } else {
        // If a user is logged in, show the book categories
        System.out.println("Welcome, " + currentUser + "!");
        System.out.println("Please select a book category:");
        System.out.println("1. Fiction");
        System.out.println("2. Non-Fiction");
        System.out.println("3. Children");
        System.out.println("4. Youth");
        System.out.println("5. Logout");
        String input = sc.nextLine();
        switch (input) {
          case "1":
            printBooksByCategory("Fiction");
            break;
          case "2":
            printBooksByCategory("Non-Fiction");
            break;
          case "3":
            printBooksByCategory("Children");
            break;
          case "4":
            printBooksByCategory("Youth");
            break;
          case "5":
            System.out.println("Logout successful!");
            currentUser = null;
            break;
          default:
            System.out.println("Invalid input. Please try again.");
            break;
        }
      }
    }
  }

  // Helper method to print the books in a given category
  private static void printBooksByCategory(String category) {
    String[] books = booksByCategory.get(category);
    System.out.println("Books in " + category + " category:");
    for (String book : books) {
      System.out.println("- " + book);
    }
  }

}
