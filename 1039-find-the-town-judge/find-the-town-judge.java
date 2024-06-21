class Solution {
    public int findJudge(int N, int[][] trust) {
        // HashSet<Integer> k1 = new HashSet<>();
        // HashSet<Integer> k2 = new HashSet<>();
        // for(int i=0; i<trust.length; i++){
        //     k1.add(trust[i][0]);
        //     k2.add(trust[i][1]);
        // }
        // for(int i: k2){
        //     if(!k1.contains(i)) return i;
        // }
        // return c;
        int[] in = new int[N + 1];
        int[] out = new int[N + 1];
        for (int[] a : trust) {
            out[a[0]]++;
            in[a[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (in[i] == N - 1 && out[i] == 0)
                return i;
        }
        return -1;
    }
}