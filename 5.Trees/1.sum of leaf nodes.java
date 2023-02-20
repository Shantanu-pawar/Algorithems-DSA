import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;


// here is the ans 
class Solution {

	public static int sum = 0;
	static void preorder(Node root) {
		if(root == null) return;

// case : same as preorder traversal : you just have to return sum for null root's 
		if(root.left == null && root.right == null) 
			sum += root.data;

		preorder(root.left);
		preorder(root.right);
	}
	public int SumofLeafNodes(Node root) {
		sum = 0;
		preorder(root);
		return sum;
    }
}

class Node{
    int data;
    Node left, right;
    
    Node(int key) {
        data = key;
        left = right = null;
    }
}

public class Main{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Node> m = new HashMap<Integer, Node>();
        int n = sc.nextInt();
        Node root = null;
        while(n-- > 0)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            char lr= sc.next().charAt(0);
            Node parent = m.get(n1);
            if (parent == null)
            {
                parent = new Node(n1);
                m.put(n1, parent);
                if (root == null)
                    root = parent;
            }
            Node child = new Node(n2);
            if (lr == 'L')
                parent.left = child;
            else
                parent.right = child;
            m.put(n2, child);
        }
        
        Solution A = new Solution();
        System.out.println(A.SumofLeafNodes(root));
    }
}
