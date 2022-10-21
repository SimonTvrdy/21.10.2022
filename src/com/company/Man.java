package com.company;

public class Man extends Human {


    public Man(String name, int age, String role) {
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
        System.out.println("Muz posloucha");
    }

}
