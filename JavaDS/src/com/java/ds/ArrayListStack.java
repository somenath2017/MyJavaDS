package com.java.ds;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<X> implements Stack<X> {
	
	private List<X> itemList = null;
	private int stackPointer;
	
	public ArrayListStack() {
		
		itemList = new ArrayList<X>();
		stackPointer = 0;
	}

	@Override
	public void push(X item) {
		
		itemList.add(stackPointer++, item);
		
	}

	@Override
	public X pop() {
		
		if(itemList.size() == 0)
		{
			throw new IllegalStateException("Stack is empty");
		}
		
		X item = itemList.get(--stackPointer);
		
		return item;
	}

	//Implement Later
	@Override
	public boolean contains(X item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public X access(X item) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
