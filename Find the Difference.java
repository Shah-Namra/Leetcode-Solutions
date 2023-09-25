class Solution {

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        // Count characters in s
        for (char c : s.toCharArray()) {
            countS.put(c, countS.getOrDefault(c, 0) + 1);
        }

        // Count characters in t
        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        // Find the difference character
        for (char c : countT.keySet()) {
            if (!countS.containsKey(c) || countS.get(c) < countT.get(c)) {
                return c;
            }
        }

        // Return a default character (optional, depending on your use case)
        return '\0'; // You can change this to handle cases where no difference is found.
    }

}