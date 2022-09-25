/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
    int[] arr = { 1, 2, 3, 45, 11, 48 };
    bubblesort (arr);

    for (int i = 0; i < arr.length; i++){
	System.out.print (arr[i] + " ");
      }
  }
  
  
  public static void bubblesort (int[]arr) {
    int n = arr.length;
    
    for (int i = 0; i < n - 1; i++){
        
        int count = 0; 
        // this count will reduce the iterations if your arr is already sorted 
        
	for (int j = 0; j < n - 1 - i; j++){

	    if (arr[j] < arr[j + 1])
	      {
	          count = count+1;
	          
		int temp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = temp;

	      }
	    }
	    if(count == 0) 
	        break;
	    
	    
      }

  }
}
