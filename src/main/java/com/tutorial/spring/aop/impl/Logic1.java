package com.tutorial.spring.aop.impl;

import com.tutorial.spring.aop.LogicInterface;

public class Logic1 implements LogicInterface {

	@Override
	public void doInsert(String name) {
		System.out.println("执行具体负责新增的业务逻辑...");
		for (int i = 0; i < 100000000; i++) {
			
		}
	}

	@Override
	public void doUpdate(String name) {
		System.out.println("执行具体负责修改的业务逻辑...");
		for (int i = 0; i < 200000000; i++) {
			
		}
	}

	@Override
	public void doDelete(String name) {
		System.out.println("执行具体负责删除的业务逻辑...");
		for (int i = 0; i < 300000000; i++) {
			i = i/0;
		}

	}

}
