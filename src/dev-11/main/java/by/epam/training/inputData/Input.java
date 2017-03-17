package by.epam.training.inputData;

import java.util.Scanner;

/**
 * Mother's class for input
 */
class Input {
    /**
     * @param str string witch you want to print
     * @return input data
     */
    String input(String str) {
        Scanner in = new Scanner(System.in);
        String data;
        System.out.println(str);
        data = in.nextLine();
        return data;
    }
}
