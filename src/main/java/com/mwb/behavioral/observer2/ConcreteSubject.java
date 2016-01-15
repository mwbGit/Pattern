package com.mwb.behavioral.observer2;

import java.util.Observable;

//目标对象
public class ConcreteSubject extends Observable {

private int mystatu;
	public void set(int s){
		mystatu=s;
		this.setChanged();
		this.notifyObservers();
	}

	public int getMystatu() {
		return mystatu;
	}

	public void setMystatu(int mystatu) {
		this.mystatu = mystatu;
	}
}
