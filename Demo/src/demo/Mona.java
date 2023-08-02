package demo;

import Mathematics.Math;

public class Mona {

    public static String s ="test";
    public  String st ="test";
    public void testNonStaticMethod(String input) {
        System.out.println(input);
        //System.out.println("Hello World");
        System.out.println("I am happy");
        System.out.println(2 + 4);
        Math math = new Math();
    }

    public static void testStaticMethod(String input) {
        System.out.println(input);
        //System.out.println("Hello World");
        System.out.println("I am happy");
        System.out.println(2 + 4);
    }


}
