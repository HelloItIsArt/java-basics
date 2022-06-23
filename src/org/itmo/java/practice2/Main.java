package org.itmo.java.practice2;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Artjom", "Kozlov", "Ingineer", 28, false);
        System.out.println(me);
        Person notMe = new Person("Somepers", "Somepersonov", "Some specialist", 30, true);
        System.out.println(notMe);
    }
}
