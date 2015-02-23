package uk.ac.glasgow.jagora.test.stub;

import java.util.Set;

import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.StockExchange;
import uk.ac.glasgow.jagora.TradeException;
import uk.ac.glasgow.jagora.Trader;

public class StubTrader implements Trader {

	@Override
	public String getName() {
		return "Merchant";
	}

	@Override
	public Double getCash() {
		return 20.0;
	}

	@Override
	public void sellStock(Stock stock, Integer quantity, Double price)
			throws TradeException {
			
	}

	@Override
	public void buyStock(Stock stock, Integer quantity, Double price)
			throws TradeException {

	}

	@Override
	public Integer getInventoryHolding(Stock stock) {
		return 5;
	}

	@Override
	public void speak(StockExchange stockExchange) {

	}

	@Override
	public Set<Stock> getTradingStocks() {
		return null;
	}

}
