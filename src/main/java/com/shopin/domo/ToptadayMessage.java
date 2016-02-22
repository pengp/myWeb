/**
 * Project Name:myWeb
 * File Name:ToptadayMessage.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日上午9:42:10
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:ToptadayMessage.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日上午9:42:10
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.domo;

public class ToptadayMessage implements IMessage {
	public void getTodayMes(){
		System.out.println("获取今日头条信息!");
	}

	/**
	 * @see com.shopin.domo.IMessage#getMessage()
	 */
	@Override
	public void getMessage() {
		System.out.println("获取今日头条信息!");
	}
	
	
}

