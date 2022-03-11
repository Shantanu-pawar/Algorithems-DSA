package com.shantu.ch2_loops_and_JumpStatements;

import java.util.Scanner;

public class ex3_check_if_theNum_is_disariumOrNot {
    public static void main(String[] args) {
// 12456

        System.out.print(" Enter your number " );
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int sum = 0;
         int mul = 1;

         while(n > 0){
         sum = sum + n % 10;
         mul = mul * n % 10;
         n = n /10 ;

         }
         if(sum == mul){
             System.out.println("disarum number");
         }else{
             System.out.println("not ");
         }

    }
}
