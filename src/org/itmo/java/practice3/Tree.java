package org.itmo.java.practice3;

public class Tree {
    private Integer age;
    private  boolean isAlive;
    private String treeName;

    public Tree() {
        System.out.println("The empty constructor has worked out.\n");
    }

    public Tree(Integer age, String treeName) {
        this.age = age;
        this.treeName = treeName;
    }

    public Tree(Integer age, boolean isAlive, String treeName) {
        this.age = age;
        this.isAlive = isAlive;
        this.treeName = treeName;
    }

    @Override
    public String toString() {
        return treeName + "{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", treeName='" + treeName + '\'' +
                '}';
    }
}
