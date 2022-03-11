package com.shantu.ch1_if_Else_Statements;

import java.util.Scanner;

public class Salary_BonusDistribution_problem {
    public static void main(String[] args) {
        System.out.print("Enter your salary here : ");

        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        float bonus = 0;

        if (salary <= 25000){
            bonus = salary * .45f ;
        }
        if (salary >25000 && salary<= 50000) {
            bonus = salary * .25f;
        }
        if (salary > 50000){
            bonus = salary * .15f;
        }

        System.out.print(" Your bonus on salary is : " + bonus);
    }
}
