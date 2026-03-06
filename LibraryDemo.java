import LibraryManagement.Book;
import LibraryManagement.Member;

public class LibraryDemo {
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling", "12345");
        Member m1 = new Member(101, "Rahul");

        System.out.println("Book Details:");
        b1.displayBook();

        System.out.println("\nMember Details:");
        m1.displayMember();
    }
}