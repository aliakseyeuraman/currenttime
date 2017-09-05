package by.epam.training.findNumberOfSteps;

import by.epam.training.bean.Draughts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Class for find numbers of steps
 */
public class FindNumberOfSteps {
    private final ArrayList<String> LITERALS = new ArrayList<String>();
    private final ArrayList<String> REVERS_NUMBERS = new ArrayList<String>();
    private static final String[] LETTERS = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
    private static final String[] NUMBERS = new String[]{"8", "7", "6", "5", "4", "3", "2", "1"};
    private static final int MAX_COUNT_OF_STEPS = 7;
    private static final int SIZE_FIELD = 8;

    /**
     * Method for find number of steps
     *
     * @param draughts contains information about draught
     * @return count of steps
     */
    public int find(Draughts draughts) {
        int count;
        String finishPosition = "";
        Collections.addAll(LITERALS, LETTERS);
        Collections.addAll(REVERS_NUMBERS, NUMBERS);
        for (count = 0; count < MAX_COUNT_OF_STEPS; ) {
            while (finishPosition.equals(draughts.getFinishPosition())) {
                finishPosition = move(draughts.getStartPosition(), draughts.getColor(), LITERALS, REVERS_NUMBERS);
                String[] pos = finishPosition.split(",");
                count++;
            }
        }
        return count;
    }

    /**
     * Move draught right
     *
     * @param start         start position
     * @param color         color of draught
     * @param literals      ArrayList of letter
     * @param revertNumbers ArrayList of number
     * @return finish position
     */
    private String moveRight(String start, String color, ArrayList<String> literals, ArrayList<String> revertNumbers) {
        String[] finishpos;
        if (color.equalsIgnoreCase("black")) {
            char[] startPos = start.toCharArray();
            int letter = literals.indexOf(startPos[0]);
            int number = revertNumbers.indexOf(startPos[1]);
            finishpos = new String[]{literals.get(letter - 1), revertNumbers.get(number - 1)};
        } else {
            char[] startPos = start.toCharArray();
            int letter = literals.indexOf(startPos[0]);
            int number = revertNumbers.indexOf(startPos[1]);
            finishpos = new String[]{literals.get(letter + 1), revertNumbers.get(number + 1)};
        }
        return Arrays.toString(finishpos);
    }

    /**
     * Move draught left
     *
     * @param start         start position
     * @param color         color of draught
     * @param literals      ArrayList of letter
     * @param revertNumbers ArrayList of number
     * @return finish position
     */
    private String moveLeft(String start, String color, ArrayList<String> literals, ArrayList<String> revertNumbers) {
        String[] finishpos;
        if (color.equalsIgnoreCase("black")) {
            char[] startPos = start.toCharArray();
            int letter = literals.indexOf(startPos[0]);
            int number = revertNumbers.indexOf(startPos[1]);
            finishpos = new String[]{literals.get(letter + 1), revertNumbers.get(number - 1)};
        } else {
            char[] startPos = start.toCharArray();
            int letter = literals.indexOf(startPos[0]);
            int number = revertNumbers.indexOf(startPos[1]);
            finishpos = new String[]{literals.get(letter - 1), revertNumbers.get(number + 1)};
        }
        return finishpos.toString();
    }

    /**
     * Move draught right and left
     *
     * @param start         start position
     * @param color         color of draught
     * @param literals      ArrayList of letter
     * @param revertNumbers ArrayList of number
     * @return finish position right and left move
     */
    private String move(String start, String color, ArrayList<String> literals, ArrayList<String> revertNumbers) {
        String finish = moveRight(start, color, literals, revertNumbers) + "," +
                moveLeft(start, color, literals, revertNumbers);
        return finish;
    }
// It's new logic, i think it's better...
//    public int class find(Draughts draughts){
//        int count;
//                if (draughts.getColor().equalsIgnoreCase("black")) {
//            count = stepsForBlackDraught(draughts);
//        } else {
//            count = stepsForWhiteDraught(draughts);
//        }
//        return count;
//    }
//    private int stepsForWhiteDraught(Draughts draughts) {
//        int i;
//        for (i = 0; i <= SIZE_FIELD; i++) {
//            char[] position = draughts.getStartPosition().toCharArray();
//            char[] destination = draughts.getFinishPosition().toCharArray();
//            String number = String.valueOf(position[1]);
//            String arg = String.valueOf(destination[1]);
//            int start = Integer.parseInt(number);
//            int finish = Integer.parseInt(arg);
//            if (start + i == finish || finish + i == start + i) {
//                continue;
//            } else {
//                System.out.println("Draught can't reach final point");
//            }
//        }
//        return i;
//    }
//
//    private int stepsForBlackDraught(Draughts draughts) {
//        int i;
//        for (i = 0; i <= SIZE_FIELD; i++) {
//            char[] position = draughts.getStartPosition().toCharArray();
//            char[] destination = draughts.getFinishPosition().toCharArray();
//            String number = String.valueOf(position[1]);
//            String arg = String.valueOf(destination[1]);
//            int start = Integer.parseInt(number);
//            int finish = Integer.parseInt(arg);
//            if (start - i == finish || finish - i == start - i) {
//                continue;
//            } else {
//                System.out.println("Draught can't reach final point");
//            }
//        }
//        return i;
//    }
}
