/**
 * Project Name:myWeb
 * File Name:StringBeanFactory.java
 * Package Name:com.shopin.springTest
 * Date:2016年2月26日下午3:22:13
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:StringBeanFactory.java
 * Package Name:com.shopin.springTest
 * Date:2016年2月26日下午3:22:13
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.springTest2;

public class StringBeanFactory {

	
	public  static SayHello newInstance(String message){
		return new SayHelloImpl(message);
	}
}

