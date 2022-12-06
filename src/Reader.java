import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;

public class Reader {
    private String full_name;
    private int library_card_number;
    private String faculty;
    private String birthday;
    private String call_number;
    private ArrayList<Book> takenBooks;

    public Reader (String full_name, int library_card_number, String faculty, String birthday, String call_number) {
        this.full_name = full_name;
        this.library_card_number = library_card_number;
        this.faculty = faculty;
        this.birthday = birthday;
        this.call_number = call_number;
    }
    public Reader (Reader reader) {
        this.full_name = reader.full_name;
        this.birthday = reader.birthday;
        this.faculty = reader.faculty;
        this.call_number = reader.call_number;
        this.library_card_number = reader.library_card_number;
    }

    public int getLibrary_card_number() {
        return library_card_number;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setLibrary_card_number(int library_card_number) {
        this.library_card_number = library_card_number;
    }

    public String getCall_number() {
        return call_number;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCall_number(String call_number) {
        this.call_number = call_number;
    }
    public Reader() {
        takenBooks = new ArrayList<>();
    }
    public void takeBook () {
        System.out.println("Взять книгу!");
    }
    public void takeBook(Book books) {
        System.out.println(getFull_name() +"взял книги" + takenBooks);
    }
    public void returnBook () {
        System.out.println("Вернуть книгу!");
    }

    @Override
    public String toString () {
        return "Читатель: " + "\n" +
                "ФИО - " + full_name + "\n" +
                "дата рождения - " + birthday + "\n" +
                "факультет - " + faculty + "\n" +
                "номер телефона - " + call_number + "\n" +
                "номер читательского билета - " + library_card_number + "\n" +
                "взятые книги: " + takenBooks + "\n";
    }

}
