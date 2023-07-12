class Solution {
    public int lengthOfLastWord(String s) {
        int j = s.length() - 1;
        int count = 0;

        // Ignore spaces
        while (j >= 0 && s.charAt(j) == ' ') {
            j--;
        }

        // Count characters of last word
        while (j >= 0 && s.charAt(j) != ' ') {
            count++;
            j--;
        }

        return count;
    }
}
// first apporach 
// j = s.length() , j-- till space 
