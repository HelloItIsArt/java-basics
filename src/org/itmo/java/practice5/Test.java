package org.itmo.java.practice5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String st = "fghn";
        Scanner sc = new Scanner(st);
        if (sc.hasNextInt()) {
            System.out.println("вы ввели число");
        }
        else {
            System.out.println(st);
        }
        st = "hniu" + "\u0020" + "gfb";
        System.out.println(st);
    }
}
