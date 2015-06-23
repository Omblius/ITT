package com.itt.contructorexample;

public class Stuff {
	static int count = 0;
	public Stuff() {
		count += 1;
		System.out.println("Created object number is " + count);
	}
}
