class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max=0;
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        for(int price:prices){
            if(price<minprice)
                minprice=price;
            profit=price-minprice;
            max=Math.max(profit,max);
        }
        return max;
    }
}
