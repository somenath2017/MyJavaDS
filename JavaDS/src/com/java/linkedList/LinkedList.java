package com.java.linkedList;

public class LinkedList<T> {
	
	private Link<T> first;
	
	public boolean isEmpty()
	{
		return (null == first);
	}

	/**
	 * This method will insert an element at the beginning of the list
	 * @param data
	 */
	public void insertFirst(T data)
	{
		Link<T> newLink = new Link<T>(data);
		newLink.next = first;  // First point New Link to where First is pointing
		first = newLink;  //Then point first to new Link
	}
	
	/**
	 * This method will delete an element from the beginning of the list
	 */
	public Link<T> deleteFirst()
	{
		Link<T> temp = null;
		if(!isEmpty())
		{	
		temp = first;
		first = first.next; // This line is pointing first to next node in the list and also breaking away the node to be delted.
		}
		return temp;
	}
	
	/**
	 * This method will iterate the list and display the data
	 */
	public void displayList()
	{
		if(isEmpty()){
			System.out.println("List is empty");
		}else{
			Link<T> temp = first;
			while(temp != null){
				System.out.println(temp.getData());
				temp = temp.next;
			}
			
			System.out.println("");
		}
			
		
	}
}
