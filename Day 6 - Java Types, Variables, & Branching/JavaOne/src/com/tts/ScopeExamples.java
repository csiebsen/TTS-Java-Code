package com.tts;

public class ScopeExamples {
	// a class-level variable
	int aClassVariable = 0;

	public void methodOne() {
		// a method-level variable - accessible anywhere in methodOne()
		int outer = 0;

		if (outer == 0) {
			// Only accessible inside of this if block and any other block inside
			int inTheIf = 33;

			for (int i = 0; i < 20; i++) {
				// both inTheIf and the for-loop varible are accessible in here
				System.out.println("Value of inTheIf: " + inTheIf++);
				System.out.println("Index: " + i);
				if (i == 20) {
					System.out.println("Value of i: " + i);
				}
			}

			outer = inTheIf % 6; // should set outer to 5

			// This will be a compile error - i is not visible here

			// the closs varible, the method varible, and inTheIf are all visible here
			aClassVariable = outer * inTheIf;

		}
	}

	public void methodTwo() {
		// again, a class variable is access inside a class method
		if (aClassVariable != 0) {
			System.out.println("Method one must have been called!");
		}

		try {
			// variables declared inside a try block
			int noom = 9;
			int denom = 0;

			int boom = noom / denom;
		} catch (Exception e) {
			System.out.println("Oops! An exception");
			// This statement causes a compile error because denom not visible here
			System.out.println("Cannot divide by zero");
		}
	}
}