package com.Arrays;
/**This class uses the standard bubblesort algorithm*/
import java.util.*;
public class L5Task7Arr {
    public static void main(String[] args) {
        int arr[] ={879,894,233,25,44565,879320,665};
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
static void bubbleSort(int[] arr) {
        int n = arr.length;
        int t = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    t = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}

