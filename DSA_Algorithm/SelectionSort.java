package DSA_Algorithm;

public class SelectionSort {
    public static void Selection_Sort(int arr[]){
// tc = O(n);
           int n = arr.length;
             for (int i = 0; i <= n-2; i++) {//turns
                int minPosition = i;
                for (int j = i; j <= n-1; j++) {
                    if(arr[minPosition] > arr[j]){
                        minPosition = j;
                    }
                } 
                
                int temp = arr[minPosition];
                arr[minPosition] = arr[i];
                arr[i] = temp;
             }
            
    }
    public static void main(String[] args) {
        int arr[] = {5 , 4 , 1, 3 ,2 };
       Selection_Sort(arr);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

    }
}
