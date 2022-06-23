package org.itmo.java.practice2;

public class Me {
    String myName = "Artjom";
    Integer myAge = 28;

    Me() {
    }

    Me(String n, Integer a) {
        myName = n;
        myAge = a;
    }

    Me(String n) {
        myName = n;
    }

    Me(Integer a) {
        myAge = a;
    }

    String getName(String myName) {
        return myName;
    }
    String setName(String myName) {
        return myName;
    }
}
