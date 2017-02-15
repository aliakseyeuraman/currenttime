package operations;

import user.User;
import java.util.ArrayList;

/**
 * TheOldest class checks who is the most old user
 */
public class OlderUser {
    /**
     * Method finding the oldest user
     */
    public String FindingOlderUser(ArrayList<User> List) {
       // Collections.sort(List);
        /*ArrayList<Double> ages = new ArrayList<>();
        double age = 0;
        ages.add(getAge);
        ages.lastIndexOf(age);*/
       String NameSurname = " ";
        double max = 0;
        User OldestUser = List.get(0);
        for (User u : List) {

            if (u.getAge() > max) {
                max = u.getAge();
                OldestUser = u;
            }
            NameSurname = OldestUser.getName() + OldestUser.getSurname();
        }
        return NameSurname;
    }
}
