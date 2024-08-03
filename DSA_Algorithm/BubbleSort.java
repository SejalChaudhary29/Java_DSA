package DSA_Algorithm;

public class BubbleSort {
    // TC = O(n^2)
    public static int bubbleSort(int arr[]) {
        int swapCount = 0; // Initialize swap counter

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Increment swap counter
                    swapCount++;
                }
            }
        }
        return swapCount; // Return the total number of swaps
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
         bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
           
        }
    }
}
