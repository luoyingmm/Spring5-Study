package com.luoyingmm.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(new UserServiceImpl());
        userServiceProxy.add();
    }
}
