package UPES_Training.Stack;
import java.util.Arrays;
import java.util.Stack;

// Next Smaller Element (NSE)
// For Right Side

public class q2 {
    public static void main(String[] args) {

        // Below is the Monotonic Stack Solution
        int[] mynums = {5, 7, 6, 8};
        Stack<Integer> st = new Stack<>();
        int n = mynums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        // We store the index in the stack not the element
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && mynums[st.peek()] > mynums[i]){ // Only change from q1 is the we changes the comparison
                int index_popped = st.pop();
                res[index_popped] = mynums[i];
            }
            st.push(i);
        }

        System.out.println("Next Greater Elements: " + Arrays.toString(res));
    }

    // For Left Side, Change the for Loop Direction
}
