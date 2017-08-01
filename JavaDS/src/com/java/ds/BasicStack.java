package com.java.ds;

//Java implementation in Java API - Stacka and Deque interface. ArrayDeque is implementation class. 
public class BasicStack<X> implements Stack<X> {
	
	private X[] data;
	private int stackPointer;

	public BasicStack()
	{
		data = (X[]) new Object[1000];
		stackPointer = 0;
	}
	
	public void push(X item)
	{
		data[stackPointer++] = item;
	}
	public X pop()
	{
		if(stackPointer == 0)
		{
			throw new IllegalStateException("Stack is Empty");
		}
		return data[-stackPointer];
	}
	
	public boolean contains (X item)
	{
		boolean found = false;
		
		for(int i=0;i<data.length;i++)
		{
			if(item == data[i])
				found = true;
				break;
		}
		
		return found;
	}
	
	public X access(X item)
	{
		while(stackPointer > 0)
		{
			X tempItem = pop();
			if(tempItem == item)
			{
				return item;
			}
		}
		
		throw new IllegalArgumentException("Stack is Empty");
	}
	
	public int size()
	{
		return stackPointer;
	}
}
