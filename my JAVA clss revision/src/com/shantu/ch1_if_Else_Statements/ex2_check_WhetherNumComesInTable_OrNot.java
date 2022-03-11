package com.shantu.ch1_if_Else_Statements;
import java.util.Scanner ;

public class ex2_check_WhetherNumComesInTable_OrNot {
    public static void main(String[] args) {
//        question : input number and check whether it comes in table of 7

        System.out.println("input your number to check whether it comes in table or not : ");

        Scanner in = new Scanner (System.in);
        int num = in.nextInt();

        if (num % 7 == 0){
            System.out.println(" it comes in the 7th table ");
        }else {
            System.out.println(" It not comes in table !! ");
        }

    }
}
