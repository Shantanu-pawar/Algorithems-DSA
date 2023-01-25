import java.util.HashMap;
 
public class Main {
    public static void main(String[] args) throws Throwable {

        String str = "abcabb";
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            char ch = str.charAt(i);
            
// we have to check if our map contains key or not 
//case1 :if our character is already present in DS, just increase its repeatations by 1

            if( map.containsKey(ch) ) map.put(ch, map.get(ch) + 1);
            
// case 2: if char is putting first time then just put 
            else  map.put(ch, 1);
            
        }

// case 3 : now just traverse all unique char and check whose occurance is more        
        int max = 0; 
        char ans = ' ';
        for(Character ch : map.keySet() ) //it represent's all the set that we stored in HashMap
        {
            if(max < map.get(ch) ) {
                ans = ch; // store char
                max = map.get(ch); // store repeatations no
            }
        }
        
        System.out.println("most repeated char is : " + ans + "\n and nos of repeatations is : " + max);
    }
}
