

public class Main
{
	public static void main(String[] args) {
        
        int []arr = {1, 2, 3, 4, 5, 6};
        int pos = 1;
        int target = 100;
        int []ans = new int[arr.length+1];
        
        for(int i=0; i<pos-1; i++) {
            ans[i] = arr[i];
        }        
        
        ans[pos-1] = target;
        
        for(int i = pos-1; i<arr.length; i++) 
            ans[i+1] = arr[i]; 
            // i+1 because we actually filled the pos of ith indx by inserting target
            
        for(int x : ans) System.out.print(x + " ");
  
  	}
}
