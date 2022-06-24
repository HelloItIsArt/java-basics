package org.itmo.java.practice4;

public class DivisionBy3And5 {
    int k = 1;
    int k1 = 1;
    int k2 = 15;
    public void divisionBy3And5() {
        System.out.print("Делится на 3:");
        for (int i = 0; i <= 100; i++) {
            int j = 0;
            if ((i / 3) == (j + k)) {
                this.k++;
                System.out.print(" " + i + " ");
            }
        }
        System.out.println();
        System.out.print("Делится на 5:");
        for (int i = 0; i <= 100; i++) {
            int j = 0;
            if ((i / 5) == (j + k1)) {
                this.k1++;
                System.out.print(" " + i + " ");
            }
        }
        System.out.println();
        System.out.print("Делится на 3 и 5:");
        for (int i = 0; i <= 100; i++) {
            int j = 0;
            if (((i / 5) & (i / 3)) == (j + k2)) {
                this.k2 += 15;
                System.out.print(" " + i + " ");
            }
        }
    }
    public static void main(String[] args) {
        DivisionBy3And5 test = new DivisionBy3And5();
        test.divisionBy3And5();
    }
}
