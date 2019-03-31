package com.heima;

public class Hello {
    public static void main(String[] args) {
        int i = 10;
        i += 10;
        System.out.println(i);
        test();
        System.out.println(11111);
    }

    public static void test() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
