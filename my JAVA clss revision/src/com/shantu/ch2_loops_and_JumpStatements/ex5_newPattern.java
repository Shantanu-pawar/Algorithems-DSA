package com.shantu.ch2_loops_and_JumpStatements;

public class ex5_newPattern {
    public static void main(String[] args) {

/* question output

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

 */

        for (int row = 1; row <= 5 ; row++) {

            for (int col = 1; col <= row ; col++) {

                System.out.print(row + " "); // for different output just put col instead of row

            }
            System.out.println( "  ");
        }

    }
}
