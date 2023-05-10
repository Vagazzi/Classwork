package tms.vagazzi.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class FifthClasswork {
    public static void main(String[] args) {
        int[][] secondDimensionArray = new int[10][10];

        Random randomFill = new Random(1);

        for (int i = 0; i < secondDimensionArray.length; i++) {
            for (int j = 0; j < secondDimensionArray[i].length; j++) {
                secondDimensionArray[i][j] = randomFill.nextInt(25);
            }
        }
        int[][] teethArray = new int[4][];

        for (int i = 0; i < teethArray.length; i++) {
            teethArray[i] = new int[i + 1];
        }


        int[][] squareArray = new int[5][5];
        int[][] anotherSquareArray = new int[5][5];

        Arrays.compare(squareArray[1], anotherSquareArray[1]);
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                squareArray[i][j] = randomFill.nextInt(50);
                anotherSquareArray[i][j] = squareArray[i][j];
            }
        }

        if (Arrays.deepEquals(squareArray, anotherSquareArray)) {
            System.out.println("Arrays are equal!");
        } else {
            System.out.println("Arrays are don't equal!");
        }


        //    System.out.println(Arrays.deepToString(squareArray));

        int[][][] thirdDimArray = new int[10][10][10];

        for (int i = 0; i < thirdDimArray.length; i++) {
            for (int j = 0; j < thirdDimArray[i].length; j++) {
                for (int k = 0; k < thirdDimArray[i][j].length; k++) {
                    thirdDimArray[i][j][k] = 13;
                }
            }
        }

        for (int i = 0; i < thirdDimArray.length; i++)
        {
            for (int j = 0; j < thirdDimArray[i].length; j++)
            {
                for (int k = 0; k < thirdDimArray[i][j].length; k++)
                {
                    thirdDimArray[i][j][k] += 1;
                }
            }
        }

        System.out.println(Arrays.deepToString(thirdDimArray));

        multiplyArrays();

    }

    public static void multiplyArrays() {
        int[][] firstArray = new int[3][3];
        int[][] secondArray = new int[3][3];
        int[][] resultArray = new int[3][3];

        Random random = new Random();
        for (int i = 0; i < firstArray.length; i++) {
            Arrays.fill(firstArray[i], random.nextInt(15));
            Arrays.fill(secondArray[i], random.nextInt(15));
        }

        System.out.println("First array: ");
        System.out.println(Arrays.deepToString(firstArray));

        System.out.println("Second array: ");
        System.out.println(Arrays.deepToString(secondArray));

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                resultArray[i][j] = firstArray[i][j] * secondArray[i][j];
            }
        }

        System.out.println("Result array: ");
        System.out.println(Arrays.deepToString(resultArray));
    }
}
