package by.epam.training.inputData;

import java.util.Scanner;

/**
 *
 */
public class Input {
    /**
     * @param str
     * @return
     */
    protected String input(String str) {
        Scanner in = new Scanner(System.in);
        String data;
        System.out.println(str);
        data = in.nextLine();
        return data;
    }
}
