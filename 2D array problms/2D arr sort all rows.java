/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    int n = in.nextInt();
	    int m = in.nextInt();
	    
	    int arr[][] = new int[n][m];
	    
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    arr[i][j] = in.nextInt();            
                }
            }
        
        
        // SORT    
           for(int i=0; i<n; i++) {
              Arrays.sort(arr[i]);
           }
           
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    System.out.print(arr[i][j] + " ");    
                }
                System.out.println();
            }
        }
}

