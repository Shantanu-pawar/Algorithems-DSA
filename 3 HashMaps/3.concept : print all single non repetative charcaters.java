import java.util.*;

class Main{
	public static void main(String[] args) {
		
// ques : print first non repeated char from string if all char is repeated then print null
		
		String str = "aabbce";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
		    char c = str.charAt(i);
		    
		    if(map.containsKey(c)) map.put(c, map.get(c) + 1);
		    else map.put(c, 1);
		}
		
		for(Character a : map.keySet() ) {
		  //  just print all the elemnts from map
		  //  System.out.println(a + " " + map.get(a) );
		    
		  //  here print all non repetative elements 
		    if(map.get(a) == 1) 
		        System.out.println("yess element is present : " + a + " "+ map.get(a));
		    
		}
		
	}
}

