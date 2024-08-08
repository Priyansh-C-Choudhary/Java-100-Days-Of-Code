package UPES_Training.ArrayQ;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

// 2-Sum
// Using HashMaps

public class q3 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 3, 2, 7};
        int target = 9;
        int n = arr.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(map.get(complement));
                pair.add(i);
                result.add(pair);
            }
            map.put(arr[i], i);
        }

        if(result.isEmpty()) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices pairs: " + result);
        }
    }
}
