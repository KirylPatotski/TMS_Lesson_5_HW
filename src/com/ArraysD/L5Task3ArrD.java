package com.ArraysD;
/**Adds all integers of the array 'array'.*/
public class L5Task3ArrD {
    public static void main(String[] args) {
    int[][] array = {
            {1,2},{3},{4,5},
            {6,7},{8,9},{10,11},
            {12,13},{14,15},{15,16}
    };
    int m =0;
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            m+=array[i][j];
            System.out.println(m);
            }
        }
    }
}


