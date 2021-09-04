package com.Arrays;
/**This is the class which compares 2 arrays*/
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class L5Task3Arr {
    public static void main(String[] args) {
        System.out.println("Start");
        int altogether1 = 0;
        int average1 = 0;
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++){
            array1[i]= ThreadLocalRandom.current().nextInt(-100, 100);
        }
        for (int i = 0; i < array1.length; i++){
            altogether1+=array1[i];
        }
        average1 = altogether1/array1.length -1;
        System.out.println(java.util.Arrays.toString(array1));
        int altogether2 = 0;
        int average2 = 0;
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++){
            array2[i]= ThreadLocalRandom.current().nextInt(-100, 100);
        }
        for (int i = 0; i < array2.length; i++){
            altogether2+=array2[i];
        }
        average2 = altogether2/array2.length -1;
        System.out.println(java.util.Arrays.toString(array2));
        if (average1 > average2) System.out.println("Array 1 is bigger");
        if (average1 < average2) System.out.println("Array 2 is bigger");
      }
}


