class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> a = new ArrayList<Boolean>(candies.length);
        int c=0;
        for(int i=0; i<candies.length; i++) if(candies[i]>c) c=candies[i];
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=c) a.add(true);
            else a.add(false);
        }
        return a;

    }
}
