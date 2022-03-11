package com.shantu.ch1_if_Else_Statements;

import java.util.Scanner;

public class ex4_input_numbers_printLargestNum {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b && a > c){
            System.out.println("largest no : " + a);
        }
        else if (b > c){
            System.out.println("largest no : " + b);
        }
        else{
            System.out.println("largest no : " + c);
        }


    }
}
