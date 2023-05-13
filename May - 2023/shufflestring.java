class Solution {
    public String restoreString(String s, int[] indices) {
        int length = s.length();
        char[] c = new char[length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            c[indices[i]] = s.charAt(i);
        }
        sb.append(c);
        return String.valueOf(sb);
    }
}