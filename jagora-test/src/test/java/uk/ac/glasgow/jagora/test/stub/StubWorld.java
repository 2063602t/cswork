package uk.ac.glasgow.jagora.test.stub;

import uk.ac.glasgow.jagora.TickEvent;
import uk.ac.glasgow.jagora.World;

public class StubWorld implements World {

	@Override
	public <T> TickEvent<T> createTickEvent(T event) {
		// TODO Auto-generated method stub
		return new StubTicketEvent<T>();
	}

}
