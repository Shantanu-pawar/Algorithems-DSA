import java.util.*;

class Solution{
 
    static boolean isPossible(int a[], int n, int cows, int minDist) {
        int cntCows = 1;
        int lastPlacedCow = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] - lastPlacedCow >= minDist) {
                cntCows++;
                lastPlacedCow = a[i];
            }
        }
        if (cntCows >= cows) return true;
        return false;
    }
    public static int aggressiveCows(int a[],int cows){
        Arrays.sort(a);
        int n=a.length;
        int low = 1, high = a[n - 1] - a[0];
 
        while (low <= high) {
            int mid = (low + high) /2;
 
            if (isPossible(a, n, cows, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
 
 
}
 
class Main {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		
        Solution obj=new Solution();
		System.out.println(obj.aggressiveCows(nums,k));
 
    }
}
