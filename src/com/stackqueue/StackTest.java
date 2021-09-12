package com.stackqueue;

public class StackTest {
	public static void main(String[] args) {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		Stack myStack = new Stack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		myStack.peak();
		System.out.println("Performing pop operations till the stackis empty!!");
		myStack.pop();
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
		myStack.pop();
		myStack.printStack();

	}
}
