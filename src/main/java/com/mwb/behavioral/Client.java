package com.mwb.behavioral;

/**
 * Created by mwb on 16-1-13.
 */
public class Client {
    void  test(Target t){
        t.handerreq();
    }
    public static void main(String[] args) {
        Client c=new Client();
        Target t=new Adapter();
        c.test(t);
    }
}
