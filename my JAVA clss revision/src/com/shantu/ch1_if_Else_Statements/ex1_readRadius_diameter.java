package com.shantu.ch1_if_Else_Statements;
import java.util.* ;

public class ex1_readRadius_diameter {
    public static void main(String[] args) {
        /*
        question : read radius, diameter,and circumference of circle by using formula
         */
        System.out.println(" Input your number here : " );
       Scanner in = new Scanner(System.in);
       int r = in.nextInt();

        int diameter  = r + r ;
       double area = 3.14 * r * r ; // double used for pointers acceptance

       double circumference = 2 * 3.14 * r;

        System.out.println( " diameter is : " + diameter +
                " area is : " + area
        + " circumference is : " + circumference );


    }
}
