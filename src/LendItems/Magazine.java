package LendItems;

public class Magazine extends Book{

    int year;
    public int magazineCount = 0;

    public Magazine(String bookName, String publisherName,int year) {
        super(bookName,null,publisherName);
        setYear(year);
    }

    public void generateMID() {
        this.magazineCount++;

        String uniqueId = null;

        if (0< magazineCount && magazineCount <10) {
            uniqueId = "M000" + magazineCount;
        } else if (10<= magazineCount && magazineCount <100) {
            uniqueId = "M00"+ magazineCount;
        } else if (100<= magazineCount && magazineCount <1000) {
            uniqueId = "M0"+ magazineCount;
        } else if (magazineCount == 1000) {
            uniqueId = "M"+ magazineCount;
        } else {
            System.out.println("Max User Count Exceeded");
        }
        this.setBookID(uniqueId);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
