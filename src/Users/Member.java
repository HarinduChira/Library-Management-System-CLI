package Users;

public class Member extends User{

    public Member(String name, String email, int age,int access) {
        super(name, email, age,access);
    }

    public void borrowLendItem(int type,String uid,String mid)
    {
        bs.borrwB(type,uid,mid);
    }

    public void returnLendItem(int type,String bookID)
    {
        bs.returnB(type, bookID);
    }
}
