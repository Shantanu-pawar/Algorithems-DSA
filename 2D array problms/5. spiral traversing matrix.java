import java.util.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception
    {
         Scanner scanner = new Scanner(System.in);
         int row = scanner.nextInt();
         int col = scanner.nextInt(); 
         int[][] arr = new int[row][col];
            
         for(int i = 0; i < row; i++)
             for(int j = 0; j < col; j++)
                 arr[i][j] = scanner.nextInt();
                 
        
        int scol = 0, ecol = col - 1;
        int srow = 0, erow = row - 1;
        
        while(srow <= erow && scol <= ecol){
            
            for(int i=scol; i<= ecol; i++) System.out.print( arr[srow][i] + " ");
            srow++;
            
            for(int i=srow; i<= erow; i++) System.out.print( arr[i][ecol] + " ");
            ecol--;
            
            if(srow <= erow) {
            for(int i=ecol; i>= scol; i--) System.out.print(arr[erow][i] + " ");
            erow--;
            }
            
            if(scol <= ecol) {
            for(int i=erow; i>= srow; i--) System.out.print(arr[i][scol] + " ");
            scol++;
            }
            
        }
    }

}
