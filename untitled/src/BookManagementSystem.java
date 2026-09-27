import java.util.ArrayList;
import java.util.List;

public class BookManagementSystem {
    private final List<Book>books = new ArrayList<>();
    public void addBook(Book book)throws BookAlreadyAddedException{
        for(Book b:books){
            if(book.getIsbn().equals(b.getIsbn()))
            {
                throw new BookAlreadyAddedException("This book is already added.");
            }
        }
        books.add(book);
    }
    public void removeBook(Book book)throws BookDoesNotExistsException{
        for(Book b:books){
            if(book.getIsbn().equals(b.getIsbn())){
                books.remove(book);
                return;
            }
        }
        throw new BookDoesNotExistsException("This book does not exist");
    }

    public void searchBook(Book book) throws BookNotAvailableException{
        for(Book e:books){
            if(book.getIsbn().equals(e.getIsbn())){
                System.out.println("This book is available.");
                e.displayDetails();
                return;
            }throw new BookNotAvailableException("This book is not available.");
        }
    }
    public void displayBooks(){
        for (Book e:books){
            e.displayDetails();
        }
    }
}
