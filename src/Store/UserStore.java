package Store;

import java.util.*;

public class UserStore {

    List<String> nameList = new ArrayList();
    List<String> emailList = new ArrayList();
    List<Integer> agelist = new ArrayList();
    List<String> uidlist = new ArrayList();
    List<Integer> accesslist = new ArrayList();

    int userCount  = 0 ;

    public void addUser(String name, String email, int age , String UID,int access) {

        nameList.add(userCount,name);
        emailList.add(userCount,email);
        agelist.add(userCount,age);
        uidlist.add(userCount,UID);
        accesslist.add(userCount,access);

        userCount++;
    }

    public void rmvUser(String uid) {
        for (int i = 0; i < nameList.size() ; i++) {
            if (uidlist.get(i).equals(uid))
            {
                System.out.println("\nUser : "  + nameList.get(i) + " : Removed from the System successfully");

                nameList.remove(i);
                agelist.remove(i);
                emailList.remove(i);
                uidlist.remove(i);
                accesslist.remove(i);

                userCount--;

            }
        }
    }

    public void updateUser(String uid) {
        System.out.println("Select the field you want to update : ");
        System.out.println("1.Name\n2.Email\n3.Age\n4.AccessLevel");

        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt())
        {
            case 1:
                System.out.println("Enter updated name : ");
                for (int i = 0; i < nameList.size() ; i++) {
                    if (uidlist.get(i).equals(uid))
                    {
                        nameList.remove(i);
                        nameList.add(i,sc.next());
                        System.out.println("\nUser Name Updated To : "  + nameList.get(i));
                    }
                }
                break;
            case 2:
                System.out.println("Enter updated Email : ");
                for (int i = 0; i < nameList.size() ; i++) {
                    if (uidlist.get(i).equals(uid))
                    {
                        emailList.remove(i);
                        emailList.add(i, sc.next());
                        System.out.println("\nUser Email Updated To : "  + emailList.get(i));
                    }
                }break;
            case 3:
                System.out.println("Enter updated Age : ");
                for (int i = 0; i < nameList.size() ; i++) {
                    if (uidlist.get(i).equals(uid))
                    {
                        agelist.remove(i);
                        agelist.add(i, sc.nextInt());
                        System.out.println("\nUser Age Updated To : "  + agelist.get(i));
                    }
                }
                break;
            case 4:
                System.out.println("Enter updated Access Level : ");
                for (int i = 0; i < nameList.size() ; i++) {
                    if (uidlist.get(i).equals(uid))
                    {
                        accesslist.remove(i);
                        accesslist.add(i, sc.nextInt());
                        System.out.println("\nUser Access Level Updated To : "  + accesslist.get(i));
                    }
                }
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public void searchUser(String uid){

        System.out.println("--------+---------------------------+-----------------------+-------+--------------");
        System.out.println("User ID\t|\t\tName\t\t\t\t|\t\tEmail\t\t\t|  Age\t| Access Level");
        System.out.println("--------+---------------------------+-----------------------+-------+--------------");

        for (int i = 0; i < uidlist.size() ; i++) {
            if (uidlist.get(i).equals(uid))
            {
                System.out.println(uidlist.get(i) + "\t: " + nameList.get(i) + "\t\t\t: " + emailList.get(i) + " :  " +
                        agelist.get(i) + "\t:\t" + accesslist.get(i));
            }
        }

        System.out.println("--------+---------------------------+-----------------------+-------+--------------");
    }

    public void printUserList() {

        System.out.println("--------+---------------------------+-----------------------+-------+--------------");
        System.out.println("User ID\t|\t\tName\t\t\t\t|\t\tEmail\t\t\t|  Age\t| Access Level");
        System.out.println("--------+---------------------------+-----------------------+-------+--------------");

        for (int i = 0 ; i < nameList.size() ; i++)
        {
            System.out.println(uidlist.get(i) + "\t: " + nameList.get(i) + "\t\t\t: " + emailList.get(i) + " : " +
                    agelist.get(i) + "\t:\t" + accesslist.get(i));
        }

        System.out.println("--------+---------------------------+-----------------------+-------+--------------");

    }

    public int checkAccess(String loginName,int level) {

        int access = 0;

        if (level == 1)
        {
            for (int i = 0; i < uidlist.size(); i++) {
                if (nameList.get(i).equals(loginName)) {
                    if (accesslist.get(i) == 1) {
                        access = 1;
                        break;
                    }
                }
            }
        }
        else if (level == 2)
        {
            for (int i = 0; i < uidlist.size(); i++) {
                if (nameList.get(i).equals(loginName)) {
                    if (accesslist.get(i) == 2) {
                        access = 2;
                        break;
                    }
                }
            }
        }
        else if (level == 3)
        {
            for (int i = 0; i < uidlist.size(); i++) {
                if (nameList.get(i).equals(loginName)) {
                    if (accesslist.get(i) == 3) {
                        access = 3;
                        break;
                    }
                }
            }
        }

        return access;

    }

}
