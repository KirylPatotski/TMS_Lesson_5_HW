package com.ArraysD;
/**This class multiplies each number with the same index and safes this data in array c.*/
public class L5Task2ArrD {
    public static void main(String[] args) {
        int[][] a = {
                {1,5,7},
                {1,5,3},
                {3,6,9}
        };
        int[][] b = {
                {1,3,4},
                {1,2,6},
                {6,1,7}
        };
        int[][] c = new int[3][3];
        System.out.println("");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
               c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]+ " ");
            }
        }
    }
}
