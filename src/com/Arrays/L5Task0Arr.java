package com.Arrays;
/**This class looks for anything you enter.*/
import java.util.Scanner;
import java.util.*;
public class L5Task0Arr {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] array = new int[15];
        boolean b1 = false;
        for (int i = 0; i < 15; i++){
            array[i]=(i+1);
            }
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int b = Integer.parseInt(a.nextLine());
        for(int i = 0; i < array.length; i++){
           if (b == array[i]){
               System.out.println("Found " + b + " at the position " + i);
               b1 = true;
           }
       }
       if (b1 == false){
           System.out.println("Nothing found, nothing removed.");
       }
        System.out.println("End");
    }
}


