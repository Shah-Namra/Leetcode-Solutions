/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.

*/

// --- SOLUTION --- 
class Solution {
public:
    int firstUniqChar(string s) {

        unordered_map<char, int> charCount;
        // frequency of each char and storing in hashtable
        for (char c : s) 
            charCount[c]++;
    
        for (int i = 0; i < s.size(); ++i) 
        {
            if (charCount[s[i]] == 1) 
                return i; // found it and returning index 
        }
        return -1; // No unique character found
    }
};