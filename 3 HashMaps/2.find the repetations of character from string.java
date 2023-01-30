import java.util.*;

class Main{
	public static void main(String[] args) {
		
// 		ques : just find if element is present or not 
// 		if present then just print the repetations of number 
		
		String str = "asffas";
		char ch = 'f';
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
		    char c = str.charAt(i);
		    
		    if(map.containsKey(c)) map.put(c, map.get(c) + 1);
		    else map.put(c, 1);
		}
		
		boolean check = false;
		for(Character a : map.keySet() ) {
		    
		    if(a == ch) {
		        System.out.print("yess element is present :" + map.get(a));
		        check = true;
		        break;
		    }
		}
		
		if(check == false) 
		System.out.print("element not present");
	}
}
