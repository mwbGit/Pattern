package com.mwb.structure.bridge;
/*
10、桥接模式（Bridge）

桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，
 */
public class Client {
	public static void main(String[] args) {
		//销售联想的笔记本电脑
		Computer2  c = new Laptop2(new Lenovo());
		c.sale();
		
		//销售神舟的台式机
		Computer2 c2 = new Desktop2(new Shenzhou());
		c2.sale();
		
		
	}
}
