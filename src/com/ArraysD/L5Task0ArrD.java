package com.ArraysD;
/**This class scans the array and adds to each element the number you enter.*/
import java.util.Scanner;
public class L5Task0ArrD {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner a = new Scanner(System.in);
        System.out.print("How much should be added to each element:  ");
        int b = Integer.parseInt(a.nextLine());
        int[][][] array = {
                {{1,2},{3,4},{4,5}},
                {{6,7},{8,9},{10,11}},
                {{12,13},{14,15},{15,16}},
        };
        int m;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    m = array[i][j][k];
                    System.out.println(m+=b);
                }
            }
        }
    }
}


