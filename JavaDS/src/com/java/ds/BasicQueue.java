package com.java.ds;

public class BasicQueue<X> {

	private X[] data;
	private int front;
	private int end;
	
	public BasicQueue()
	{
		this(1000);
	}
	
	public BasicQueue(int size)
	{
		this.front = -1;
		this.end = -1;
		data = (X[])new Object[size];
	}
	
	public int size()
	{
		if(front == -1 && end == -1)
		{
			return 0; //Queue is empty
		}else{
			
			return  end - front + 1;
		}
	}
	
	public void enqueue(X item)
	{
		if((end + 1) % data.length == front){
			throw new IllegalStateException("Queue is full");
		}
		else if(size() == 0)
		{
			data[++end] = item;
			front = end;
		}else{
			
			data[++end] = item;
		}
	}
	
	public X dequeue()
	{
		X item = null;
		
		if(size() == 0)
		{
			throw new IllegalStateException("Queue is Empty");
		}
		else if(front == end) // Last element in Queue
		{
			item = data[front];
			data[front] = null;
			front = -1;
			end = -1;
		}else{
			item = data[front];
			data[front] = null;
			front++;
		}
		
		return item;
	}
	
	public boolean contains (X item)
	{
		boolean found = false;
		
		if(size() == 0)
		{
			return found;
		}
		
		for(int i=front;i<end;i++)
		{
			if(data[i].equals(item))
				found = true;
				break;
		}
		
		return found;
	}
	
	public X access(int position)
	{
		if(size() == 0 || position > size())
		{
			throw new IllegalStateException("No item in queue or position greater than queue size");
		}
		
		int trueIndex = 0;
		
		throw new IllegalArgumentException("No item in queue");
	}
}
