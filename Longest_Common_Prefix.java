public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        String res = "";

        // Return an empty string if the input array is empty
        if (strs == null || strs.length == 0)
            return res;

        for (int i = 0; i < strs[0].length(); i++) { // Iterate through the index 
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++){ // iterate through the string
                // compare both the string 
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return res;
                }
            }

            // If all strings have the same character at the current index, add it to result
            res += c;
        }

        return res;
    }
}