package org.h2k.retailmenot.pages;

public class StringEx {

	public static void main(String[] args) {
		
		String s1 ="//input[@id='%NAME%']";
		String s2 = s1.replace("%NAME%", "abc");
		System.out.println(s2);
	}
}
