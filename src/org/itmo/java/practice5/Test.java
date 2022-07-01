package org.itmo.java.practice5;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1234, 2522, 34, 345};
        int min, max;
        min = max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
