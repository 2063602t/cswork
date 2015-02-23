package uk.ac.glasgow.jagora.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uk.ac.glasgow.jagora.Stock;
import uk.ac.glasgow.jagora.impl.DefaultStock;

public class StockTest {

	private Stock s;

	@Before
	public void setUp() throws Exception {
		s = new DefaultStock("lemons");
	}

	@Test
	public void testGetName() {
		assertEquals("Expecting Lemons", s.getName(), "lemons");
	}

	@After
	public void tearDown() {
		s = null;
	}
}
