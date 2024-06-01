package LendItems;

public class Journal extends Book{

    public int journalCount = 0;
    int volumeNo;

    public Journal(String bookName, String publisherName,int volumeNo) {
        super(bookName, null, publisherName);
        setVolumeNo(volumeNo);
    }

    public void generateJID() {
        this.journalCount++;
        String uniqueId = null;

        if (0< journalCount && journalCount <10) {
            uniqueId = "J000"+ journalCount;
        } else if (10<= journalCount && journalCount <100) {
            uniqueId = "J00"+ journalCount;
        } else if (100<= journalCount && journalCount <1000) {
            uniqueId = "J0"+ journalCount;
        } else if (journalCount ==1000) {
            uniqueId = "J"+ journalCount;
        } else {
            System.out.println("Max User Count Exceeded");
        }
        this.setBookID(uniqueId);
    }

    public int getVolumeNo() {
        return volumeNo;
    }

    public void setVolumeNo(int volumeNo) {
        this.volumeNo = volumeNo;
    }

}
