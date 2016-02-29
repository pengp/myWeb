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

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.shopin.springTest.SayHello;

public class HelloTest {

	@Test
	public void HelloTest(){
		
		/**
		 * 基本用法
		 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		SayHello hello = ac.getBean("hello", SayHello.class);
		hello.sayHello();
		
		
		
		/**
		 * 编程方式使用
		 
		ClassPathResource res = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
		SayHello hello = (SayHello) factory.getBean("hello");
		hello.sayHello();
		*/
		
//		ApplicationContext ac = new FileSystemXmlApplicationContext();
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testHello(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		/*SayHello sayHello = (SayHello) bf.getBean("bean");
		sayHello.sayHello();*/
		SayHello sf = bf.getBean("bean4",SayHello.class);
		sf.sayHello();
	}
}

