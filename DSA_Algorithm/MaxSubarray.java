package DSA_Algorithm;

public class MaxSubarray {
    //Bruteforce approach 3 nested loops (i,j,k)
    // tc = O(n^3)
    public static void MaxSubArray(int num[]) {
       int currSum = 0;
       int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) { //start
            for (int j = i; j < num.length; j++) { //end
                currSum =0;
                for (int k = i; k <= j; k++) { //start to end
                    // subarray sum 
                   currSum+= num[k];  
                }
                System.out.println(currSum); // Move to next line after printing each subarray
                if (maxSum < currSum) {
                    maxSum=currSum;
                    
                }
                
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        MaxSubArray(num);
    }
}

