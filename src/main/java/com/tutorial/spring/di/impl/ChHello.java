package com.tutorial.spring.di.impl;

import java.util.Date;

import com.tutorial.spring.di.HelloWorld;

public class ChHello implements HelloWorld {

	public String msg = null;
	
	public Date date = null;
	
	
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

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String doSalutation() {
		return this.date + " 你好 " + this.msg;
	}

}
