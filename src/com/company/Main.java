package com.company;

public class Main {

    public static void main(String[] args) {
        Family family = new Family();
        Man man = new Man("Petr", 45, "Father");
        family.addMember(man);
        Woman woman = new Woman("Lucie", 49, "Mather");
        family.addMember(woman);
        Man son = new Man("Pepa", 15, "Son");
        family.addMember(son);
        family.showAllMembers();
        family.freeTime();
    }
}
