
class Solution {
    int print2largest(int arr[], int n) {

            int first , second; 
            
            //case 1:  just check here first condition 
            
            if(n < 2) { 
                return -1;
            }
            
            //case 2:  now travese from whole loop and find which element is large and largest 
            
            first = second = Integer.MIN_VALUE;
            for(int i =0; i<arr.length; i++) {
                
                if  (arr[i] > first) {
                    second = first; 
                    first  = arr[i];
                }
                
            if(arr[i] > second && arr[i] != first ) {
                second = arr[i] ;
                }
            
            }
            
            // case 3 : just check out if your second value is null or not
            // and then problem solve 
            
            if(second == Integer.MIN_VALUE) {
                return -1;
            }
            return second; 
       
    }
}
