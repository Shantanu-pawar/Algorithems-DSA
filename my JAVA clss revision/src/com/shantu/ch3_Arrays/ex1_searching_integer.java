package com.shantu.ch3_Arrays;

import java.util.Scanner;

public class ex1_searching_integer {
    public static void main(String[] args) {

//        this is linear search problem

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.print("Enter the elements : ");

//        this is for taking user input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value for finding : ");
        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                System.out.println("Element is found.");
                System.exit(0);

            }
        }
        System.out.println("There is No such element available.");

    }
}
