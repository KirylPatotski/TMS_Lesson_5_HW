package com.Arrays;
/**Fills an array with random numbers and saves every even item int array q.*/
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class L5Task4Arr {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter the length of your array:  ");
        int b = Integer.parseInt(a.nextLine());
        while (b > 10 || b < 5) {
            System.out.print("The length should be between 5 and 100!!! Enter a new number. ");
            b = Integer.parseInt(a.nextLine());
        }
        int[] w = new int[b];
        for (int i = 0; i < b; i++){
            w[i]= ThreadLocalRandom.current().nextInt(0, 100);
        }
        int[] q = new int[b];
        for (int i = 0; i < b; i++){
           if(w[i]%2 ==0){
               q[i] = w[i];
           }
        }
        System.out.println(java.util.Arrays.toString(w));
        System.out.println(java.util.Arrays.toString(q));

    }
}


