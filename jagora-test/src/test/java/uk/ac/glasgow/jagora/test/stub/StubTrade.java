package uk.ac.glasgow.jagora.test.stub;

import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.TickEvent;
import uk.ac.glasgow.jagora.Trade;
import uk.ac.glasgow.jagora.TradeException;

public class StubTrade implements Trade {

	@Override
	public Stock getStock() {
		// TODO Auto-generated method stub
		return new StubStock();
	}

	@Override
	public Integer getQuantity() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return 10.0;
	}

	@Override
	public TickEvent<Trade> execute() throws TradeException {
		// TODO Auto-generated method stub
		return new StubTicketEvent<Trade>();
	}

}
