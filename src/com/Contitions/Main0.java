package com.Contitions;
/**You need to change the variable 'month' to a number between 1 and 12.*/
public class Main0 {
    public static void main(String[] args) {
        System.out.println("Start");
        String season = "winter";
        String month = "9+78#7";
        switch(month) {
            case "1":
                System.out.println("winter, January");
                break;
            case "2":
                System.out.println("winter, February");
                break;
            case "3":
                System.out.println("spring, March");
                break;
            case "4":
                System.out.println("spring, April");
                break;
            case "5":
                System.out.println("spring, May");
                break;
            case "6":
                System.out.println("summer, June");
                break;
            case "7":
                System.out.println("summer, July");
                break;
            case "8":
                System.out.println("summer, August");
                break;
            case "9":
                System.out.println("autumn , September");
                break;
            case "10":
                System.out.println("autumn , October");
                break;
            case "11":
                System.out.println("autumn , November");
                break;
            case "12":
                System.out.println("winter, December");
                break;
            default:
                System.out.println("Invalid. You need to change the variable 'month' to a number between 1 and 12.");
        }
        System.out.println("End");
    }
}


