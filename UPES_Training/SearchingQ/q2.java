package UPES_Training.SearchingQ;

// Koko Eating Bananas - Q875
// We need the minimum integer k such that she can eat all the bananas within H hours. 
// We can find out that a problem is solved using when we need to find the minimum of a maximum and key words like: "minimum integer k".
// Set the higher limit of k to the greatest number in the array and lower limit to 1.
// Suppose that k is 5, then the number of hours required to eat all the bananas will be 1 + 2 + 2 + 3 = 8. Which is within the time constraint of 8 hours but we need to check for the minimum.
// Now how will we apply the binary search in this problem?

public class q2 {

    public static boolean ispossible(int[] piles, int h, int k) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i]) / k;
            if (piles[i] % k != 0) {
                hours++;
            }
        }
        if(hours > h){
            return false;
        }
        return true;
    }


    // Sorting and then finding the maximum element is also an option, but this is more optimized as we are not sorting the array and then finding the maximum element in a single pass through the array.
    public static int maximum(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int low = 1;
        int high = maximum(piles);
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ispossible(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Minimum k: " + ans);
    }
}
