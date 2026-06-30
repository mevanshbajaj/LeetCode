
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        // count frequency
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        // check uniqueness
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}