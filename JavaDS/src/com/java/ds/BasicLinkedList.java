package com.java.ds;

public class BasicLinkedList<X> {
	
	private Node first;
	private Node last;
	private int nodeCount;
	
	public BasicLinkedList()
	{
		first = null;
		last = null;
		nodeCount = 0;
	}
	
	public int size()
	{
		return nodeCount;
	}
	
	//Adding Element to Linked List
	public void add(X item)
	{
		if(first == null)  //Linkedlist empty. Need to add first node
		{
			first = new Node(item);
			first = last;
			
		}else{ //Grab the last node and update it. 
			
			Node newNode = new Node(item);
			last.setNextNode(newNode);
			last = newNode;
		}
		nodeCount++; //Update Node count
	}
	
	public void insert(X item, int position)
	{
		if(size() < position ){
			throw new IllegalStateException("Linked List smaller than current postion");
		}
		
		Node currentNode = first;
		
		for(int i=1;i<position && currentNode != null;i++)
		{
			currentNode = currentNode.getNextNode();
		}
		
		Node nodeTobeInserted = new Node(item);
		Node tempNode = currentNode.getNextNode();
		currentNode.setNextNode(nodeTobeInserted);
		nodeTobeInserted.setNextNode(tempNode);
		
		nodeCount++;
		
	}
	
	
	public X removeAt(int position)
	{
		X item = null;
		
		if(size() < position ){
			throw new IllegalStateException("Linked List smaller than current postion");
		}
		
		Node currentNode = first;
		Node prevNode = first;
		
		for(int i=1;i<position && currentNode != null;i++)
		{
			prevNode = currentNode;
			currentNode = currentNode.getNextNode();
			
		}
		
		item = currentNode.getNodeItem();
		prevNode.setNextNode(currentNode.getNextNode());
		nodeCount--;
		
		return item;
	}
	
	
	public X remove()
	{
		X item = null;
		
		if(first == null)
		{
			throw new IllegalStateException("List is empty. Nothing to remove");
		}else{
			
			item = first.getNodeItem();
			first = first.getNextNode();
			nodeCount--;
		}
		
		return item;
	}

	private class Node{
		
		private Node nextNode;
		private X item;
		
		public Node(X item)
		{
			this.item = item;
			this.nextNode = null;
		}
		
		public void setNextNode(Node node)
		{
			this.nextNode = node;
		}
		
		public Node getNextNode()
		{
			return nextNode;
			
		}
		
		public X getNodeItem()
		{
			return item;
		}
		
	}
}
