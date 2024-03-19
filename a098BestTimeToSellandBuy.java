
//Buy and Sell Stocks
//prices=[7,1,5,3,6,4]
//Q. You are given an array prices where price[i] is the price of a given stock
// on the i th day.You want to maximize your profit by choosing a single day to buy one stock and 
//choosing a different day in the future to sell that stock. return the maximum profit you can achieve 
//from this transcation. if you cannot achieve any profit , return 0.

import java.util.Arrays;

public class a098BestTimeToSellandBuy {  
    public static int buyAndSellStocks(int price []){
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice<price[i]) { //profit
                int profit=price[i]-buyPrice; //today's profit
                maxProfit=Math.max(maxProfit,profit);
                
            }
            else{
                buyPrice=price[i];

            }
        }
        return maxProfit;
    }
    

    // //my Way:-
    // public static void main(String[] args) {
    //     int price[] ={7,1,5,3,6,4};
    //     int minprice=price[0];
    //     int profit[]=new int [7];
    //     profit[0]=0;
    //     for (int i = 1; i < price.length; i++) {
    //        if (minprice>price[i]) {
    //         minprice=price[i];
    //        }
    //     profit[i]=price[i]-minprice;
    //     }
    //     System.out.println("maxprofit will be "+Arrays.stream(profit).max().getAsInt());
  //}  
    
    public static void main(String[] args) {
    int price[]={7,1,5,3,6,4};
    System.out.println(buyAndSellStocks(price));
}};
