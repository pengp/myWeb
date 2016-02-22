/**
 * Project Name:myWeb
 * File Name:WangyiMessage.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日上午9:41:43
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:WangyiMessage.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日上午9:41:43
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.domo;

public class WangyiMessage implements IMessage {
	public void getWangyiMes(){
		System.out.println("获取今日头条message!");
	}

	/**
	 * @see com.shopin.domo.IMessage#getMessage()
	 */
	@Override
	public void getMessage() {
		
		System.out.println("获取今日头条message!");
	}
}

