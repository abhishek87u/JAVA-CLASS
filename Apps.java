package sample;
// implementation of abstraction
import java.util.Scanner;
abstract class  Softwares{// abstract class
    String user_name;
    String password;

    void user_input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter user name: ");
        user_name = s.nextLine();
        System.out.print("Enter password: ");
        password = s.nextLine();
    }

    void user_login(){
        System.out.println("Welcom to Instagram");
        System.out.println("---------------------");
        System.out.println("Please login here");
    }

    abstract  void app_open();// abstract method
}
class Instagram extends Softwares {// child class

    @Override
    void app_open() {
        while (true) {
            if (user_name.equals("raghav") && password.equals("123@")) {
                System.out.println("SuccessFully App is open");
                break;
            } else {
                System.out.println("Invalid user name and password");
                user_input();
            }
        }


    }
}



public class Apps {
    public static void main(String[] args) {
        Instagram i = new Instagram();
        i.user_login();
        i.user_input();
        i.app_open();

    }

}
