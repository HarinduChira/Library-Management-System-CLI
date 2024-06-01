import Users.Admin;
import Users.Librarian;
import Users.Member;

import java.util.Scanner;

public class LoginMenu{

    int login;
    static String loginName;
    int loginOp;

    Admin admin = new Admin("Harindu Basnayake", "ps19152@stu.kln.ac.lk", 23 , 1);
    Librarian librarian = new Librarian("Samadi Perera", "ps19246@stu.kln.ac.lk", 22, 2);
    Member member = new Member("Randika Aberathne", "ps19145@stu.kln.ac.lk", 23, 3);

    //Creating the login Menu
    public void login() {

        System.out.println("1.Administrator Login");
        System.out.println("2.Librarian Login");
        System.out.println("3.Member Login");
        System.out.println("4.Exit");

        System.out.println("\nPlease Enter Your Login Type : ");

        Scanner s = new Scanner(System.in);

        login = s.nextInt();

        userMenu();
    }

    //Creating the User Menus
    public void userMenu() {
        switch (login) {
            case 1: {
                System.out.println("Enter Your Name : ");
                Scanner sa = new Scanner(System.in);

                loginName = sa.nextLine();

                if (admin.checkUser(loginName,1) == 1) {

                    adminMenu();
                }
                else {
                    System.out.println("User Name Error");
                    userMenu();
                }
                break;
            }
            case 2: {
                System.out.println("Enter Your Name : ");
                Scanner sl = new Scanner(System.in);
                loginName = sl.nextLine();

                if (admin.checkUser(loginName,2) == 2) {

                    libMenu();
                } else {
                    System.out.println("User Name Error");
                    userMenu();
                }
                break;
            }
            case 3: {
                System.out.println("Enter Your Name : ");
                Scanner sm = new Scanner(System.in);
                loginName = sm.nextLine();

                if (admin.checkUser(loginName,3) == 3) {

                    memMenu();
                } else {
                    System.out.println("User Name Error");
                    userMenu();
                }
                break;
            }
            case 4: {
                break;
            }
            default:{
                System.out.println("Error Login Type");
                login();
                break;
        }
        }
    }

    //Creating the Administrator Menu
    public void adminMenu() {

        System.out.println("\n--------Welcome Admin--------\n");

        System.out.println("1.Add user to the system");
        System.out.println("2.Remove user from the system");
        System.out.println("3.Update user in the system");
        System.out.println("4.View user list");
        System.out.println("5.Search User details");
        System.out.println("6.Login menu");

        System.out.println("\nEnter option");

        Scanner sam = new Scanner(System.in);
        loginOp = sam.nextInt();

        String name;
        String email;
        int age;
        int access;

        switch (loginOp) {
            case 1: {
                System.out.println("Please enter the Name of the User : ");
                name = sam.nextLine() + sam.nextLine();

                System.out.println("Please enter the Email of the User : ");
                email = sam.nextLine();

                System.out.println("Please enter the Age of the User : ");
                age = sam.nextInt();

                System.out.println("Please enter the Access Level of the User : ");
                access = sam.nextInt();

                admin.addUser(name,email,age,access);

                System.out.println("\nUser : "  + name + " : Added to the System successfully\n");

                adminMenu();
                break;
            }
            case 2: {
                System.out.println("Please enter the UserID of the User to Remove : ");

                name = sam.next();

                admin.removeUser(name);

                adminMenu();
                break;
            }
            case 3: {
                System.out.println("Please enter the UserID of the User to be update : ");

                name = sam.next();

                admin.updateUser(name);

                adminMenu();
                break;
            }
            case 4: {
                System.out.println("\n---User list---\n");

                admin.printUserList();

                adminMenu();
                break;
            }
            case 5: {
                System.out.println("Please enter UserId to search the user : ");

                name = sam.next();

                admin.searchUser(name);

                adminMenu();
                break;
            }
            case 6: {
                login();
                break;
            }
            default: {
                System.out.println("invalid Input");
                adminMenu();
                break;
            }
        }
    }

