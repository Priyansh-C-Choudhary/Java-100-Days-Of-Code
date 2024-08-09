package UPES_Training.StackQ;

import java.util.Arrays;
import java.util.Stack;

// NGE
// How many days to wait to get a warmer temperature.

public class q3 {
    public static void main(String[] args) {
        int[] mynums = {73, 74, 75, 71, 69, 72, 76, 73};
        int n = mynums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            // While stack is not empty and current temperature is greater than the temperature.
            while (!st.isEmpty() && mynums[st.peek()] < mynums[i]) {
                int index_popped = st.pop();
                res[index_popped] = i - index_popped;
            }
            st.push(i);
        }

        System.out.println("Days to wait for a warmer temperature: " + Arrays.toString(res));
    }
}
