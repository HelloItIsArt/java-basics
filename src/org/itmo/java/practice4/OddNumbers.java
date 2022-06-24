package org.itmo.java.practice4;

public class OddNumbers {
    public void checking() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        OddNumbers test = new OddNumbers();
        test.checking();
    }
}
