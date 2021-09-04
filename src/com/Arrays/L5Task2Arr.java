package com.Arrays;
/**Generates random numbers and saves them in the array 'array'. Then it calculates some statistics.*/
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class L5Task2Arr {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter the length of your array:  ");
        int b = Integer.parseInt(a.nextLine());
        int altogether = 0;
        int average = 0;
        int biggestNumber = 0;
        int smallestNumber = 0;
        int[] array = new int[b];
        for (int i = 0; i < b; i++){
            array[i]= ThreadLocalRandom.current().nextInt(-10000, 10000);
        }
        for (int i = 0; i < b; i++){
            altogether+=array[i];
        }
        for (int i = 0; i < b; i++){
            if(biggestNumber < array[i])
                biggestNumber = array[i];
        }
        for (int i = 0; i < b; i++){
            if(smallestNumber > array[i])
                smallestNumber = array[i];
        }

        average = altogether/array.length -1;
        System.out.println(java.util.Arrays.toString(array));
        System.out.println("altogether: " + altogether);
        System.out.println("average: " + average);
        System.out.println("biggest number: " + biggestNumber);
        System.out.println("smallest number: " + smallestNumber);

    }
}


