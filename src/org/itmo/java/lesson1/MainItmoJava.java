package org.itmo.java.lesson1;

public class MainItmoJava {
    public static void main(String[] args) {
//        System.out.println(); ctrl + / ,������� ��� ��������
        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 5000000000L; // ����� L ������ ��� ��������� l ������ �� 1
        float f = 12.3f;
        double d = 14.5d; // ����� ��� �������� d, ��� 14 * 1.0

        char c = 'a';
        boolean isTrue = true;

        byte r = (byte)(b + i); // ��������������
//        System.out.println(r); // 88 ������ ��� ������������
        int r1 = b + i;
//        System.out.println(r1); // int > byte ������� ������������ ���

        double i1 = i * 1.0 / 3;
        double i2 = i / 3d;         // ���� �������������� � double
        double i3 = (double)(i / 3);

        System.out.println(i1);

        String string = "Java";
        System.out.println(string);

        if (true){
            //logic
        }

        if (true){
            //logic
        } else {
            //logic
        }

        if (true){
            //logic
        } else if(false){
            //logic
        } else {
            //logic
        }
    }
}
