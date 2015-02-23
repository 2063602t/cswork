package uk.ac.glasgow.jagora.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.ac.glasgow.jagora.Trade;
import uk.ac.glasgow.jagora.impl.DefaultTrade;
import uk.ac.glasgow.jagora.test.stub.StubBuyOrder;
import uk.ac.glasgow.jagora.test.stub.StubSellOrder;
import uk.ac.glasgow.jagora.test.stub.StubStock;
import uk.ac.glasgow.jagora.test.stub.StubWorld;

public class DefaultTradeTest {
	
	private Trade trade; 

	@Before
	public void setUp() throws Exception {
		trade = new DefaultTrade(new StubWorld(),new StubBuyOrder(), new StubSellOrder(),new StubStock(),3,10.0);
	}

	@After
	public void tearDown() throws Exception {
		trade = null;
	}

	@Test
	public void testExecute() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetPrice() {
		
	}
	
	@Test
	public void testGetQuantity() {
		
	}
	
	@Test
	public void testGetStock() {
		
	}
}
