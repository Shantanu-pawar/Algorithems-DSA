import java.util.*;

 class Main {
   
//     From scratch implimentation of merge sort : 
   
    public static void main(String args[]) {
        int arr[] = { 6, 5, 12, 10, 9, 1 };
        
        //base : pass arr, start, end in recursive function.
        mergeSort(arr, 0, arr.length-1);
    
        //case : just print here the whole arr;
        for (int i = 0; i < arr.length; i++){
          System.out.print(arr[i] + " ");
        }
    }
    
    static void mergeSort(int []arr, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            
            mergeSort(arr, start, mid); // basically calling itself till last elemnt
            mergeSort(arr, mid + 1, end);
        
        //case : after recursive call's just manage it.
            merge(arr, start, mid, end);
        }
        
    }
    
    static void merge(int []arr, int start, int mid, int end) {
        
        int []ans = new int[end - start + 1];
        int i=start; 
        int j=mid + 1; int k=0; 
        
        while(i <= mid && j <= end) {
            
            if(arr[i] < arr[j]) {
                ans[k] = arr[i];  
                i++; k++; 
            }
            
            else {
                ans[k] = arr[j]; 
                j++;  k++;
            }
        }
        
        // store remaining element's 
        while(i <= mid) {
            ans[k] = arr[i]; k++;  i++;
        }
        
        while(j <= end) {
            ans[j] = arr[j]; k++;  j++;
        }
        
// case 4 : it's time to place this all into arr bcaz we actually print inplace at starting func
         k = 0;
        for(int a=start; a<= end; a++) {
            arr[a] = ans[k];  k++;
        }
        
    }
}


