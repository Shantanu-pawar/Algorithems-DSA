package com.shantu.ch2_loops_and_JumpStatements;

import java.util.Scanner;

public class ex2_input_num_Print_SumOfdigits {
    public static void main(String[] args) {
//        ques: input a number and print all sum of digits

        System.out.print("Enter your number here : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while(n > 0){
            sum = sum + n % 10 ;
            n  = n /10 ;
        }
        System.out.println(sum);
    }
}
