import java.util.*;
public class Main{
	public static void main(String[] args) {
        // insertion short
    
        int []arr = {9, 8, 7, 6, 5};
        for(int i=1 ; i<arr.length ; i++) {
            int val = arr[i];
            
            int j = i-1;    
            while(j >= 0 && arr[j] > val) {
                arr[j+1] = arr[j];
                
                System.out.println(Arrays.toString(arr));
                j--;
            }

            System.out.println( "\n" + Arrays.toString(arr));
            arr[j+1] = val;
        }
        for(int x : arr) System.out.print(x + " ");
	}
}



public class Main{
	public static void main(String[] args) {
        // insertion short
        
        int []arr = {99, 88, 77, 66, 55};
        
        for(int i=1 ; i<arr.length ; i++) {
        //step 1 : it just stores value in current position    
            int val = arr[i];
            
            
        // step2 : here it starts to compare current pos with left side elements 
        // ex for first pos :   99] [88 77 66 55
        
            int j = i-1;    
            while(j >= 0 && arr[j] > val) {
                arr[j+1] = arr[j];
                j--;
            }

            
        // step 3: here it just gives value lastly at correct position 
            arr[j+1] = val;
        }
        
        for(int x : arr) System.out.print(x + " ");
        
	}
}




