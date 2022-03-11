package com.shantu.ch2_loops_and_JumpStatements;

public class ex4_NastedLoops_PatternQuesStart {
    public static void main(String[] args) {

/*
print the following

1  *  *  *  *
*  2  *  *  *
*  *  3  *  *
*  *  *  4  *
*  *  *  *  5


 */
//
//        System.out.print("Enter your number ");
//        Scanner in = new Scanner(System.in);
//        int a =in.nextInt() ;
//

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {

                if (row == col){
                    System.out.print(row + "  ");
                }
                else{
                    System.out.print("*  ");
                }
            }

            System.out.println( " "); //NOTE : this only print after the end of both for loop
        }


    }
}