    //Creating the Librarian Menu
    public void libMenu() {

        System.out.println("\n--------Welcome Librarian--------\n");

        System.out.println("1.Add LendItem to the library");
        System.out.println("2.Remove LendItem from the library");
        System.out.println("3.View List");
        System.out.println("4.Extend Time");
        System.out.println("5.Login menu");

        System.out.println("\nEnter option");

        Scanner slm = new Scanner(System.in);

        loginOp = slm.nextInt();

        String name = null;
        String bName = null;
        String author;
        String publisher;
        int num = 0;
        String id = null;

        switch (loginOp) {
            case 1: {
                System.out.println("1.Add BOOK\n2.Add MAGAZINE\n3.Add JOURNAL");

                num = slm.nextInt();

                if (num == 1)
                {
                    System.out.println("Please enter the Name of the BOOK : ");
                    bName = slm.nextLine() + slm.nextLine();
                    System.out.println("Please enter the Author of the BOOK : ");
                    author = slm.nextLine();
                    System.out.println("Please enter the Publisher of the BOOK : ");
                    publisher = slm.nextLine();

                    librarian.addBook(bName,author,publisher);

                    System.out.println("\nBook : "  + bName + " : Added to the Book Store successfully");

                }
                else if (num == 2) {
                    System.out.println("Please enter the Name of the MAGAZINE : ");
                    bName = slm.nextLine() + slm.nextLine();
                    System.out.println("Please enter the Publisher of the MAGAZINE : ");
                    publisher = slm.nextLine();
                    System.out.println("Please enter the Year of the MAGAZINE : ");
                    num = slm.nextInt();

                    librarian.addMagazine(bName,publisher,num);

                    System.out.println("\nMagazine : "  + bName + " : Added to the Magazine Store successfully");


                }
                else if (num == 3) {

                    System.out.println("Please enter the Name of the JOURNAL : ");
                    bName = slm.nextLine() + slm.nextLine();
                    System.out.println("Please enter the Publisher of the JOURNAL : ");
                    publisher = slm.nextLine();
                    System.out.println("Please enter the Volume of the JOURNAL : ");
                    num = slm.nextInt();

                    librarian.addJournal(bName,publisher,num);

                    System.out.println("\nJournal : "  + bName + " : Added to the Journal Store successfully");

                }
                else {
                    System.out.println("Invalid Input");
                }

                libMenu();
                break;
            }
            case 2: {
                System.out.println("1.Remove BOOK\n2.Remove MAGAZINE\n3.Remove JOURNAL");

                num = slm.nextInt();

                if (num == 1)
                {
                    System.out.println("Please enter the Book Id to be removed : ");

                    id = slm.next();
                }
                else if (num == 2)
                {
                    System.out.println("Please enter the Magazine ID to be removed : ");

                    id = slm.next();
                }
                else if (num == 3)
                {
                    System.out.println("Please enter the Journal ID to be removed : ");

                    id = slm.next();
                }
                else {
                    System.out.println("Invalid input ");
                    libMenu();
                }

                librarian.removeLendItem(num,id);

                libMenu();
                break;
            }
            case 3: {
                System.out.println("1.View BOOK list\n2.View MAGAZINE list\n3.View JOURNAL list");

                num = slm.nextInt();

                switch (num)
                {
                    case 1:
                    case 2:
                    case 3:
                        librarian.printList(num);
                        break;
                    default:
                        System.out.println("Invalid input ");
                        libMenu();
                }
                libMenu();
                break;
            }
            case 4: {
                System.out.println("1.Extend Book time\n2.Extend Magazine Time\n3.Extend Journal Time");

                num = slm.nextInt();

                if (num == 1)
                {
                    System.out.println("Please enter the User Id to be extend time : ");
                    name = slm.next();

                    librarian.printUserAddedList(1,name);

                    System.out.println("Please enter the Book ID to be extend time : ");
                    bName = slm.next();

                    librarian.extendTime(bName,1);
                }
                else if (num == 2)
                {
                    System.out.println("Please enter the User Id to be extend time : ");
                    name = slm.next();

                    librarian.printUserAddedList(2,name);

                    System.out.println("Please enter the Magazine ID to be extend time : ");
                    bName = slm.next();

                    librarian.extendTime(bName,2);

                }
                else if (num == 3)
                {
                    System.out.println("Please enter the User Id to be extend time : ");
                    name = slm.next();

                    librarian.printUserAddedList(3,name);

                    System.out.println("Please enter the Journal ID to be extend time : ");
                    bName = slm.next();
                    librarian.extendTime(bName,3);

                }
                else {
                    System.out.println("Invalid Input");
                    libMenu();
                }

                libMenu();
                break;
            }
            case 5: {
                login();
                break;
            }
            default:{
                System.out.println("invalid Input");
                libMenu();
                break;
        }
        }
    }

    //Creating Member Menu
    public void memMenu() {

        System.out.println("\n--------Welcome Member--------\n");

        System.out.println("1.Borrow");
        System.out.println("2.Return");
        System.out.println("3.Login menu");

        System.out.println("\nEnter option");

        Scanner smm = new Scanner(System.in);

        loginOp = smm.nextInt();

        String bName;
        String mid;

        switch (loginOp) {
            case 1: {
                System.out.println("Enter Member Id : ");

                mid = smm.next();

                System.out.println("1.Borrow Book\n2.Borrow Magazine\n3.Borrow Journal");

                loginOp = smm.nextInt();

                if (loginOp == 1) {

                    librarian.printList(1);

                    System.out.println("Please enter Book ID : ");

                    bName = smm.next();

                    member.borrowLendItem(1,bName,mid);

                } else if (loginOp == 2) {

                    librarian.printList(2);

                    System.out.println("Please enter MAGAZINE ID : ");

                    bName = smm.next();

                    member.borrowLendItem(2,bName,mid);

                } else if (loginOp == 3) {

                    librarian.printList(3);

                    System.out.println("Please enter JOURNAL ID : ");

                    bName = smm.next();

                    member.borrowLendItem(3,bName,mid);
                }else {
                    System.out.println("Invalid Input");
                    memMenu();
                }

                memMenu();
                break;
            }
            case 2: {

                System.out.println("Enter Member Id : ");

                mid = smm.next();

                System.out.println("1.Return Book\n2.Return Magazine\n3.Return Journal");

                loginOp = smm.nextInt();

                if (loginOp == 1) {

                    librarian.printUserAddedList(1 , mid );

                    System.out.println("Please enter Book ID : ");

                    bName = smm.next();

                    member.returnLendItem(1,bName);

                } else if (loginOp == 2) {

                    librarian.printUserAddedList(2 , mid );

                    System.out.println("Please enter MAGAZINE ID : ");

                    bName = smm.next();

                    member.returnLendItem(2,bName);

                } else if (loginOp == 3) {

                    librarian.printUserAddedList(3 , mid );

                    System.out.println("Please enter JOURNAL ID : ");

                    bName = smm.next();

                    member.returnLendItem(3,bName);
                }else {
                    System.out.println("Invalid Input");
                    memMenu();
                }

                memMenu();
                break;
            }
            case 3: {
                login();
                break;
            }
            default:{
                System.out.println("invalid Input");
                memMenu();
            break;}
        }
    }

