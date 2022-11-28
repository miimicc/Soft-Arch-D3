package book;
import java.util.List;

public class ReadedBook extends Book implements Readable{
    
    private Book book = null;
    public ReadedBook (String title , List<String> pages){
        super(title, pages);
    }

    @Override
    public void printToScreen() {
        this.book = this;
        do {
            System.out.println(this.book.getCurrentPage());
        } while (this.book.turnToNextPage());
    }
}