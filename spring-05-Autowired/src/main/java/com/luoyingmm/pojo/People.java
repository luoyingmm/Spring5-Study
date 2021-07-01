package com.luoyingmm.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import javax.annotation.Resources;

public class People {
    @Resource
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog22")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }



    public Dog getDog() {
        return dog;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
