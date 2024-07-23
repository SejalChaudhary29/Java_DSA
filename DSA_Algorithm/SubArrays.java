package DSA_Algorithm;

public class SubArrays {
    public static void subArray(int num[]) {
        int ts = 0;
        for (int i = 0; i < num.length; i++) { //start
            for (int j = i; j < num.length; j++) { //end
                for (int k = i; k <= j; k++) { //start to end
                    System.out.print(num[k] + " ");
                }
                System.out.println(); // Move to next line after printing each subarray
                ts++;
            }
        }
        System.out.println("the total space is :" + ts);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        subArray(num);
    }
}
