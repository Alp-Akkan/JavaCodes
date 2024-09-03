public class Book implements Comparable<Book> {

    private String bookName ;
    private int pageNumber ;
    private String authorName ;
    private int publishDate ;
    private int ID;
    
    
    
    public Book(int ID,String bookName, int pageNumber, String authorName, int publishDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
        this.ID = ID;
    }


    @Override
    public int compareTo (Book o)
    {
        return this.bookName.compareTo(o.bookName);
    }


    public String getBookName() {
        return bookName;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public int getPageNumber() {
        return pageNumber;
    }


    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    public String getAuthorName() {
        return authorName;
    }


    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public int getPublishDate() {
        return publishDate;
    }


    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }


    public int getID() {
        return ID;
    }


    public void setID(int iD) {
        ID = iD;
    }

    

    




}
