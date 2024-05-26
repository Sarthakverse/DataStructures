package stack;

import java.util.Stack;

class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        int num = 1;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i <= pattern.length(); i++) {

            st.push(num);
            num++;
            if (i == pattern.length() || pattern.charAt(i) == 'I') {

                while (!st.isEmpty()) {
                    str.append(st.pop());
                }
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "IIDDD";
        String result = solution.smallestNumber(pattern);
        System.out.println(result);
    }
}
