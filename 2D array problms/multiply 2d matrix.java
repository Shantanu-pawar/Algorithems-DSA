


// add substract 2D matrix and multiply 


import java.util.*;

class Main {
    public static void main(String []args ) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int [][] s1=new int[n][m];
        int [][] s2=new int[n][m];


        for (int i=0; i<n ; i++) {
            for(int j=0; j<m ; j++) {
                 s1[i][j] = in.nextInt();
            }
        }
        
        for (int i=0; i<n ; i++) {
            for(int j=0; j<m ; j++) {
                 s2[i][j] = in.nextInt();
            }
        }

        int [][] ans  = new int[n][m];
        
        for (int i=0; i<n ; i++) {
            for(int j=0; j<m ; j++) {
                ans[i][j]  = s1[i][j] * s2[i][j];
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        
     
    }
}

