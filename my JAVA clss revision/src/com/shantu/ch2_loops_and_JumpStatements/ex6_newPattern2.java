package com.shantu.ch2_loops_and_JumpStatements;
/*

1
2  3
4  5  6
7  8  9  10

 */
public class ex6_newPattern2 {
    public static void main(String[] args) {
        int x =1 ;

        for (int row = 1; row <= 4; row++) {

            for (int col = 1; col <= row ; col++) {

                System.out.print(x++ + "  ");

            }
            System.out.println(" ");
        }

    }
}
