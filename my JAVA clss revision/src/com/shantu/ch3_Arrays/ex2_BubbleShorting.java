package com.shantu.ch3_Arrays;

import java.util.Arrays;

public class ex2_BubbleShorting {
    public static void main(String[] args) {

        int [] arr = {7, 2, 5, 6, 1};

        for (int i = 0; i < arr.length -1; i++) {
            int flag = 0 ;

            for (int j = 0; j < arr.length -1 - i; j++) {

        if (arr[j] > arr[j+1]){

            int temp = arr[j]; // here is basic swapping is done
            arr[j] = arr[j+1];
            arr[j+1] = temp ;

            flag += 1; // this flag is basically used to avoid unnecessary loop running.
        }

            }

            if (flag == 0)
                break;

        }


//        now this is for print the array

        System.out.print("Here is your shorted Array : ");
        System.out.print(Arrays.toString(arr));
    }
}
