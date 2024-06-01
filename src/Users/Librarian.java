package Users;

public class Librarian extends User{

    public Librarian(String name, String email, int age,int access) {
        super(name, email, age,access);
    }

    public void addBook(String bName, String author, String publisher) {
        b.setBookName(bName);
        b.setAuthorName(author);
        b.setPublisherName(publisher);
        b.generateBID();

        bs.addBook(b.getBookName(),b.getAuthorName(),b.getPublisherName(),b.getBookID());

    }

    public void addMagazine(String bName, String publisher,int year) {
        m.setBookName(bName);
        m.setPublisherName(publisher);
        m.setYear(year);
        m.generateMID();

        bs.addMagazine(m.getBookName(),m.getPublisherName(),m.getBookID(),m.getYear());
    }

    public void addJournal(String bName, String publisher , int volume) {
        j.setBookName(bName);
        j.setPublisherName(publisher);
        j.setVolumeNo(volume);
        j.generateJID();

        bs.addJournal(j.getBookName(),j.getPublisherName(),j.getBookID(), j.getVolumeNo());
    }

    public void removeLendItem(int type , String id) {
        if (type == 1)
        {
            b.bookCount--;
            bs.rmvBook(type,id);
        }
        else if(type == 2)
        {
            m.magazineCount--;
            bs.rmvBook(type,id);
        }
        else if (type == 3)
        {
            j.journalCount--;
            bs.rmvBook(type,id);
        }

    }

    public void extendTime(String Bid,int type)
    {
        bs.extendTime(Bid, type);
    }

    public void printList(int type)
    {
        bs.printBookList(type);
    }

    public void printUserAddedList(int type, String UID)
    {
        bs.searchBook(type,UID);
    }

}
