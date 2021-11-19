package com.day2;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int []arr2 = new int[6];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr2[i] = scn.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(arr2[i]);
        }
    }
}
