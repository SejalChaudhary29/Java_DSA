package DSA_Algorithm;

public class BubbleSort {
    public static int bubbleSort(int arr[]) {
        int swapCount = 0;  // Initialize swap counter

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
        return swapCount;  // Return the total number of swaps
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        // Print array before sorting
        System.out.print("Before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sort the array and get the number of swaps
        int swaps = bubbleSort(arr);

        // Print array after sorting
        System.out.print("After sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print the number of swaps
        System.out.println("Total swaps: " + swaps);
    }
}
