package org.itmo.java.lesson3;

public class StaticExample {
    public static final String STATIC_CONSTANT = "some constant"; //сразу иниц-руем!
    private static  String staticString;
    private final String nonStaticString;
    protected String protectedString;
    Integer defaultInteger;

    static  {
        System.out.println("==========");
        System.out.println("static block start");
        staticString = "staticString";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("==========");
    }

    {
        System.out.println("==========");
        System.out.println("non-static block start");
        nonStaticString = "non-staticString";
        System.out.println(staticString);
        System.out.println("non-static block end");
        System.out.println("==========");
    }

    public static void printStaticVar() {
        System.out.println(staticString + " in a static method");
//        StaticExample staticExample = new StaticExample();
//        staticExample.printNonStaticMethod();
    }

    public  void  printNonStaticMethod() {
        printStaticVar();
        staticString = "123";
    }
}
