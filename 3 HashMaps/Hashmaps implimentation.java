import java.util.*;

// 		Question : implimentation and printing using map.entry
public class Main{
	public static void main(String[] args) {		

        String str = "accioJob";
        int []arr = {4, 5, 6, 7, 0, 2, 1, 3};
        int n = arr.length;
        
        HashMap <Integer, Character> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            map.put(arr[i], ch);
        }
        
        // note : entry.getKey() - print's all arr in sorted format
        //       entry.getValue() = print all character's from hashmap
               
        for (Map.Entry<Integer, Character> entry : map.entrySet()) 
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        
	}
}


//  how to print keyset in hashmaps 

import java.util.*;
class Main{
	public static void main(String []args) {

		String str = "asdf";
		String aa = "fdsa";
		
	HashMap<Character, Integer> map = new HashMap<>();
	
	for(int i=0; i<str.length(); i++) {
	    char ch = str.charAt(i);
	    char ch2 = aa.charAt(i);
	    
	    if(map.containsKey(ch)) {
	        map.put(ch, map.get(ch) + 1);
	    }
	    else map.put(ch, 1);	    
	}

//   printing the storing element's using keyset
    for(Character a : map.keySet())
    System.out.print(a +" ");

	}
}
