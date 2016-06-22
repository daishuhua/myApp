package com.tutorial.spring.di.impl;

import com.tutorial.spring.di.HelloWorld;

public class EnHello implements HelloWorld {

	private String msg = null;
	
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String doSalutation() {
		return "Hello " + this.msg;
	}

}
