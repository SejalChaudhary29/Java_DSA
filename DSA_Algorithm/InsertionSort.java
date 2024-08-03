package DSA_Algorithm;

public class InsertionSort {
    public static void Insertion(int arr[]){

        for (int i = 0; i <= arr.length-1; i++) {
            int j = i;
            
            while (j > 0 && arr[j-1] >arr[j]) {
                // arr[prev+1] = arr[prev];
                int temp =  arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
            // arr[prev+1] = curr;
            
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5,4 ,1 , 3 ,2};
        Insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    

    }
}
