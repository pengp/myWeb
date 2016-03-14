package myWeb.testAnnotation;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

		@Test
		public void test1(){
			BeanFactory bf  = new ClassPathXmlApplicationContext("testAnnotation/applicationContext-annotation.xml");
		}
	
}

