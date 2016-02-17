/**
 * Project Name:myWeb
 * File Name:Log4jTest.java
 * Package Name:com.shopin.domo
 * Date:2015年9月2日下午4:18:45
 * Copyright (c) 2015, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:Log4jTest.java
 * Package Name:com.shopin.domo
 * Date:2015年9月2日下午4:18:45
 * Copyright (c) 2015, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.domo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Log4jTest {

	/**
	 * main:(这里用一句话描述这个方法的作用). <br/>
	 *
	 * @author Administrator
	 * @param args
	 * @since JDK 1.6
	 */
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(Log4jTest.class);
		logger.info("hello {}", new Date());
		
	}
}

