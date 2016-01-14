package com.mwb.structure.proxy.dynamicProxy;

/**
 * 模拟动态生成的代理的结构
 *  如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：

 1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。

 2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。

 使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 *
 */
public class ProxyStar implements Star {
	
	StarHandler handler;
	
	public ProxyStar(StarHandler handler) {
		super();
		this.handler = handler;
	}

	public void bookTicket() {
//		handler.invoke(this,当前方法 , args);
	}

	public void collectMoney() {
//		handler.invoke(this,当前方法 , args);
	}

	public void confer() {
//		handler.invoke(this,当前方法 , args);
	}

	public void signContract() {
//		handler.invoke(this,当前方法 , args);
	}

	public void sing() {
//		handler.invoke(this,当前方法 , args);
	}

}
