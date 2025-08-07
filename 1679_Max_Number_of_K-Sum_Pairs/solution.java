// Ebaad Awan
// August 6, 2025

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int count = 0;

        for (int num : nums) {
            if (numbers.containsKey(num)) {
                numbers.put(num, numbers.get(num) + 1);
            } else {
                numbers.put(num, 1);
            }
        }

        for (int num : nums) {
            if (numbers.containsKey(k - num) && numbers.get(k - num) > 0 && numbers.get(num) > 0) {
                if (num == k - num && numbers.get(num) < 2) {
                    continue;
                }

                count += 1;
                numbers.put(num, numbers.get(num) - 1);
                numbers.put(k - num, numbers.get(k - num) - 1);
            }
        }

        return count;
    }
}
