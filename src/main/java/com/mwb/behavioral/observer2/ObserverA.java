package com.mwb.behavioral.observer2;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {

private int stau;
	@Override
	public void update(Observable o, Object arg) {
		stau=((ConcreteSubject)o).getMystatu();
	}

	public int getMyState() {
		return stau;
	}
}
