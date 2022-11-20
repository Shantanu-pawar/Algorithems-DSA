// problmn soln : https://www.callicoder.com/minimum-difference-element-in-sorted-array/

public class Main
{
	public static void main(String[] args) {
	
	int []arr = {4, 6, 10};
	int n = arr.length;
	int target = 7;
	
	System.out.println(minimumDiff(arr, target, n ));
	
	}
	
	static int minimumDiff(int []arr, int target, int n) {
	    
	   // case 1 : if arr is 1st element
	   if(arr[0] > target) return arr[0];
	   
	   //case 2 : if your target is wayy larger than arr, return the last element
	   if(arr[n-1] < target ) return arr[n-1];
	   
	   
	   //case 3 : start regualr BS and lastly just check the difference of ceil and floors index 
	   //ex : 6 8 14       target = 9
	   //so check diff of  8- 9   & 10-9 then return min one   in this case return 8 element
	   
	    int start =0;
	    int end = n-1;
	    
	    while(start <= end) {
	        int mid = start +(end-start)/2; 
	        
	        if(target == arr[mid]) return arr[mid];
	        else if(arr[mid] > target) end = mid-1;
	        else start = mid+1;
	        
	    }
	    
	   // now just check here start and end difference 
	   
	   if ((arr[start] - target) < (target - arr[end]))
            return arr[start];
        else return arr[end];
        
	}
}
