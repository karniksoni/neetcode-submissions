class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as reference
        String first = strs[0];

        // Store the common prefix
        StringBuilder prefix = new StringBuilder();

        // Traverse each character of the first string
        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            // Compare with every other string
            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                // OR characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return prefix.toString();
                }
            }

            // Character is common in all strings
            prefix.append(ch);
        }

        return prefix.toString();
    }
}