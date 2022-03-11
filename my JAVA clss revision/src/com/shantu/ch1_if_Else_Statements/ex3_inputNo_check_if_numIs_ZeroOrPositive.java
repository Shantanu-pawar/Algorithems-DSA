package com.shantu.ch1_if_Else_Statements;

import java.util.Scanner;

public class ex3_inputNo_check_if_numIs_ZeroOrPositive {

    public static void main(String[] args) {
//        question: find if a number is +ve -ve or zero
        System.out.print("Enter your number : ");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if (x > 0){
            System.out.println(" number is positive ");
        }
        else if( x < 0){
            System.out.println(" number is negative ");
        }else {
            System.out.println(" number is zero");
        }


    }
}
