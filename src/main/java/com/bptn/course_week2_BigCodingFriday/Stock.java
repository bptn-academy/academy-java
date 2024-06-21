package com.bptn.course_week2_BigCodingFriday;

public class Stock {
    // Create instance variables 
    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    // Constructor 
    public Stock( String tickerSymbol, String companyName, int price,int totalShares){
    this.companyName = companyName;
    this.price = price;
    this.totalShares = totalShares;
    this.tickerSymbol = tickerSymbol.toUpperCase();;
    this.percentChange = 0;
    this.marketCap = totalShares * price;
    }
    // Create the methods 
    public void adjustPrice(int change){
        int oldPrice = this.price;
        this.price += change;
        //used casting in order to change the int change variable to a double
        this.percentChange =  ((double) change/price) * 100;
        this.marketCap = totalShares * this.price;
    }
    public String toString(){
        return ("Ticker Symbol: " +  tickerSymbol + "\nCompany: " + companyName + "\nCurrent Price: " + "$" + price + " (" + percentChange + "%)"+ "\nMarket Cap: " + "$" + marketCap);
    }

    
    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}
