package book;


import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        Publishable book = new PublishedBook("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
