package com.mwb.behavioral;

/**
 * Created by mwb on 16-1-13.
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void handerreq() {
        super.req();
    }
}
