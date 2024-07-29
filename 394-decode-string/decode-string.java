class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        int n = 0;
        String curr_str = "";
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st.add(curr_str);
                st.add(String.valueOf(n));
                n = 0;
                curr_str = "";
            } else if (c == ']') {
                int k = Integer.parseInt(st.pop());
                String prev_str = st.pop();
                String temp = "";
                for (int i = 0; i < k; i++) {
                    temp= temp + curr_str;
                }
                curr_str = prev_str + temp;
            } else {
                curr_str += c;
            }
        }
        
        return curr_str;
    }
}