

import java.util.*;

public class Main
{
	public static void main(String[] args) {
            
            Stack<Integer> st = new Stack<>();
            st.push(45);
            st.push(23);
            st.push(10);
            st.push(12);
            st.push(20);
            st.push(22232);

            st.pop();  // delete last added element 
            System.out.println(st.peek());   // just shows the last element which add in Stack
            
            System.out.println(st.size() + " : size of stack"); // represents size of Stack
            
            System.out.println("check if element is empty : " + st.empty());
            
	}
}

