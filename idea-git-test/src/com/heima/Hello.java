package com.heima;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        int i = 10;
        i += 10;
        System.out.println(i);
        test();
        for (int j = 0; j < 5; j++) {
            test();
        }

        int[] arr = new int[5];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = j;

        }
        String str = Arrays.toString(arr);
        System.out.println(str);
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
