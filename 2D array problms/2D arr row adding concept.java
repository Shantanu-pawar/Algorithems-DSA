/*
Input:

5
1 2 3 4 5
6 7 8 9 10
1 2 3 4 5
6 7 8 9 10
1 2 3 4 5
Output::

0
-20
10
-10
20
*/

import java.util.*;
class Solution{
	public static int[] result(int n, int[][] mat) {

		int []ans = new int[n];
		int []ans2 = new int[n];
		
		for(int i=0; i<n; i++) {	
			for(int j=0; j<n; j++) {
				ans[i] += mat[i][j];
				ans2[j] += mat[i][j];
			}
		}

		int []ans3 = new int[n];
	for(int i=0; i<n; i++) 
		ans3[i] = ans2[i]-ans[i];

		return ans3;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();
		}
		int[] res = Solution.result(n, mat);
		for (int i = 0; i < n; i++) System.out.println(res[i] + " ");
	}
}
