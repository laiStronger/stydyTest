package com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

	/**
	 * ����
	 * �����з���ִ��֮ǰִ��
	 */
	@BeforeClass
	public static void setUp(){
		System.out.println("������ʼ��");
	}
	
	/**
	 * ����1
	 */
	@Test
	public void test1(){
		Integer a = 1;
		Integer b = 2;
		Integer c = a + b;
		System.out.println(c);
		
	}
	
	/**
	 * ����
	 * �����з���ִ��֮ǰִ��
	 */
	@AfterClass
	public static void after(){
		System.out.println("���ٽ���");
	}
	
}
