package com.company;

public class Human {
    String name;
    int age;
    String role;

    public Human(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }

    public void doSomething(){
        System.out.println("Clovek dycha");
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