    //Adding the initial User list,Book list,Magazine list,Journal list
    public void addData() {

        //librarian.addBook();

        librarian.addBook("Publish News Letter     ","Amit Garg          ","MCA Department, MIET Meerut");
        librarian.addBook("Client Server Computing ","Lilit Kumar        ","Sun India Publication, New Delhi");
        librarian.addBook("Mobile Computing        ","Vinay Kumar Singhal","K Nath & Sons,Meerut");
        librarian.addBook("Data Structure Using C  ","Sharad Kumar Verma ","Thakur Publications Lucknow");
        librarian.addBook("Client Server Computing ","Sharad Kumar Verma ","Sun India Publications,New Delhi");
        librarian.addBook("Computer Networks       ","Sharad Kumar Verma ","Sun India Publications,New Delhi");
        librarian.addBook("NET Framework & C#      ","Sharad Kumar Verma ","Sun India Publications,New Delhi");
        librarian.addBook("CBOT                    ","Gunjan Verma       ","Thakur Publications");
        librarian.addBook("Computer Networks       ","Saurabh Singhal    ","Thakur Publications");
        librarian.addBook("Introduction to Computer","Amit Garg          ","Reader’s Zone");

        //librarian.addMagazine();

        librarian.addMagazine("Navaliya             ","Upali Newspapers(Pvt)Lmt ",2022);
        librarian.addMagazine("Vidusara             ","Upali Newspapers(Pvt)Lmt ",2022);
        librarian.addMagazine("EDEX                 ","Edex Magazines           ",2022);
        librarian.addMagazine("Hi!!                 ","Wijaya Newspapers Lmt    ",2021);
        librarian.addMagazine("Sri Lankan Scientist ","WordPress and HitMag     ",2019);
        librarian.addMagazine("Sarasaviya           ","Lake House Publications  ",2021);
        librarian.addMagazine("LMD                  ","Media Services (Pvt) Lmt ",2021);
        librarian.addMagazine("Mahamegha            ","Mahamegha Media Networks ",2020);
        librarian.addMagazine("Ketapath pawra       ","Acroid (Pvt) Lmt         ",2020);
        librarian.addMagazine("Echelon              ","Echelon Magazine         ",2021);

        //librarian.addJournal();

        librarian.addJournal("AGRIEAST - Journal of Agricultural Sciences               ","Faculty of Agriculture, Eastern University                               ",15);
        librarian.addJournal("Anuradhapura Medical Journal                              ","Anuradhapura Clinical Society                                            ",16);
        librarian.addJournal("Applied Economics & Business                              ","Department of Agribusiness Management of the Wayamba University          ",5);
        librarian.addJournal("Asian Journal of Management Studies                       ","Faculty of Management Studies of the Sabaragamuwa University             ",1);
        librarian.addJournal("Bhumi, The Planning Research Journal                      ","Town & Country Planning Research Institute of the University of Moratuwa ",8);
        librarian.addJournal("Built-Environment Sri Lanka                               ","Sri Lanka Institute of Architects                                        ",13);
        librarian.addJournal("Ceylon Journal of Medical Science                         ","Faculty of Medicine, University of Colombo                               ",57);
        librarian.addJournal("FARU Journal                                              ","Faculty of Architecture Research Unit, University of Moratuwa            ",8);
        librarian.addJournal("Galle Medical Journal                                     ","Galle Medical Association                                                ",26);
        librarian.addJournal("International Journal of Accounting and Business Finance  ","Faculty of Management Studies and Finance, University of Jaffna          ",7);

        //admin.addUser();

        admin.addUser("Suchintha Nath","ps19020@atu.kln.ac.lk",23,3);
        admin.addUser("Adeesha Perera","ps19007@stu.kln.ac.lk",23,3);
        admin.addUser("Samadi Perera","ps19246@stu.kln.ac.lk", 22, 2);
        admin.addUser("Randika Aberathne","ps19145@stu.kln.ac.lk", 23, 2);

    }

}









