class Solution {
    public int maxProfit(int[] prices) 
    {
        int left = 0; 
        int right = 1; 
        int maxProfit = 0; 

        while (right < prices.length)
        {
            if (prices[left] < prices[right])
            {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }
            else
            {
                left = right; 
            }
            right++;
        }
        return maxProfit;
    }
}

/*
if the profit is some number, then count that as the max. 

If the profit is less than the max, then move the right pointer. 

If the profit is more than the max, that beecoemes the new max. 



*/
