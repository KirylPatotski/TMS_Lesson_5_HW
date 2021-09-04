package com.Arrays;
/**Fills an array with random numbers and deletes every item with an uneven index.*/
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class L5Task5Arr {
    public static void main(String[] args) {
        System.out.println("Start");
        int b = 100;
        int[] w = new int[b];
        for (int i = 0; i < b; i++){
            w[i]= ThreadLocalRandom.current().nextInt(0, 100);
        }
        System.out.println(java.util.Arrays.toString(w));
        for (int i = 0; i < b; i++){
            if(i%2 != 0){
                w[i]  = 0;
            }
        }
        System.out.println(java.util.Arrays.toString(w));
    }
}


