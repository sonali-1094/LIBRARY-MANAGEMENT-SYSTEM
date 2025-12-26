import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addBook(new Book("101", "Java Basics", "James", "Programming"));
        library.addBook(new Book("102", "Python", "Guido", "Programming"));

        boolean run = true;

        while (run) {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Search Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title/author: ");
                    library.searchBook(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter book title: ");
                    Book book = library.findBook(sc.nextLine());
                    if (book != null && book.isAvailable()) {
                        book.setAvailable(false);
                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Book not available.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    Book b = library.findBook(sc.nextLine());
                    if (b != null) {
                        b.setAvailable(true);
                        System.out.println("Book returned.");
                    }
                    break;

                case 4:
                    run = false;
                    break;
            }
        }
        sc.close();
    }
}

