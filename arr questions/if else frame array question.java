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
            int [] arr = new int[n];
            for(int i=0;i<n; i++){
                arr[i] = in.nextInt();
                }
            
            int positive = 0;
            int negetive  = 0;
            
            // Ques says just find out the +ve and -ve nos from arrya
            // and then we want the +ve nos is even and -ve nos is odd then print possible
            
            for(int i=0; i<n ;i++) {
                
                if(arr[i] > 0 ) {
                    positive++;
                }
                else if (arr[i] < 0){
                    negetive++;
                }
            }
            
            if(positive % 2 == 0 && negetive % 2 == 1) {
                System.out.println("Possible");
            }
            else{
                System.out.println("Not Possible");
            }
            
            
            
	}
}
