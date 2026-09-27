import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String name;
    private final int id;
    private final List<Book>borrowedBooks= new ArrayList<>();

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void displayDetails(){
        System.out.println("Name: "+this.getName() + "|| ID: "+this.getId());
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void displayBorrowedBooks(){
        for(Book book:borrowedBooks){
            book.displayDetails();
        }
    }

}
