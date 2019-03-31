package com.heima;

public class Seconde {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i : arr) {
            arr[i] = i;
        }
        System.out.println(arr.toString());
    }
}
