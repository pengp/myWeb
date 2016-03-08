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

package myWeb.test3;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.shopin.springTest2.SayHello;


@SuppressWarnings("deprecation")
public class BeanInjectionTest {
	//构造方法注入
	@Test
	public void test1(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test2/applicationContext-test1.xml"));
		SayHello sh = bf.getBean("hello1", SayHello.class);
		sh.sayHello();
	}

}

