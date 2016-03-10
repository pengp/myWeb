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

package com.shopin.springTest2;

import java.util.List;

public class SayHelloImpl implements SayHello {
	private String message;
	
	private List lists;

	
	public List getLists() {
		return lists;
	}


	public void setLists(List lists) {
		this.lists = lists;
	}


	public void setMessage(String message) {
		this.message = message;
	}


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

