package com.acme.util;

public class StringUtils {

	public static boolean hasSpecialChars(String inString) {
		char[] inArray = inString.toCharArray();
		String specChars = "~!@#$%^&*()_-+=:;/?<.>,";
		for (char c:inArray) {
			if (specChars.indexOf(c) > 0) return true;
		}
		return false;
	}
}
