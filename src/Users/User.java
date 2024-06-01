package Users;

import Store.*;
import LendItems.*;

public class User {

    String userID;
    String name;
    String email;
    int age;
    int accessLevel;
    int userCount = 0;

    UserStore us = new UserStore();
    BookStore bs = new BookStore();

    Book b = new Book("","","");
    Magazine m = new Magazine("","",0);
    Journal j = new Journal("0","",0);


    public User(String name, String email, int age , int accessLevel) {
        setName(name);
        setEmail(email);
        setAge(age);
        setAccessLevel(accessLevel);
        generateUID();

        us.addUser(getName(),getEmail(),getAge(),getUserID(),getAccessLevel());
    }

    public void generateUID() {
        this.userCount++;

        String uniqueId = null ;
        if (0<userCount && userCount<10) {
            uniqueId = "U000"+userCount;
        } else if (10<=userCount && userCount<100) {
            uniqueId = "U00"+userCount;
        } else if (100<=userCount && userCount<1000) {
            uniqueId = "U0"+userCount;
        } else if (userCount==1000) {
            uniqueId = "U"+userCount;
        } else {
            System.out.println("Max User Count Exceeded");
        }
        this.setUserID(uniqueId);
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }
}
