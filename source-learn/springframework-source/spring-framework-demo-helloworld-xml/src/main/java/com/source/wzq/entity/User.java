package com.source.wzq.entity;

/**
 * @author wangzhengqing
 * @Date 2024/6/10 22:09
 * @Description
 */
public class User {
    /**
     * user's name.
     */
    private String name;

    /**
     * user's age.
     */
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
