class Solution {
    public boolean isPalindrome(String s) {
        int left  = 0;
        int right  = s.length() - 1;
        while (left < right ) {
        char start = s.charAt(left );
        char end = s.charAt(right );
        
        // skipping all non alphanumeric char from left
        if (!Character.isLetterOrDigit(start)) {
            left ++;
            continue;
        }
        // skipping all non alphanumeric char from Right
        if (!Character.isLetterOrDigit(end)) {
            right --;
            continue;
        }
        
        if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
            return false;
        }
        
        left++;
        right --;    
    }
    
    return true;
}}

// capital and small are same
// L increasing and R decreasing 
// O(n) O(1)