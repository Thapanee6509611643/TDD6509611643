package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	void push(Object elm);
	boolean isFull();
	Object Top();
	int pop();
}
