import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[2];
        readers[0] = new Reader("Петров В. В.", 12345, "филологический", "10/04/1990", "89290542711");
        for(int i=0; i< readers.length; i++) {
            System.out.println(readers[i]);
        }
    }
}