import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Throwable {
            Hashmap<String, Integer> hs = new Hashmap<>();
            // add the elements we use .put
            hs.put("shantanu", 001);
            hs.put("dadu", 34);
            
            hs.get(shantanu);
            // then our output is 001
            
            hs.containsKey(shantanu);
            // it should check and then return if this key is present in our DS or not
            // output is  : true;
            
            // NOtes : in arrays you have only specific indexes 
            // but in hashmaps you have whatever type of indexes just relate it
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
