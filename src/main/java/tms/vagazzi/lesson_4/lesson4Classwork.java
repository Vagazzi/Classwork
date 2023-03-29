package tms.vagazzi.lesson_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class lesson4Classwork {

    private static final int rows = 10;
    private static final int cols = 10;
    private static Random random = new Random();
    public static void main(String[] args) {

        int [] array = new int[20];

        int countingOf = 0;
        int maxCount = 1;

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(5);
        }



        int countofTwos = 0;


        for (int i = 0; i < array.length; i++){
            if (array[i]==2){
                countofTwos++;
            }
        }

        System.out.println(countofTwos);

        //    printOutArray();


       // integerArrayInput();
    }

    private static void printOutArray() {
        int[][] intArray = setIntArray();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println("Element [" + i +"]"+"["+ j +"] is " + intArray[i][j]);;
            }
        }
    }

    private static void integerArrayInput() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[][] setIntArray() {
        int [][] intArray = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                intArray[i][j] = random.nextInt(14);
            }
        }
        return intArray;
    }
}
