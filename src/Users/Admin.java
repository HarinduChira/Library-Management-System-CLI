package Users;

import Store.UserStore;

public class Admin extends User{

    public Admin(String name, String email, int age , int access) {
        super(name, email, age,access);
    }

    public void addUser(String name,String email,int age,int access) {
        setName(name);
        setEmail(email);
        setAge(age);
        setAccessLevel(access);
        generateUID();

        us.addUser(getName(),getEmail(),getAge(),getUserID(),getAccessLevel());
    }

    public void removeUser(String uid) {
        userCount--;
        us.rmvUser(uid);

    }

    public void updateUser(String uid)
    {
        us.updateUser(uid);
    }

    public void printUserList() {

        us.printUserList();

    }

    public void searchUser(String uid)
    {
        us.searchUser(uid);
    }

    public int checkUser(String loginName,int level) {

        return (us.checkAccess(loginName,level));
    }
}
