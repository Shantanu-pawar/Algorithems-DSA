import java.util.Scanner;

class Main{
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
        
        System.out.println();
    }
    
    public static void quickSort(int[] arr, int left, int right){
        if(left < right ) {
            int index = partition(arr, left, right);
            quickSort(arr, left, index-1);
            quickSort(arr, index+1, right);
        }
    }
    
    public static int partition(int arr[], int l, int r) {
        int pivot = arr[l];
        int i=l, j=r;
        
        while(i < j) {
            while(i <= r && arr[i] <= pivot) i++;
            while(j >= 0 && arr[j] > pivot) j--;
            
            if(i < j) {
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            }
        }
        
        arr[l] = arr[j];
        arr[j] = pivot;
        return j;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before Sorting: ");
        printArray(arr);
        
        quickSort(arr, 0, n-1);
        System.out.print("After Sorting: ");
        printArray(arr);
    }
}
