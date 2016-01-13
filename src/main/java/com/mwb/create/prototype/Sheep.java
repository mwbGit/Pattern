package com.mwb.create.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 原型模式(Prototype)
 * 原型模式虽然是创建型的模式，但是与工程模式没有关系，
 * 从名字即可看出，该模式的思想就是将一个对象作为原型，
 * 对其进行复制、克隆，产生一个和原对象类似的新对象
 */

public class Sheep implements Cloneable,Serializable {
	private String sname;
	private Date birthday;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();  //直接调用object对象的clone()方法！
		return obj;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	public Sheep() {
	}
	
}
