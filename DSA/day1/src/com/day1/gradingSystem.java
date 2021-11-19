package com.day1;

import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        System.out.println("Enter Marks");
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("good");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("good");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("good");
        } else{
            System.out.println("below par");
        }
    }
}
