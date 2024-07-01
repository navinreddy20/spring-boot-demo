package com.telusko.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int age;
    @Autowired
    private Laptop laptop;

    public Alien(){
        System.out.println("alien object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        laptop.compile();
        System.out.println("Building Awesome Project at the age " + age);
    }

}
