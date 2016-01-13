package com.mwb.structure.adapter;

/**
 * 被适配的类
 * (相当于例子中的，PS/2键盘)
 * @author mwb
 *
 */
public class Adaptee {
	
	public void request(){
		System.out.println("可以完成客户请求的需要的功能！");
	}
}