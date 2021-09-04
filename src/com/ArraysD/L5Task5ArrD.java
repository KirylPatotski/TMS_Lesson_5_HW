package com.ArraysD;
import java.util.Arrays;
import java.util.Comparator;
/**This class sorts the subarrays by size.*/
public class L5Task5ArrD {
    public static void main(String[] args) {
        int[][] array = {
                {1,2},{3,1},{4,5},
                {6,7},{8,9},{0,2},
                {3,7},{5,8},{2,8}
        };
        Arrays.sort(array, Comparator.comparing(a -> a[1]));
        for(int[] x : array) {
            System.out.println(Arrays.toString(x));
        }
    }
}
