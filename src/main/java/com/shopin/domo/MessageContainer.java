/**
 * Project Name:myWeb
 * File Name:MessageContainer.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日下午4:43:47
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:MessageContainer.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日下午4:43:47
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.domo;

import java.lang.reflect.Constructor;

public class MessageContainer {

	public IMessage getMessageEntity(String entityName){
		 try {
			 Class c = Class.forName(entityName);
			 c.newInstance();
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}  
		
		return null;
	}
	

}

