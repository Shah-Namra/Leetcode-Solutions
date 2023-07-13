class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length *2];
        
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
// 2n elements
// easiest way 
// make new array and take input how many time u want to concat
// pushing its twice O(n) O(n)