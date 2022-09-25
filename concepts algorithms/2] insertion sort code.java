/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	 int [] arr = {-78, -20, 21, 2, 1, -120};
        insertion(arr);

        // System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

     public static void insertion(int[] arr) {
//        we just go until i < (n-2) to avoid index out of bound
         for (int i = 0; i < arr.length -1 ; i++) {

//             here we always start from i+1 and our j should be j > 0
             for (int j = i+1; j > 0 ; j--) {

//                 so if this condition is true then only swap otherwise just break the loop
                    if(arr[j] < arr[j-1]) {
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    } else{
                        break;
                    }

             }
         }


    }
}