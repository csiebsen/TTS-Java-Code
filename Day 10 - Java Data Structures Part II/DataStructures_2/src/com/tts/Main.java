package com.tts;

public class Main {

	public static void main(String[] args) {
		int size = 8;
		int power = 4;
		int[] returnArray = pow(size, power);
		for (int i = 0; i < size; i++) {
			System.out.println(returnArray[i]);
		}
	}

	public static int[] pow(int size, int power) {
		// method return an array of size with each array index rasied to the value of
		// power
		int[] returnArray = new int[size];

		for (int i = 0; i < size; i++) {
			returnArray[i] = (int)(Math.pow(i, power));
		}
		return returnArray;
	}
}
