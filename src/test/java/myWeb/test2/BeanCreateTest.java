/**
 * Project Name:myWeb
 * File Name:BeanCreateTest.java
 * Package Name:myWeb.test2
 * Date:2016年3月1日下午2:39:29
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:BeanCreateTest.java
 * Package Name:myWeb.test2
 * Date:2016年3月1日下午2:39:29
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package myWeb.test2;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.shopin.springTest2.SayHello;


@SuppressWarnings("deprecation")
public class BeanCreateTest {
	//默认构造方法实例化bean 
	@Test
	public void test2(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test2/applicationContext-test.xml"));
		SayHello sh = bf.getBean("hello", SayHello.class);
		sh.sayHello();
	}
	
	//带参数构造方法实例化bean
	@Test
	public void testConstructorTest(){
		BeanFactory bf = new ClassPathXmlApplicationContext("test2/applicationContext-test.xml");
		SayHello sh = bf.getBean("hello1", SayHello.class);
		sh.sayHello();
	}
	
	//静态工厂方法实例化bean 
	@Test
	public void testStaticFactoryTest(){
		BeanFactory bf = new ClassPathXmlApplicationContext("test2/applicationContext-test.xml");
		SayHello sh = bf.getBean("hello2", SayHello.class);
		sh.sayHello();
	}

	//实例工厂方法实例化bean 
	@Test
	public void testSampleFactoryTest(){
		BeanFactory bf = new ClassPathXmlApplicationContext("test2/applicationContext-test.xml");
		SayHello sh = bf.getBean("hello3", SayHello.class);
		sh.sayHello();
	}

}

