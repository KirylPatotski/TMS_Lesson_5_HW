package com.ArraysD;
/**This shows you the subarrays on the diagonal.*/
public class L5Task4ArrD {
    public static void main(String[] args) {
        System.out.println("Start");
        int[][] array = {
                {1,2},{3,1},{4,5},
                {6,7},{8,9},{0,2},
                {3,7},{5,8},{2,8}
        };
        int n = 2;
        if (array.length >= 9) {
            System.out.println(java.util.Arrays.toString(array[0]));
            System.out.println(java.util.Arrays.toString(array[4]));
            System.out.println(java.util.Arrays.toString(array[8]));
        }
    }
}
