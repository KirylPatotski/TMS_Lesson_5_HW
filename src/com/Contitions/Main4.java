package com.Contitions;
/**You need to change the variable a to a number from 1 to 14. (most rainbows are double rainbows)*/
public class Main4 {
    public static void main(String[] args) {
        System.out.println("Start");
        int color = 4;
        if (color == 1 || color == 14 ) System.out.println("Red");
        if (color == 2 || color == 13) System.out.println("Orange");
        if (color == 3 || color == 12) System.out.println("Yellow");
        if (color == 4 || color == 11) System.out.println("Green");
        if (color == 5 || color == 10) System.out.println("Cyan");
        if (color == 6 || color == 9) System.out.println("Blue");
        if (color == 7 || color == 8) System.out.println("Purple");

        if (color > 14 || color < 1) System.out.println("Invalid color");
        System.out.println("End");
    }
}



