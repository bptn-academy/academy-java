package com.bptn.course._Hack_Day;

public class Stock {

    // Create instance variables 
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor 

    public Stock(String tickerSymbol, String companyName, int price, int totalShares){

    this.percentChange = 0;
    this.marketCap = totalShares * price;
    this.tickerSymbol = tickerSymbol;
    this.companyName = companyName;
    this.price = price;
    this.totalShares = totalShares;

    }
    
    // Create the methods 

    public void adjustPrice(int change){

        this.price = change + price; // price += change

        this.percentChange = (change /(double)price)* 100;

        this.marketCap = totalShares * this.price; 

    }

     public String toString(){
        return "Ticker Symbol:  " + this.tickerSymbol.toUpperCase() + "\nCompany:  " + this.companyName + "\nCurrent Price:  " + "$" + this.price + " (" + percentChange + "%)" + "\nMarket Cap: $" + marketCap;

     }



    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}

