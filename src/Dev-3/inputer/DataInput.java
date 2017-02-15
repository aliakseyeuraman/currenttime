package inputer;

import user.User;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class responsible for entering data about a person
 */
public class DataInput {
    private ArrayList<User> param = new ArrayList<>();
    String name;
    String surname;
    double age;
    String sex;

    /**
     * Read the data from console
     */
    public void Reader() {
        Scanner in = new Scanner(System.in);
        String select;
        do {
            System.out.println("Enter the name");
            name = in.next();
            System.out.println("Enter the surname");
            surname = in.next();
            System.out.println("Enter the age");
            age = in.nextInt();
            System.out.println("Enter 'MALE' if it's man or enter 'FEMALE' if it's woman");
            sex = in.next();
            System.out.println("If you want to stop entering type 'Exit' or another key to continue");
            select = in.next();
            param.add(new User(name, surname, age, sex));
        } while (!select.equals("Exit"));
    }

    public ArrayList<User> getCollection() {
        return param;
    }
}
