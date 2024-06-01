public class MainMenu {
    public static void main(String[] args) {

        System.out.println("\n\t--------- LIBRARY SYSTEM ---------");

        System.out.println("\n Welcome to the Library Management System\n\t  of University of Kelaniya\n");

        LoginMenu l = new LoginMenu();

        l.addData();

        l.login();
    }
}