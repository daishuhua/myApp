package com.tutorial.spring.aop.impl;

import com.tutorial.spring.aop.TimeBookInterface;

public class TimeBook implements TimeBookInterface {

	@Override
	public void doAuditing(String name) {
		// 审核数据的相关程序
		System.out.println("审核数据的相关程序正在运行...");
	}

	@Override
	public void doCheck(String name) {
		System.out.println("财务关联的相关程序正在运行...");
	}
}
