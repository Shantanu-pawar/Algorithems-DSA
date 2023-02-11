
import java.util.*;

// use frequency array approach 

class Main{
    public static void main(String []args) {
        Scanner in = new  Scanner(System.in);
        String s = in.next();
        
      // case1 : storing the freq in arr
        int [] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            freq [ch - 'a']++;
        }
        
      
        // just traverse all alphabets 
        char max = 'a';
        for(char c='a' ; c<= 'z'; c++) {
            
            // this case will cover it's lexographical order
            if(freq[c-'a'] > freq[max - 'a'])
                max = c;
        }
        
        System.out.println(max);
 	}
}
