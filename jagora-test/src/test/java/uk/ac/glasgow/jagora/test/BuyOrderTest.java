package uk.ac.glasgow.jagora.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.ac.glasgow.jagora.BuyOrder;
import uk.ac.glasgow.jagora.Order;
import uk.ac.glasgow.jagora.Trade;
import uk.ac.glasgow.jagora.TradeException;
import uk.ac.glasgow.jagora.impl.LimitBuyOrder;
import uk.ac.glasgow.jagora.test.stub.StubStock;
import uk.ac.glasgow.jagora.test.stub.StubTicketEvent;
import uk.ac.glasgow.jagora.test.stub.StubTrader;

public class BuyOrderTest {

	private BuyOrder order;
	
	@Before
	public void setUp() throws Exception {
		order = new LimitBuyOrder(new StubTrader(), new StubStock(), 5, 15.0);
	}


	@After
	public void tearDown() throws Exception {
		order = null;
	}

	@Test
	public void testGetPrice() {
		assertEquals(15.0, order.getPrice(), 0);
	}
	
	@Test
	public void testGetRemainingQuantity() {
		assertEquals(5, order.getRemainingQuantity(), 0);
	}
	
	@Test
	public void testGetStock() {
		assertEquals("Expecting lemons got" + order.getStock().getName() , order.getStock(), new StubStock());
	}

	@Test
	public void testSatisfyTrade() throws TradeException {
		order.satisfyTrade(new StubTicketEvent<Trade>());
		assertEquals(2,order.getRemainingQuantity(),0);
	}
	
	@Test
	public void testRollBackTrade() throws TradeException {
		order.rollBackTrade(new StubTicketEvent<Trade>());
		assertEquals(8,order.getRemainingQuantity(),0);
	}
	
	@Test
	public void testCompareTo() {
		assertEquals(0, order.compareTo(order), 0);
	}
}
