package com.stackqueue;

public class LinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;

	}

	/**
	 * to element at front
	 * 
	 * @param newNode
	 */
	public void addFront(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	/**
	 * to add element at the end of linked list
	 * 
	 * @param newNode
	 */
	public void append(INode<K> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	/**
	 * method to delete element from front
	 */
	public void deleteFront() {
		INode<K> tempNode = this.head;
		System.out.println("the data deleted is" + tempNode.getKey());
		this.head = head.getNext();
	}

	/**
	 * method to delete element from end
	 */
	public void deleteLast() {
		INode<K> curNode = head;
		INode<K> prevNode = null;
		while (curNode != null && curNode.getNext() != null) {
			prevNode = curNode;
			curNode = curNode.getNext();
		}
		System.out.println("the data deleted is" + curNode.getKey());
		prevNode.setNext(null);
	}

	/**
	 * method to print nodes
	 */
	public void printMyNodes() {
		System.out.println("My Nodes: " + head);
	}
}
