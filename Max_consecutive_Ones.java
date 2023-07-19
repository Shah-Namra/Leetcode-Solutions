class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int currentCount =0;
        for(int num : nums)
        {
            if(num ==1)
            { 
                currentCount ++;
                if(currentCount> count)
                    count = currentCount;
             }
            else currentCount = 0;
        }return count;
    }
}