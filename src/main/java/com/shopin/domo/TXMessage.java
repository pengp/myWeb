/**
 * Project Name:myWeb
 * File Name:TXMessage.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日上午10:12:57
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * Project Name:myWeb
 * File Name:TXMessage.java
 * Package Name:com.shopin.domo
 * Date:2016年2月22日上午10:12:57
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.shopin.domo;

public class TXMessage implements IMessage {
	public void getTeMeaage(){
		System.out.println("get TXMessage!");
	}

	/**
	 * @see com.shopin.domo.IMessage#getMessage()
	 */
	@Override
	public void getMessage() {
		
		System.out.println("get TXMessage!");
		
	}
}

