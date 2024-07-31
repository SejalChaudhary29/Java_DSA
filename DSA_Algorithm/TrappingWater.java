package DSA_Algorithm;
//Two pointers approach
// AUXILLIARY ARRAY
// tc = O(n);
public class TrappingWater {
    public static int trappedWater(int height[]) {
     // creating auxilliary array(helping array)
        // calculate left max boundary - array
        // leftMa x = [ 4 , 4 , 4 , 6 , 6 , 6 ,6]
        int n = height.length; 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        // calculate right max boundary - array
        // rightMax = [ 5 , 5 , 5 , 6 , 6 , 6 ,6 ] - auxilliary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }
        // loop
        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax boundary , rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = waterlevel - height[i]

            trapWater += waterLevel - height[i];
        }
        return trapWater;

    }

    public static void main(String[] args) {
        int height[] = { 4 , 2, 0 , 6, 3 , 2 , 5};
        System.out.println(trappedWater(height));
}}
