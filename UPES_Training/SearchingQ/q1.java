package UPES_Training.SearchingQ;

// Given a positive number X, the task is to find out the maximum positive integer that satisfies the given equation: n2 < X
// Input: X = 101
// Output: 10

public class q1 {
   public static void main(String[] args) {
        int x = 101;
        int low = 0;
        int high = x;
        int ans = 0;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(mid * mid < x){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid;
            }
        
        }
        System.out.println("The value of the positive number is: " + ans);
   } 
}
