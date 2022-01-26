package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        int sumCurrentLine = 0;
        int sumPreviousLine = 0;
        int line = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Line " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (new Random()).nextInt(50);
                sumCurrentLine += array[i][j];
                System.out.print(array[i][j] + "  ");
            }
            if (sumPreviousLine <= sumCurrentLine) {
                sumPreviousLine = sumCurrentLine;
                line = i;
            }
            System.out.println("| Sum of numbers: " + sumCurrentLine);
            sumCurrentLine = 0;
        }

        System.out.println("\nMax sum per line " + line + " (" + sumPreviousLine + ")");
    }
}
