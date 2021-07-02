package com.luoyingmm.demo01;

public class Proxy {
    Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent(){
        host.getHome();
        seeHouse();
    }

    public void seeHouse(){
        System.out.println("房东带你看房");
    }

}
