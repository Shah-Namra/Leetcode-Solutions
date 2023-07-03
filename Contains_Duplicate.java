// Q) 271 Contains Dupilcate
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

/*Example 1:

Input: nums = [1,2,3,1]
Output: true
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        
        //finding duplicate
        for (int i = 0; i < nums.length; i++) { 
            if (uniques.contains(nums[i])) {
                return true; // we found duplicate
            }
            uniques.add(nums[i]); // didnt find so comparing to the next 
        }
        return false; // we didnt found duplicate

    }
}
// Approaches
// 1. comparing 1st element to all ... 2nd to all .. and so on  o(n2) , o(1)

// 2. Sort and check if two neighbours are same     o(nlogn) , o(1)
// if we use extra space then time complexity can be reduced   
// usinng Hashset   o(n),o(n)
