// use arraylist here 



import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter no: ");
        int n = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i=1; i<=n ; i++) {
                  list.add(i);
        }
        
        System.out.println(list);
        System.out.println("this returns the list size elements :"  +"" + list.size());
        
        System.out.println("this will return elemt at specific index : " + "" +list.get(7));
        System.out.println();
        
        list.add(3);
        System.out.println(list);
        
        list.remove("here give index as input " + ""+ list.remove(9) );
        System.out.println(list);

	}
}







