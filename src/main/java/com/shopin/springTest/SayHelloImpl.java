/**
 * Project Name:myWeb
 * File Name:SayHelloImpl.java
 * Package Name:com.shopin.springTest
 * Date:2016年2月16日下午9:17:20
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:SayHelloImpl.java
 * Package Name:com.shopin.springTest
 * Date:2016年2月16日下午9:17:20
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.springTest;
public class SayHelloImpl implements SayHello {
	private String message;

	
	public SayHelloImpl(String message) {
		super();
		this.message = message;
	}

	
	public SayHelloImpl() {
		this.message = "hello msater!";
	}

	@Override
	public void sayHello() {
		System.out.println(this.message);
	}
}

