package com.stackqueue;

public class QueueTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		Queue myQueue = new Queue();
		myQueue.push(myFirstNode);
		myQueue.push(mySecondNode);
		myQueue.push(myThirdNode);
		myQueue.printQueue();
	}
}
