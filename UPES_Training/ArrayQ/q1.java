package UPES_Training.ArrayQ;

// Kadane's Algorithm GFG

public class q1 {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = 0;
        int maxsum = 0;
        int n = arr.length;

        for (int i = 0; i < n-1; i++){
            sum += arr[i];
            if (sum > maxsum){
                maxsum = sum;
            }
            else if(sum < 0) {
                sum = 0;
            }        
        }
        System.out.println("MaxSum is: " + maxsum);
    }

}