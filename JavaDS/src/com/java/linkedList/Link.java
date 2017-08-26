package com.java.linkedList;

public class Link<T> {
	
	private T data;
	public Link<T> next;
	
	public Link(T data) {
		super();
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Link<T> getNext() {
		return next;
	}
	public void setNext(Link<T> next) {
		this.next = next;
	}
	
	

}
