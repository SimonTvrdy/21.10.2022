package com.company;

public class Woman extends Human {


    public Woman(String name, int age, String role) {
        super(name, age, role);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }

    public void doSomething(){
        System.out.println("Zena mluvi");
    }

}
