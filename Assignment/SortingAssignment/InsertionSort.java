package Assignment.SortingAssignment;

public class InsertionSort{
    
    public static void InsertionSort(int arr[]){

        for (int i = 0; i <=arr.length-1; i++) {
            int j = i;
            while (j>0 && arr[j-1] < arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                
            }
            
        }
    }    public static void main(String[] args) {
        
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3,  };
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }

    }