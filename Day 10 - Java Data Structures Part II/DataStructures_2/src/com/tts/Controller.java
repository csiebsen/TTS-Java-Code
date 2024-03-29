package com.tts;

import java.util.Stack;

public class Controller {

	public void dataStructures2() {
		// Imports the data we need to use the Stack class

		Stack<Integer> myStack = new Stack<Integer>(); 
		// creates a new Integer Stack and assigns its address to myStack

		myStack.push(1); 
		// Pushes 1 to the top of our stack
		// myStack now consists of [1]
		myStack.push(2);
		// myStack now consists of [1, 2] 
		myStack.push(3);
		// myStack now consists of [1, 2, 3] 
		System.out.println(myStack);
		// Despite pushing to the "top" of the stack, the printed representation 
		// puts our new numbers at the back. The important part is that they are 
		// removed from the same place they are added.

		System.out.println(myStack);
		System.out.println(myStack.pop()); 
		System.out.println(myStack);
		System.out.println(myStack.peek()); 		
		System.out.println(myStack);



		
	}
}
