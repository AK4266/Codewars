class Solution {
    public boolean isPalindrome(String s) {
        int count = 0;
        String noSpaceStr = s.replaceAll("\\s", "");
        String sentence = noSpaceStr.toLowerCase();
        char[] str = sentence.toCharArray();
        int start = 0, end = noSpaceStr.length() - 1;
        while (start <= end) {
            if (!Character.isLetterOrDigit(str[start])) {
                start++;
            } else if (!Character.isLetterOrDigit(str[end])) {
                end--;
            } else if (str[start] != str[end]) {
                return false;
            } else {
                start++;
                end--;
            }

        }
        return true;
    }
}