import java.util.*;

class Main {
    public static void main(String []args) {
// Problm statement : remove all the repeated duplicate elements 
	
// 		arrr  = {2, 6, 4, 2};
// 		output  6 4 
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
	
		for(int i = 0; i < n; i++)
		    arr[i] = sc.nextInt();
		
		    //here just store the repeatations of elements in frequency arr
		int fre[] = new int[1000];
		for(int i = 0; i < n; i++)
		    fre[arr[i]]++;
		  
		for(int i = 0; i < n; i++)
		    if(fre[arr[i]] == 1) 
		        System.out.print(arr[i] + " ");

	}
}
