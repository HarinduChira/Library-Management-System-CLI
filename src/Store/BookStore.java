package Store;

import LendItems.Book;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    static List<String> bookName = new ArrayList<>();
    static List<String> bAuthorName = new ArrayList<>();
    static List<String> bPublisherName = new ArrayList<>();
    static List<String> bID = new ArrayList<>();

    static List<String> magazineName = new ArrayList<>();
    static List<String> mPublisherName = new ArrayList<>();
    static List<String> mID = new ArrayList<>();
    static List<Integer> mYear = new ArrayList<>();

    static List<String> journalName = new ArrayList<>();
    static List<String> jPublisherName = new ArrayList<>();
    static List<String> jID = new ArrayList<>();
    static List<Integer> jVolume = new ArrayList<>();


    static List<String> borrowBName = new ArrayList<>();
    static List<String> borrowBAuthorName = new ArrayList<>();
    static List<String> borrowBPublisherName = new ArrayList<>();
    static List<String> borrowBID = new ArrayList<>();
    static List<String> borrowBMemID = new ArrayList<>();

    static List<String> borrowMName = new ArrayList<>();
    static List<String> borrowMPublisherName = new ArrayList<>();
    static List<String> borrowMID = new ArrayList<>();
    static List<String> borrowMMemID = new ArrayList<>();
    static List<Integer> borrwMYear = new ArrayList<>();

    static List<String> borrowJName = new ArrayList<>();
    static List<String> borrowJPublisherName = new ArrayList<>();
    static List<String> borrowJID = new ArrayList<>();
    static List<String> borrowJMemID = new ArrayList<>();
    static List<Integer> borrowJVolume = new ArrayList<>();

    //List<Integer> borrowTime = new ArrayList<>();

    static int bookCount = 0;
    static int magazineCount = 0;
    static int journalCount = 0;
    static int borrowBCount = 0;
    static int borrowMCount = 0;
    static int borrowJCount = 0;

    public void addBook(String name, String author, String publisher , String bookID) {

        bookName.add(bookCount,name);
        bAuthorName.add(bookCount,author);
        bPublisherName.add(bookCount,publisher);
        bID.add(bookCount,bookID);

        bookCount++;
    }

    public void addMagazine(String name, String publisher , String bookID , int year) {

        magazineName.add(magazineCount,name);
        mPublisherName.add(magazineCount,publisher);
        mID.add(magazineCount,bookID);
        mYear.add(magazineCount,year);

        magazineCount++;
    }

    public void addJournal(String name, String publisher , String bookID , int volume) {

        journalName.add(journalCount,name);
        jPublisherName.add(journalCount,publisher);
        jID.add(journalCount,bookID);
        jVolume.add(journalCount,volume);

        journalCount++;
    }

    public void rmvBook(int type,String bid) {

        if (type == 1)
        {
            for (int i = 0; i < bID.size() ; i++) {
                if (bID.get(i).equals(bid))
                {
                    bookName.remove(i);
                    bAuthorName.remove(i);
                    bPublisherName.remove(i);
                    bID.remove(i);
                }
            }
            bookCount--;
            System.out.println("\nBook Removed !!");
        }
        else if (type == 2)
        {
            for (int i = 0; i < mID.size() ; i++) {
                if (mID.get(i).equals(bid))
                {
                    magazineName.remove(i);
                    mPublisherName.remove(i);
                    mYear.remove(i);
                    mID.remove(i);
                }
            }
            magazineCount--;
            System.out.println("\nMagazine Removed !!");
        }
        else if(type == 3 )
        {
            for (int i = 0; i < jID.size() ; i++) {
                if (jID.get(i).equals(bid))
                {
                    journalName.remove(i);
                    jPublisherName.remove(i);
                    jVolume.remove(i);
                    jID.remove(i);
                }
            }
            journalCount--;
            System.out.println("\nJournal Removed !!");
        }
    }

    public void searchBook(int type,String uid) {

        if (type == 1)
        {
            System.out.println("\n--------+---------+---------------------------");
            System.out.println("User Id | Book ID |\tBook Name ");
            System.out.println("--------+---------+---------------------------");


            for (int i = 0; i <borrowBMemID.size() ; i++) {
                if (borrowBMemID.get(i).equals(uid))
                {
                    System.out.println(borrowBMemID.get(i) + "\t: " + borrowBID.get(i) + "\t  : " + borrowBName.get(i));
                }
            }
            System.out.println("--------+---------+---------------------------\n");

        }
        else if (type == 2)
        {
            System.out.println("\n--------+-------------+-------------------------------");
            System.out.println("User Id | Magazine ID |\tMagazine Name ");
            System.out.println("--------+-------------+-------------------------------");

            for (int i = 0; i <borrowMMemID.size() ; i++) {
                if (borrowMMemID.get(i).equals(uid))
                {
                    System.out.println(borrowMMemID.get(i) + "\t:   " + borrowMID.get(i) + "\t  : " + borrowMName.get(i));
                }
            }
            System.out.println("--------+-------------+-------------------------------");


        }
        else if (type == 3)
        {
            System.out.println("\n--------+------------+----------------------------------------------------");
            System.out.println("User Id | Journal ID |\tJournal Name ");
            System.out.println("--------+------------+----------------------------------------------------");
            for (int i = 0; i <borrowJMemID.size() ; i++) {
                if (borrowJMemID.get(i).equals(uid))
                {
                    System.out.println(borrowJMemID.get(i) + "\t:   " + borrowJID.get(i) + "\t : " + borrowJName.get(i));
                }
            }
            System.out.println("--------+------------+----------------------------------------------------");

        }

    }

    public void extendTime(String Bid,int type) {

        if (type == 1)
        {
            for (int i = 0; i <borrowBID.size() ; i++) {
                if (borrowBID.get(i).equals(Bid))
                {
                    System.out.println("Borrow time for User " + borrowBMemID.get(i) + " for Book " + borrowBID.get(i) +
                                    " : " + borrowBName.get(i) + " has extended for another 7 days. " );
                }
            }
        }
        else if (type == 2)
        {
            for (int i = 0; i <borrowMID.size() ; i++) {
                if (borrowMID.get(i).equals(Bid))
                {
                    System.out.println("Borrow time for User " + borrowMMemID.get(i) + " for Magazine " + borrowMID.get(i) +
                            " : " + borrowMName.get(i) + " has extended for another 7 days. " );
                }
            }
        }
        else if (type == 3)
        {
            for (int i = 0; i <borrowJID.size() ; i++) {
                if (borrowJID.get(i).equals(Bid))
                {
                    System.out.println("Borrow time for User " + borrowJMemID.get(i) + " for Journal " + borrowJID.get(i) +
                            " : " + borrowJName.get(i) + " has extended for another 7 days. " );
                }
            }
        }

    }

    public void printBookList(int type) {
        if (type == 1)
        {
            System.out.println("\n----------- BOOK LIST -----------\n");
            System.out.println("--------+---------------------------+-----------------------+-----------------------------------");
            System.out.println("Book ID\t|\t\tName\t\t\t\t|\t\tAuthor\t\t\t|\t\t\tPublisher");
            System.out.println("--------+---------------------------+-----------------------+-----------------------------------");

            for (int i = 0 ; i < bookName.size() ; i++)
            {
                System.out.println(bID.get(i) + "\t: " + bookName.get(i) + "\t: " + bAuthorName.get(i) + "\t: " + bPublisherName.get(i));
            }

            System.out.println("--------+---------------------------+-----------------------+-----------------------------------");
        }
        else if (type == 2)
        {
            System.out.println("\n----------- MAGAZINE LIST -----------\n");

            System.out.println("------------+-----------------------+---------------------------+---------");
            System.out.println("Magazine ID\t|\t\tName\t\t\t|\t\tPublisher\t\t\t|Year");
            System.out.println("------------+-----------------------+---------------------------+---------");
            for (int i = 0 ; i < magazineName.size() ; i++)
            {
                System.out.println(mID.get(i) + "\t\t: " + magazineName.get(i) + "\t: " + mPublisherName.get(i) + "\t: " + mYear.get(i));
            }
            System.out.println("------------+-----------------------+---------------------------+---------");

        }
        else if(type == 3 )
        {
            System.out.println("\n----------- JOURNAL LIST -----------\n");
            System.out.println("------------+------------------------------------------------------------+---------------------------------------------------------------------------+--------");

            System.out.println("Journal ID\t|\t\t\t\t\t\t\tName\t\t\t\t\t\t\t |\t\t\t\t\t\t\t\tPublisher\t\t\t\t\t\t\t\t\t | Volume");
            System.out.println("------------+------------------------------------------------------------+---------------------------------------------------------------------------+--------");
            for (int i = 0 ; i < journalName.size() ; i++)
            {
                System.out.println(jID.get(i) + "\t\t: " + journalName.get(i) + " : " + jPublisherName.get(i) + " : " + jVolume.get(i));
            }
            System.out.println("------------+------------------------------------------------------------+---------------------------------------------------------------------------+--------");
        }

    }

    public void borrwB(int type,String uid,String mid) {

        if (type == 1)
        {
            for (int i = 0; i < bID.size() ; i++) {
                if (bID.get(i).equals(uid))
                {
                    borrowBName.add(borrowBCount,bookName.get(i));
                    borrowBAuthorName.add(borrowBCount,bAuthorName.get(i));
                    borrowBPublisherName.add(borrowBCount,bPublisherName.get(i));
                    borrowBID.add(borrowBCount,bID.get(i));
                    borrowBMemID.add(borrowBCount,mid);

                    bookName.remove(i);
                    bAuthorName.remove(i);
                    bPublisherName.remove(i);
                    bID.remove(i);
                }
            }

            System.out.println("\nYou Borrowed : " + borrowBName.get(borrowBCount));
            System.out.println("You have 7 days to return the Book");

            borrowBCount++;
            bookCount--;
        }
        else if (type == 2)
        {
            for (int i = 0; i < mID.size() ; i++) {
                if (mID.get(i).equals(uid))
                {
                    borrowMName.add(borrowMCount,magazineName.get(i));
                    borrowMPublisherName.add(borrowMCount,mPublisherName.get(i));
                    borrowMID.add(borrowMCount,mID.get(i));
                    borrwMYear.add(borrowMCount,mYear.get(i));
                    borrowMMemID.add(borrowMCount,mid);

                    magazineName.remove(i);
                    mPublisherName.remove(i);
                    mYear.remove(i);
                    mID.remove(i);
                }
            }

            System.out.println("\nYou Borrowed : " + borrowMName.get(borrowMCount));
            System.out.println("You have 7 days to return the Magazine");

            borrowMCount++;
            magazineCount--;
        }
        else if(type == 3 )
        {
            for (int i = 0; i < jID.size() ; i++) {
                if (jID.get(i).equals(uid))
                {
                    borrowJName.add(borrowJCount,journalName.get(i));
                    borrowJPublisherName.add(borrowJCount,jPublisherName.get(i));
                    borrowJID.add(borrowJCount,jID.get(i));
                    borrowJVolume.add(borrowJCount,jVolume.get(i));
                    borrowJMemID.add(borrowJCount,mid);

                    journalName.remove(i);
                    jPublisherName.remove(i);
                    jVolume.remove(i);
                    jID.remove(i);
                }
            }
            System.out.println("\nYou Borrowed : " + borrowJName.get(borrowJCount));
            System.out.println("You have 7 days to return the Journal");

            borrowJCount++;
            journalCount--;
        }
    }

    public void returnB(int type,String rBID) {

        if (type == 1)
        {
            for (int i = 0; i < borrowBID.size() ; i++) {
                if (borrowBID.get(i).equals(rBID))
                {
                    bookName.add(bookCount,borrowBName.get(i));
                    bAuthorName.add(bookCount,borrowBAuthorName.get(i));
                    bPublisherName.add(bookCount,borrowBPublisherName.get(i));
                    bID.add(bookCount,borrowBID.get(i));

                    borrowBName.remove(i);
                    borrowBAuthorName.remove(i);
                    borrowBPublisherName.remove(i);
                    borrowBID.remove(i);
                    borrowBMemID.remove(i);
                }
            }

            System.out.println("\nYou Returned : " + bookName.get(bookCount));
            System.out.println("Read More Books!!");

            bookCount++;
            borrowBCount--;
        }
        else if (type == 2)
        {
            for (int i = 0; i < borrowMID.size() ; i++) {
                if (borrowMID.get(i).equals(rBID))
                {
                    magazineName.add(magazineCount,borrowMName.get(i));
                    mPublisherName.add(magazineCount,borrowMPublisherName.get(i));
                    mID.add(magazineCount,borrowMID.get(i));
                    mYear.add(magazineCount,borrwMYear.get(i));

                    borrowMName.remove(i);
                    borrowMPublisherName.remove(i);
                    borrowMID.remove(i);
                    borrwMYear.remove(i);
                    borrowMMemID.remove(i);
                }
            }

            System.out.println("\nYou Returned : " + magazineName.get(magazineCount));
            System.out.println("Read More !!");

            magazineCount++;
            borrowMCount--;
        }
        else if(type == 3 )
        {
            for (int i = 0; i < borrowJID.size() ; i++) {
                if (borrowJID.get(i).equals(rBID))
                {
                    journalName.add(journalCount,borrowJName.get(i));
                    jPublisherName.add(journalCount,borrowJPublisherName.get(i));
                    jID.add(journalCount, borrowJID.get(i));
                    jVolume.add(journalCount,borrowJVolume.get(i));


                    borrowJName.remove(i);
                    borrowJPublisherName.remove(i);
                    borrowJID.remove(i);
                    borrowJVolume.remove(i);
                    borrowJMemID.remove(i);

                }
            }
            System.out.println("\nYou Returned : " + journalName.get(journalCount));
            System.out.println("Read More !!");

            journalCount++;
            borrowJCount--;
        }
    }

}
