package uk.ac.glasgow.jagora.test.stub;

import uk.ac.glasgow.jagora.TickEvent;

public class StubTicketEvent<T> implements TickEvent<T> {

	@Override
	public int compareTo(TickEvent<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getEvent() {
		// TODO Auto-generated method stub
		return (T) new StubTrade();
	}

	@Override
	public Long getTick() {
		// TODO Auto-generated method stub
		return null;
	}


}
