package LendItems;

public class Book {

    String bookID;
    String bookName;
    String authorName;
    String publisherName;
    public int bookCount = 0;

    public Book(String bookName, String authorName, String publisherName) {
        setBookName(bookName);
        setAuthorName(authorName);
        setPublisherName(publisherName);
    }

    public void generateBID() {
        bookCount++;

        String uniqueId = null;

        if (0<bookCount && bookCount<10) {
            uniqueId = "B000"+bookCount;}
        else if (10<=bookCount && bookCount<100) {
            uniqueId = "B00"+bookCount;
        } else if (100<=bookCount && bookCount<1000) {
            uniqueId = "B0"+bookCount;
        } else if (bookCount==1000) {
            uniqueId = "B"+bookCount;
        } else {
            System.out.println("Max Book Count Exceeded");
        }
        this.setBookID(uniqueId);
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

}
