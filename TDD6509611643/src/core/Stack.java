package core;

import java.util.ArrayList;
import java.util.List;

public class Stack implements IStack {
	
	private List<Object> elements;
	private int capacity;

    public Stack() {
        elements = new ArrayList<>();
        capacity = 10; 
    }

	public boolean isEmpty() {
		return elements.isEmpty();
	}

	public int getSize() {
		return elements.size();
	}
	
	 public void push(Object elm) {
	        if (!isFull()) {
	            elements.add(elm);
	        } else {
	            System.out.println("Stack is full. Cannot push element.");
	        }
	 }
	 
	 public boolean isFull() {
	        return getSize() >= capacity;
	 }
	 
	 public Object Top() {
	        if (!isEmpty()) {
	            return elements.get(getSize() - 1);
	        } else {
	            return null; 
	    }

	 }
	 
	 public int pop() {
		    if (isEmpty()) {
		        throw new NoSuchElementException("Cannot pop from an empty stack");
		    } else {
		        return (int) elements.remove(getSize() - 1);
		    }
		}

}
