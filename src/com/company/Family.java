package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Family {
    ArrayList<Human> familyMembers = new ArrayList<Human>();

    public void addMember(Human human){
        familyMembers.add(human);
    }

    public void freeTime(){
        for (Human familyMember : familyMembers) {
            familyMember.doSomething();
        }
    }

    public void showAllMembers(){
        for (Human human : familyMembers) {
            System.out.println(human.getRole());
            System.out.println("    " + human.getName()   );
            System.out.println("    " + human.getAge());
        }
    }
}
