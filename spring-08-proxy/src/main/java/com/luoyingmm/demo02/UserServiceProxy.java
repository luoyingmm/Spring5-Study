package com.luoyingmm.demo02;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }


    @Override
    public void add() {
        userService.add();
        log("add了");
    }

    @Override
    public void delete() {
        userService.delete();
        log("delete了");
    }

    @Override
    public void update() {
        userService.update();
        log("update了");
    }

    @Override
    public void query() {
        userService.query();
        log("query了");
    }
    public void log(String msg){
        System.out.println(msg);
    }
}
