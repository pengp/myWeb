package com.shopin.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceImpl implements HelloApi {
	
	private BaseApi baseServiceImpl;

	// Creates a new instance of HelloServiceImpl.

	/**
	 * baseServiceImpl.
	 * @return  the baseServiceImpl
	 */
	public BaseApi getBaseServiceImpl() {
		return baseServiceImpl;
	}

	@Autowired
	public void setBaseServiceImpl(BaseApi baseServiceImpl) {
		this.baseServiceImpl = baseServiceImpl;
	}

	public HelloServiceImpl() {
		
	}

	
	
	@Override
	public void sayHello() {
		this.baseServiceImpl.sayYes();
	}


}

