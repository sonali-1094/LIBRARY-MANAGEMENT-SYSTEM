import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(keyword)
                    || book.getAuthor().equalsIgnoreCase(keyword)) {
                System.out.println(book.getTitle() + " | " + book.getAuthor() +
                        " | Available: " + book.isAvailable());
                found = true;
            }
        }
        if (!found) System.out.println("No book found.");
    }

    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title))
                return book;
        }
        return null;
    }
}

