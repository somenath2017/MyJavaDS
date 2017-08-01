package com.java.ds;

public interface Stack<X> {
	
	public void push(X item);
	public X pop();
	public boolean contains(X item);
	public X access(X item);

}
