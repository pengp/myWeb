/**
 * Project Name:myWeb
 * File Name:MessageProvider.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日上午9:40:23
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:MessageProvider.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日上午9:40:23
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.domo;


public class MessageProvider {
	private WangyiMessage wangyi;
	private ToptadayMessage topToday;
	
	public MessageProvider(){
		wangyi = new WangyiMessage();
		topToday = new ToptadayMessage();
	}
	
	public void getMessage(){
		this.wangyi.getWangyiMes();
		this.topToday.getTodayMes();
	}
	
}

