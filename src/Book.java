public class Book {
    private String name_book;
    private String author;
    private static int Book_Count;

    public Book(String name_book, String author) {
        this.name_book = name_book;
        this.author = author;
        Book_Count ++;
    }
    public Book () {

    }
    public Book(Book books) {
        this.name_book = books.name_book;
        this.author = books.author;
        Book_Count ++;
    }

    public String getAuthor() {
        return author;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static int getBook_Count() {
        return Book_Count;
    }

    public static void setBook_Count(int book_Count) {
        Book_Count = book_Count;
    }
    @Override
    public String toString () {
        return "Книга: " + "\n" +
                name_book + "\n" +
                author + "\n";
    }
}
