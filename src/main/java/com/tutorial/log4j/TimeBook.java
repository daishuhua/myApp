package com.tutorial.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TimeBook {

	private Logger logger = Logger.getLogger(this.getClass());
	
	public void doAuditing(String name) {
		logger.log(Level.INFO, name + "开始审核数据......");
		logger.log(Level.INFO, name + "审核数据结束......");
	}
}
