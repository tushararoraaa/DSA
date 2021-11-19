package com.day2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int []arr = new int[5];
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i <5 ; i++) {

            System.out.println(arr[i]);
        }
    }
}
