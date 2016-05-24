package com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
11111
	/**
	 * 启动
	 * 在所有方法执行之前执行
	 */
	@BeforeClass
	public static void setUp(){
		System.out.println("启动初始化");
	}
	
	/**
	 * 测试1
	 */
	@Test
	public void test1(){
		Integer a = 1;
		Integer b = 2;
		Integer c = a + b;
		System.out.println(c);
		
	}
	
	/**
	 * 启动
	 * 在所有方法执行之前执行
	 */
	@AfterClass
	public static void after(){
		System.out.println("销毁结束");
	}
	
}
