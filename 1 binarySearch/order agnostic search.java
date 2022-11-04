
public class Main {
	public static void main(String[] args) {
            int [] arr =  {8, 5, 4, 3, 2, 1};
            
            
        int n = arr.length;
        
        int target = 8;
       
              int ans = 0;
              
       if(arr[0] < arr[n-1]) {
               ans = ascSearch(arr,target);
               
           } 
           else ans = desSearch(arr, target);  
           
            System.out.println(ans);
    }
      
        
        
	static int ascSearch (int [] arr, int target){ // arr : 1 2 3 4 5 6 
	    int start =0;
	    int end = arr.length -1;
	    
	    while(start <= end) {
	        
	        int mid = start + (end- start) /2;
	        
	        if(target == arr[mid]) return mid; // if we want index position
	        
	        if( target < arr[mid] ) 
	        end = mid -1;
	        
	        else 
	        start  = mid +1;
	        
	    }
	    return -1;
	}
	
	
	static int desSearch (int [] arr, int target) {
	    
	    int start =0;
	    int end = arr.length -1;
	    
	    while(start <= end) {
	        
	        int mid = start + (end- start) /2;
	        
	        if(target == arr[mid]) return mid; // if we want index position
	        
	        if( target < arr[mid] )  // 11 10 9 8 7 6 
	        start  = mid +1;
	        
	        else 
	        end = mid -1;
	        
	    }
	    return -1;
	    
	    
	}
}



