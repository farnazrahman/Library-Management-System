public class Book {
    private final String title;
    private final String isbn;
    private final String author;
    private boolean isAvailable;

    public Book(String title, String isbn, String author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void displayDetails(){
        System.out.println("Title: "+this.getTitle() + "|| Author: "+this.getAuthor());

    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
