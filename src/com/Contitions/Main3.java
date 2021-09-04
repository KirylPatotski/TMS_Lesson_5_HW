package com.Contitions;
/**You need to change the variable a to a number from -273 to 1000000000.*/
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Start");
        int t = -39;
        int i = -20;
        if (t < -274) System.out.println("Invalid temperature");
        if (t > -5) System.out.println("Warm");
        if (-5 >= t && t >= i){
            System.out.println("Normal");
        }
        if (t <= -20) System.out.println("Cold");

        System.out.println("End");
    }
}



