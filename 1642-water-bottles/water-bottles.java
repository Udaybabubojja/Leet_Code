class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;
            totalBottles += newBottles;
            numBottles = newBottles + (numBottles % numExchange);
        }
        return totalBottles;
    }
}