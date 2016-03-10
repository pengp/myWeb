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

import java.util.Iterator;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.shopin.springTest2.SayHello;
import com.shopin.springTest2.SayHelloImpl;
import com.shopin.springTest3.SetTestBean;


@SuppressWarnings("deprecation")
public class BeanInjectionTest {
	//构造方法注入
	@Test
	public void test1(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test2/applicationContext-test1.xml"));
		SayHello sh = bf.getBean("hello2", SayHello.class);
		sh.sayHello();
	}
	
	//注入list
	@Test
	public void test2(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test2/applicationContext-test1.xml"));
		SayHelloImpl si = bf.getBean("hello3", SayHelloImpl.class);
		System.out.println(si.getLists().size());
		System.out.println(si.getLists().get(1));
	}
	
	//注入set集合
	@Test
	public void test3(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test2/applicationContext-test1.xml"));
		SetTestBean stb = bf.getBean("hello4", SetTestBean.class);
		 Iterator<String> it = stb.getValues().iterator();
		 
		 System.out.println(stb.getValues().size());
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
	}
}

