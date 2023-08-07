class Solution {
    public int maximumWealth(int[][] accounts) {
        int c =0;
        int n=accounts.length;
        for(int i=0; i<n; i++){
            int sum=0, m=accounts[i].length;
            for(int j=0; j<m; j++) sum+=accounts[i][j];
            if(c<sum) c=sum;
        }
        return c;
    }
}
