package com.shantu.ch1_if_Else_Statements;

import java.util.Scanner;

public class lightbill_Problem {
    public static void main(String[] args) {

        System.out.print("Enter your Units : ");

        Scanner in = new Scanner(System.in);
        int units = in.nextInt();
        int bill = 0;

        if (units <= 100){
            bill = units * 2 ;
        }
        else if(units <= 500){
            bill = (units - 100)*5 + 200 ;
        }
        else if (units <= 1000){
            bill = (units - 1000)* 7 + 2200;
        }
        else{
            bill = (units - 1000)* 10 + 5700 ;
        }

        System.out.println(" your bill is : " + bill );

    }
}
