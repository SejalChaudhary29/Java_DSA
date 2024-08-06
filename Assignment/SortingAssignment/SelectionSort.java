package Assignment.SortingAssignment;

public class SelectionSort {
    public static void SelectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i <=n-2; i++) {
            int minPos = i;
            for (int j = i; j <=n-1; j++) {
                if (arr[j] > arr[minPos]) {
                    minPos = j;
                }
                
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3,  };
        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    
    }
}
