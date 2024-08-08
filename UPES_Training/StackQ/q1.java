package UPES_Training.StackQ;
import java.util.Arrays;
import java.util.Stack;

// Next Greater Element (NGE)
// Right Side

public class q1 {
    public static void main(String[] args) {
        // Below is the Brute Force Method
        /*
        int[] mynums = {1, 5, -3, 7, 1};
        int n = mynums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mynums[j] > mynums[i]) {
                    res[i] = mynums[j];
                    break;
                }
            }
        }

        System.out.println("Next Greater Elements: " + Arrays.toString(res));
        */

       // Below is the Monotonic Stack Solution
        int[] mynums = {5, 7, 6, 8};
        Stack<Integer> st = new Stack<>();
        int n = mynums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        // We store the index in the stack not the element
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && mynums[st.peek()] < mynums[i]){
                int index_popped = st.pop();
                res[index_popped] = mynums[i];
            }
            st.push(i);
        }

        System.out.println("Next Greater Elements: " + Arrays.toString(res));
    }

    // For Left Side, Change the for Loop Direction
}
