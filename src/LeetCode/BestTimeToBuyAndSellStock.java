package LeetCode;

public class BestTimeToBuyAndSellStock {

    public static int maxProfile(int [] prices ){

        int highPrice = 0;
        int lowPrice = prices[0] ;
        int i = 1;
        if (prices.length == 0) return 0;
       while (i <= prices.length-i){

            if (lowPrice > prices[i])
                lowPrice = prices[i];


            if (prices[prices.length-i] > highPrice)
                highPrice = prices[prices.length-i];

            i++;
        }
        if (highPrice > lowPrice)
            return highPrice-lowPrice;
       else return 0;


    }




}
