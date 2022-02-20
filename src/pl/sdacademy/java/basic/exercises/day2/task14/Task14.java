package pl.sdacademy.java.basic.exercises.day2.task14;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {

        int [] inputs = {12, -7, 19, -5};
        System.out.println("Input: " + Arrays.toString(inputs));
        System.out.println("Result: " + negativeValues(inputs));

    }

    public static int negativeValues (int[] inputs) {
        int counter = 0;
        for (int negatives : inputs) {
            if (negatives < 0) {
                counter++;
            }
        }
            return counter;


        }

    }

