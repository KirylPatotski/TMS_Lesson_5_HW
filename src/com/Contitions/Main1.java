package com.Contitions;
/**You need to change the variable 'month' to a number between 1 and 12.*/
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Start");
        String season = "winter";
        int month = 3;
        if (month == 1){
            System.out.println("winter, January");
        }else if (month == 2) {
            System.out.println("winter, February");
        }else if (month == 3) {
            System.out.println("spring, March");
        }else if (month == 4) {
            System.out.println("spring, April");
        }else if (month == 5) {
            System.out.println("spring, May");
        }else if (month == 6) {
            System.out.println("summer, June");
        }else if (month == 7) {
            System.out.println("summer, July");
        }else if (month == 8) {
            System.out.println("summer, August");
        }else if (month == 9) {
            System.out.println("autumn, September");
        }else if (month == 10) {
            System.out.println("autumn, October");
        }else if (month == 11) {
            System.out.println("autumn, November");
        }else if (month == 12) {
            System.out.println("winter, December");
        }else{
            System.out.println("Invalid. You need to change the variable 'month' to a number between 1 and 12.");
        }
        System.out.println("End");
    }
}


