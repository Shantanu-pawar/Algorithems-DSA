import java.util.*;
class Main{
	public static void main(String []args) {
        
        
        //1. Sort the character array using collection libraries 
        
        String str = "zalkfjd";
        char []arr = str.toCharArray();
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	
	
	   // if we have to split the line and store it into array format then
	    String str2 = "apple orange banana era";
	   // we just split the line here
	   
        String[] words = str2.split(" ");
        System.out.println(Arrays.toString(words));
	    
	    
	    
	   // 2. sort the string input's 
	   Scanner in = new Scanner(System.in);
	   int n  = in.nextInt(); 
	   String []ans1 = new String[n];
	   
	   for(int i=0; i<n; i++) {
	       ans1[i] = in.next();
	   }

	   Arrays.sort(ans1);
	   System.out.println(Arrays.toString(ans1));
	}
}
