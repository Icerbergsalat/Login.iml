import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static String[] usernames = new String[3];
    ;
    public static String[] passwords = new String[3];
    ;

    public static void main(String[] args) {
        int maxForsøg = 3;
        boolean login = false;
        intialize();
        do {
            login = login();
            if (login){
                System.out.println("Velkommen");
                break;
            } else {
                System.out.println("forkert brugernavn eller adgangskode");
                maxForsøg--;
            }
        } while (maxForsøg > 0);
        if (!login){
            System.out.println("for mange forsøg brugt konto er låst");
        }
    }

    public static boolean validateLogin(String user, String pswd) {
        for (int i = 0; i < usernames.length; i++) {
            if (user.equalsIgnoreCase(usernames[i]) && pswd.equalsIgnoreCase(passwords[i])) {
                System.out.println("ost");
                return true;
            }
        }
        return false;
    }
    public static void intialize (){
        usernames[0] = "admin";
        usernames[1] = "user1";
        usernames[2] = "user2";

        passwords[0] = "password123";
        passwords[1] = "letmein";
        passwords[2] = "qwerty";
    }
    public static boolean login(){
        String loggedInUser = null;
    Scanner input = new Scanner(System.in);
        System.out.print("username: ");
    String username = input.nextLine();
        System.out.print("password: ");
    String password = input.nextLine();

        if(validateLogin(username, password)){
        loggedInUser = username;
        return true;
    }
        return false;
}
}