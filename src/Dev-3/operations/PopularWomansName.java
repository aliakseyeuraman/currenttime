package operations;

import user.User;

import java.util.ArrayList;

/**
 * This class finding the most popular woman's name
 */
public class PopularWomansName {
    /**
     * @param List contain information about person
     */
    public String SeacherName(ArrayList<User> List) {
        String name = "";
        int maxC = 0;
        int countC = 0;
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i).getSex().equals("female")) {
                name = List.get(i).getName();
                for (int j = i + 1; j < List.size(); j++)
                    if (name.equals(List.get(i).getName()))
                        countC++;
                if (maxC < countC) {

                    maxC = countC;
                    name = List.get(i).getName();
                }
            }
        }
        return name;
    }
}
