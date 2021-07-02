package com.luoyingmm.demo03;

import com.luoyingmm.demo02.UserService;
import com.luoyingmm.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);

        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.query();

    }
}
