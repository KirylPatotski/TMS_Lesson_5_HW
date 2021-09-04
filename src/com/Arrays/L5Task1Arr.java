package com.Arrays;
/**This is the class which removes items in an array.*/
import java.util.Scanner;
import java.util.*;
public class L5Task1Arr {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] array ={1, 1, 1, 4, 8, 1, 7, 1, 6, 5, 1, 6, 7};
        System.out.println(java.util.Arrays.toString(array));
        Scanner a = new Scanner(System.in);
        int g =0;
        int cLength = 0;
        System.out.print("Please enter your number to remove: ");
        int b = Integer.parseInt(a.nextLine());
        for(int i = 0; i < array.length; i++){
            if (b != array[i]){
                cLength++;
            }
        }
        int[] c = new int[cLength];
        for(int i = 0; i < array.length; i++){
            if (b != array[i]){
                c[g] = array[i];
                g++;
            }
        }
        if (c.equals(array)){
            System.out.println("Nothing found, nothing removed.");
        }
        System.out.println(java.util.Arrays.toString(c));
        System.out.println("End");
    }
}


