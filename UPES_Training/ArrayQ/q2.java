package UPES_Training.ArrayQ;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

// 2-Sum
// 1-pair
// Using HashMaps

public class q2 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 2, 7};
        int target = 9;
        int n = arr.length;

        // Iterate through the array, check if the number required is in the map, if not map the number from the array with its index.
        // For example, we take 8, we need 1 to make it 9, Do we have it in the map? If no, then map 8 -> 0 with its index in the HashMap.

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) {
                result.add(map.get(complement));
                result.add(i);
                break;  // If only one pair is required, we can break after finding the first pair.
            } else {
                map.put(arr[i], i);
            }
        }

        if(result.isEmpty()) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices: " + result);
        }
    }
}
