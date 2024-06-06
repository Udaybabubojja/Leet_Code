class Solution {
    public int reverse(int x) {
        int c=0;
        if(x<0) {
            x= -x;
            c=1;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();
        String k = sb.toString();
        if (c > 0 && k.charAt(k.length() - 1) == '-') {
            k = k.substring(0, k.length() - 1);
        }
        if(Long.valueOf(k)>Integer.MAX_VALUE|| Long.valueOf(k)<Integer.MIN_VALUE) return 0;
        return c>0?-1*Integer.valueOf(k):Integer.valueOf(k);
    }
}