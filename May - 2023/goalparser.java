class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] c = command.toCharArray();
        for (int i = 0; i < command.length(); i++) {
            if (c[i] == '(' && c[i + 1] == ')') {
                sb.append("o");
                i++;
            } else if (c[i] == '(' && c[i + 1] == 'a') {
                sb.append("al");
                i += 3;
            } else {
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
}