package com.ArraysD;
/**This is the class which shows you how a chess board needs to look like.*/
public class L5Task1ArrD {
    public static void main(String[] args) {
        System.out.println("Start");
            String[][] chess = new String[8][8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((i + j) % 2 == 0) {
                        chess[i][j] = "W";
                    } else {
                        chess[i][j] = "B";
                    }
                }
            }
            for (String[] a : chess) {
                System.out.println(java.util.Arrays.toString(a));
            }
        }
    }



