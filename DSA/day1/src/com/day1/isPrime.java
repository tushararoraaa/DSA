package com.day1;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is prime number");
        }else{
            System.out.println("OOPS! Not Prime");
        }
    }
}
