package com.shantu.ch3_Arrays;

import java.util.Scanner;

public class ex3_exampleOnArray {
    public static void main(String[] args) {

        /*
        question :

       input data of 10 students consisting roll no and marks of 2 subjects in array
       so calculate the percentage of each student

         */
        Scanner in = new Scanner (System.in);

        int[] rollNo = new int[10];
        int[] english = new int[10];
        int[] polity = new int[10];

        System.out.println("Enter the roll no/ students two subject and marks : ");

        for (int i = 0; i <= 9; i++) {

            rollNo[i] = in.nextInt();
            english[i] = in.nextInt();
            polity[i] = in.nextInt();

        }
        for (int i = 0; i <= 9; i++) {
            float total  = english[i] + polity[i];
            float percentage = total / 2f ; // this is for averaging

//            System.out.printf();
        }
    }
}
