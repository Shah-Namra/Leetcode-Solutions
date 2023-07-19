class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digitCount = 0; // Variable to store the count of digits
            while (num != 0) {
                num /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        
        return count;

        }
    }
