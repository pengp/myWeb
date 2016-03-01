/**
 * Project Name:myWeb
 * File Name:SampleBeanFactory.java
 * Package Name:com.shopin.springTest2
 * Date:2016年3月1日下午5:03:05
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:SampleBeanFactory.java
 * Package Name:com.shopin.springTest2
 * Date:2016年3月1日下午5:03:05
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.springTest2;

public class SampleBeanFactory {

	public SayHello newInstance(String message){
		return new SayHelloImpl(message);
	}

}

