import java.util.*;

public class Main
{
	public static void main(String[] args) {
// 		Bubble sort algorithm

            int []arr = {12, 54, 32, 1, 14, 15, 15};
            
            for(int i=0; i<arr.length-1; i++) {
                for(int j=i+1; j<arr.length; j++) {
                    
                    if(arr[i] > arr[j]) {
                     int temp = arr[i];
                     arr[i] = arr[j]; 
                     arr[j] =  temp;
                    }
                }
            }
            
        for(int x : arr) {
            System.out.print(x +" ");
        }
    
	}
}

