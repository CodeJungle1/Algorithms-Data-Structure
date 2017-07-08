package ProblemSetI;

public class StockMaxProfit {
	// Case first : buy once sell once
	public void MaxProfitBuySellOnce(int stockPrices[]) {
		int minStockPrice = stockPrices[0];
		int maxStockPrice = stockPrices[0];
		int buy = 0, sell = 0, profit = 0, difference = 0;

		for (int i = 1; i < stockPrices.length; i++) {
			if (minStockPrice > stockPrices[i]) {
				difference = maxStockPrice - minStockPrice;
				if (difference > profit) {
					buy = minStockPrice;
					sell = maxStockPrice;
					profit = difference;
				}
				minStockPrice = stockPrices[i];
				maxStockPrice = stockPrices[i];
			} else if (maxStockPrice < stockPrices[i]) {
				maxStockPrice = stockPrices[i];
			}
		}
		difference = maxStockPrice - minStockPrice;
		if (difference > profit) {
			buy = minStockPrice;
			sell = maxStockPrice;
			profit = difference;
		}
		System.out.println("Max Profit : " + profit + " when we buy at : "
				+ buy + " and sell at : " + sell);
	}

	// Case Second : buy & sell multiple times
	public void MaxProfitBuySellMulti(int stockPrices[]) {
		int minStockPrice = stockPrices[0];
		int maxStockPrice = stockPrices[0];
		int profit = 0, difference = 0;

		for (int i = 1; i < stockPrices.length; i++) {
			if (minStockPrice > stockPrices[i]) {
				difference = maxStockPrice - minStockPrice;
				profit = profit + difference;
				minStockPrice = stockPrices[i];
				maxStockPrice = stockPrices[i];
			} else if (maxStockPrice < stockPrices[i]) {
				maxStockPrice = stockPrices[i];
			}
		}
		difference = maxStockPrice - minStockPrice;
		profit = profit + difference;
		System.out.println("Max Profit when buy and sell multi : " + profit);
	}

	public static void main(String arrr[]) {
		int stockPrices[] = { 100, 120, 150, 200, 80, 50, 110, 150, 200, 210 };
		StockMaxProfit maxProfit = new StockMaxProfit();
		maxProfit.MaxProfitBuySellOnce(stockPrices);
		maxProfit.MaxProfitBuySellMulti(stockPrices);
	}
}
