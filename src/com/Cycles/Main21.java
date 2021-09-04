package com.Cycles;
/**Counts all numbers together from 1 to the number you write down.*/
import java.util.Scanner;
public class Main21 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int b = Integer.parseInt(a.nextLine());
        System.out.println("Now, all numbers will be calculated, wait...");
        int answer = 0;
        for (int i = 1; i < b+1; i++ ) {
            answer+=i;
            if (i < b){
                System.out.println(answer + " + " + (i+1) + " =");
                continue;
            }
        }
        System.out.println(answer);
        System.out.println("End");
        a.close();
            }
}


