package week2.bigcodingfriday;

public class Stock {

    // Create instance variables 
	String tickerSymbol;
	String companyName;
	int price;
	double percentChange;
	int totalShares;
	long marketCap;
	

    // Constructor 
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		//super();
		this.tickerSymbol = tickerSymbol;
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0;
		this.marketCap = totalShares * price;
	}	
	
    // Create the methods 
	public void adjustPrice(int change) {
		percentChange = ((double)change/ price)*100;
		this.price +=change;
		
		
	}
	
	@Override
	public String toString() {
		return "Ticker Symbol: " + tickerSymbol.toUpperCase() + "\nCompany: " + companyName + "\nCurrent Price: $" + price + " (" + percentChange + "%)" + "\nMarket Cap: $" + marketCap;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
	        System.out.println(stock);
	        stock.adjustPrice(20);
	        System.out.println(stock);		

	}






}
