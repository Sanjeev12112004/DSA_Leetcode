class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int maxLen = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            String currentChar = Character.toString(s.charAt(i));

            while (sb.toString().contains(currentChar)) {
                sb.deleteCharAt(0);
            }

            sb.append(s.charAt(i));
            maxLen = Math.max(maxLen, sb.length());
        }

        return maxLen;
    }
}