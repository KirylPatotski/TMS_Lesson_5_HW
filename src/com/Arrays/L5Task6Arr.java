package com.Arrays;
/**Sorts items by alphabet.*/
import java.util.*;
public class L5Task6Arr {
    public static void main(String[] args) {
        System.out.println("Start");
        String[] str = new String[5];
        str[0]="Andrew";
        str[1]="Vladimir";
        str[2]="Tom";
        str[3]="Alex";
        str[4]="Steve";
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
            }
}


