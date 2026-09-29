import java.util.*;

class Solution {
    public int countDistinctAbs(int[] arr) {
        Set<Integer> distinct = new HashSet<>();

        for (int num : arr) {
            distinct.add(Math.abs(num));
        }

        return distinct.size();
    }
}
