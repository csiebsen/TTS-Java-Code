package com.tts;

import java.util.Random;

public class Controller {

	
	 // insert ONLY positive, odd data
	public void insertOddData(int data)
	{
	    // equal to 0 check
	    if (data == 0)
	    { 
	        return;
	    }
	    // Negative check
	    if (data < 0)
	    {
	        return;
	    }
	    // check to see if data is even or odd
	    if ( data%2 == 0)
	    {
	        return;
	    }
	 
	    // some code here to store the odd data somewhere
	    System.out.println("Odd Data Stored " + data);
	    return;
	}
	 
	// find and return the sum of the array
	public int getArraySum(int[] arr)
	{
	    // initialize to a valid default return value
	    int sum = 0;
	 
	    // array must have values to sum
	    if (arr.length > 0)
	    {
	        for( int n : arr)
	        {
	            sum += n;
	        }
	    }
	 
	    return sum;
	}
	
	public void continue1() {
		// generate a random number between 0 and 100
		Random random = new Random();
		int breakAt = random.nextInt(100);
		 
		// print a 'list' of random length
		for(int i=0; i<100; i++)
		{
		    if ( i==breakAt)
		    {
		        System.out.println("Random number was: " + breakAt);
		        break;
		    }
		    // if number is even, skip to next iteration
		    if ( i%2==0)
		    {
		        continue;
		    }
		    System.out.println("Index: " + i);
		}
		System.out.println("After the loop");
	}
	public void break2() {
		Random random = new Random();
		int breakAt = random.nextInt(100);
		 
		for(int x=1; x<=5; x++)
		{
		    System.out.println("Starting list " + x);
		 
		    for(int i=0; i<100; i++)
		    {
		        if ( i==breakAt)
		        {
		            System.out.println("Length of this list: " + breakAt);
		            break;
		        }
		        System.out.println("Index: " + i);
		    }
		    System.out.println("Finished list " + x);
		    // Get the next randome number for a different size list
		    breakAt = random.nextInt(100);
		}
		System.out.println("After the loop");

	}
	public void break1() {
		
		// generate a random number between 0 and 100
		Random random = new Random();
		int breakAt = random.nextInt(100);
		 
		// print a 'list' of random length
		for(int i=0; i<100; i++)
		{
		    if ( i==breakAt)
		    {
		        System.out.println("Random number was: " + breakAt);
		        break;
		    }
		    System.out.println("Index: " + i);
		}
		System.out.println("After the loop");
	}
	
	public void whileLoop() {
		int i = 0;
		do {
			System.out.println(i++);
		} while (i>10);

	}
	
	public void forLoop() {
		int[] simpleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 
		// using the standard for loop and the length property of an array
		for (int i = 0; i < simpleArray.length; i++) 
		{
		    System.out.println("Normal for value: " + simpleArray[i]);
		}
		 
		// using the enhanced for loop
		for (int item : simpleArray) 
		{
		    System.out.println("Enhanced for: " + item);
		}
		 
	}
	
	public void helloWorld() {
		System.out.println("helloWorld");
	}

	void checkId(boolean validId, int age, boolean buyingAlc) {
		if (validId) {
			System.out.println("Valid ID presented");
			if ((age > 21) && (buyingAlc)) {
				System.out.println("Customer legal to purchase alcohol");
			} else {
				System.out.println("Can't purchase alcohol");
			}
		}
	}
	
	public void printShirtSize(char shirt)
	{
	       String msg= " " ;
	       switch(shirt)
	       {
	               case 's':
	                      msg= "Shirt is small";
	                      break;
	                case 'm':
	                      msg= "Shirt is medium";
	                      break;
	                case 'l':
	                      msg= "Shirt is large";
	                      break;
	                 case 'x':
	                      msg= "Shirt is Xtra large";
	                      break;
	                 default:
	                      msg= "Unknown shirt size";
	                      break;
	       }
	       System.out.println(msg);
	}
}
