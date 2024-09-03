
import java.util.Comparator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        TreeSet<Book> books = new TreeSet<>();

        Book book1 = new Book(1,"Thinking, Fast and Slow",499,"Daniel Kahneman", 2011);
        Book book2 = new Book(2,"I Flew for the Führer",192,"Heinz Knoke", 1952);
        // Add books to the TreeSet
        books.add(book1);
        books.add(book2);

        
        System.out.println("Books sorted by book name...");
        System.out.printf("%3s %-24s %-10s %-15s %-11s\n","#ID", "Name","PageNumber", "Author","PublishDate");

        for ( Book book : books)
        {
            System.out.printf("%3d %-24s %-10d %-15s %-11s\n",book.getID(),book.getBookName(),
            book.getPageNumber(),book.getAuthorName(),book.getPublishDate());


        }



        TreeSet<Book> bookSortedByPageNumber = new TreeSet<>(new Comparator<Book>()
        {
            
            public int compare(Book o1 , Book o2)
            {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        }
        );
        
        bookSortedByPageNumber.add(book1);
        bookSortedByPageNumber.add(book2);
        System.out.println();
        System.out.println("Books sorted by page number...");
        System.out.printf("%3s %-24s %-10s %-15s %-11s\n","#ID", "Name","PageNumber", "Author","PublishDate");
        

        for(Book book : bookSortedByPageNumber.reversed())
        {
            System.out.printf("%3d %-24s %-10d %-15s %-11s\n",book.getID(),book.getBookName(),
            book.getPageNumber(),book.getAuthorName(), book.getPublishDate());

        } 

    }
}
