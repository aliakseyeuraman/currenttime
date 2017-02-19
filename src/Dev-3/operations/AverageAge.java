package operations;

import user.User;
import java.util.ArrayList;

/**
 * This class show us average age of users
 */
public class AverageAge {
    /**
     * Method calculate average age of users
     * @param List contain information about person
     */
    public double CalculateAverageAge(ArrayList<User> List) {
        double summ;
        double amount = 0;
        for (User u : List) {
            summ = u.getAge() / List.size();
            amount += summ;
        }
        return amount;
    }
}
