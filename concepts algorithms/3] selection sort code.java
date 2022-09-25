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

        int [] arr = {45, 8, 6, 4, 3, 1, 78, 54};
        selectionsort(arr);
        
        System.out.println();
        
        for(int x : arr){
            System.out.print(x + " ");
        }
	}
	
	public static void selectionsort(int [] arr){
	    int n = arr.length;
	    
	    for(int i=0; i<n-1; i++){  
	        
	       // if you want to control like 2 passes you want lets change the n-1 to 2
	       //then you find first 2 min no's 
	        // here we just have to leave last 2 index of loop otherwise loop won't run
	        
	        int minIndex = i;
	        for(int j =i+1; j< n; j++) {
	            if( arr[j] <arr[minIndex] ) {
	                minIndex = j;
	            }
	        }
	        
	       // now just swap the two index
	       int x = arr[minIndex];
	       arr[minIndex] = arr[i];
	       arr[i] = x; 
	       System.out.println("after pass no" + i + "array is : " + Arrays.toString(arr));
	    }
	    
	    
	}
}
