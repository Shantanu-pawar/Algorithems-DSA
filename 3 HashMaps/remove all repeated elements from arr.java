import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 9, 10, 1, 2, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } 
            
            else map.put(i, 1);
        }
        
        for (int i : arr) {
            if (map.get(i) == 1) 
                System.out.print(i + " ");
        }
        
    }
}


