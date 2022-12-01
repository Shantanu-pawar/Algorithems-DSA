
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception{
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i = 0; i < n; i++){
                        arr[i] = sc.nextInt();
                }

                int ans[] = new int[n];
                // Take reference from NGE 
                // Here we need the previous greater, so we'll start inserting
                // from the left side
                Stack<Integer> st = new Stack<>();
                for(int i = 0; i < n; i++){
                        while(!st.empty() && arr[i] >= arr[st.peek()])
                                st.pop();
                        // Now st.peek() will be >= arr[i];
                        if(!st.empty()){
                                // the st.peek() contains index of prev gretaer element
                                ans[i] = i - st.peek();
                        }
                        else { // stack is empty
                                ans[i] = i + 1;
                        }
                        st.push(i); // index of current element
                }

                for(int i = 0; i < n; i++){
                        System.out.print(ans[i] + " ");
                }
        }
}











