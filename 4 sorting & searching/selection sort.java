import java.util.*;

public class Main
{
	public static void main(String[] args) {
// 		Selection sort algorithm
// 		trick to remember : in selection we just have to select the min elemnt and then swap it

		    int []arr = { 21, 12, 1, 62, 4};
            
            //  just assume here, the first element and compare it with rest one 
            // and then swap with the element who is less than current this one
            for(int i=0; i<arr.length-1 ;i++) {
                int min = i;
                
                // just you have to traverse in this loop till the end potition
                for(int j=i+1; j < arr.length ; j++) {
                    
                    if(arr[min] > arr[j]) {
                        min = j;
                    }
                }

//  sort the min value to arr [i] current first element in this case :
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            
            for(int x: arr) 
            System.out.print(x + " ");
	 
	}
}



