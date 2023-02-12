import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine().trim();
        Solution ob = new Solution();
        String ans = ob.FirstNonRepeating(A);
        System.out.println(ans);
    }
}

class Solution{
    public String FirstNonRepeating(String st){
		
// 		solve using freq arr method here : 
	String ans = "";
        int [] freq = new int[26];
        
        for(int i=0; i<st.length(); i++) {

	// base case :: simply count the freq in arr right
	char ch = st.charAt(i);
            freq[ch - 'a']++;
/*
case1 : just check if our ch is present only one time in freq then only print
	just remember you have to print first occuring char so 
		a a b c -> in this case
		a # b b = cause the freq of b is still 1 till c
*/
            boolean check = false;
            for(int j=0; j<= i; j++) {
		if(freq[ st.charAt(j) - 'a'] == 1) {
                    ans += st.charAt(j);
                    check = true;
  // when you found non repeating then you don't need to check further so..
                    break;
                }
            }

// case2 : otherwise just print # cause there is duplicate element's
            if(check == false) ans += "#";   
        }
	return ans;
    }
}


