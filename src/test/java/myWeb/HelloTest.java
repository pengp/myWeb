/**
 * Project Name:myWeb
 * File Name:HelloTest.java
 * Package Name:myWeb
 * Date:2016年2月16日下午9:56:58
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:HelloTest.java
 * Package Name:myWeb
 * Date:2016年2月16日下午9:56:58
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package myWeb;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shopin.springTest.SayHello;

public class HelloTest {

	@Test
	public void HelloTest(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		SayHello hello = ac.getBean("hello", SayHello.class);
		hello.sayHello();
	}

}

