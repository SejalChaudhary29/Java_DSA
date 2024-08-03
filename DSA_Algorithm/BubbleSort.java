package DSA_Algorithm;

public class BubbleSort {
    // TC = O(n^2) worst complexity 
    // for  optimization we can add checks of didSwap O(n)
    public static void bubbleSort(int arr[]) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            int didSwap = 0; // Initialize swap counter
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;

                    
                }
            }
            if (didSwap==0) { // check for optimization O(n)
                break;
            }
            System.out.println("loop runs");
        }
        
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
         bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
           
        }
    }
}
