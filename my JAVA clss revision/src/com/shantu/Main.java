package com.shantu;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code

        System.out.print("Enter your numbers : ");

        Scanner in  = new Scanner (System.in);
        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("here is your array.");
        System.out.println(Arrays.toString(arr));


        System.out.println("Enter your number for searching the elements ");
            int element = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                System.out.println("your element is found : " + element);
                System.exit(0); // this is for exiting the loop from array
            }
        }

        System.out.println("Your element is not found in array .");


    }
}
