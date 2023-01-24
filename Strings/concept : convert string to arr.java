import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Throwable {


/*          approaches : there are two approaches that we can use : 

            1. Using a naive approach via loops
            2. Using toChar() method of String class
        
*/
        String str = "hello world";
        
        // approach 1: 
        char []arr = new char[str.length()];
        
        for(int i=0; i<str.length() ; i++) {
            arr[i] = str.charAt(i); 
        }
        System.out.print(Arrays.toString(arr));
        
        
        
        // approach 2: 
        System.out.print("\n another approach \n");
        String st = "this is new one";
        
        char []ch = st.toCharArray();
        for(char a : ch) System.out.print(a + " ");
    }
}

