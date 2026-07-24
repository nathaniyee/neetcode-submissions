class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0
        left = 0 #buy
        right = left + 1 #sell

        while right < len(prices):
            if prices[left] < prices[right]:
                profit = prices[right] - prices[left]
                res = max(res, profit)
            else:
                left = right
            right += 1

        return res

            




        