package edu.neu.csye6200;

public interface Stack_Generic_API<T> {
	public int size();
	public boolean isEmpty();
	public boolean isFull();
	public void push(T item);
	public T pop();
	public T peek();

}
