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

    /**
     * @param draughts
     * @return
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
     * @param start
     * @param color
     * @param literals
     * @param revertNumbers
     * @return
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
     * @param start
     * @param color
     * @param literals
     * @param revertNumbers
     * @return
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
     * @param start
     * @param color
     * @param literals
     * @param revertNumbers
     * @return
     */
    private String move(String start, String color, ArrayList<String> literals, ArrayList<String> revertNumbers) {
        String finish = moveRight(start, color, literals, revertNumbers) + "," +
                moveLeft(start, color, literals, revertNumbers);
        return finish;
    }
}
