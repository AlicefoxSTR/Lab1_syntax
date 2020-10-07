package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean rez = isPrime(i);
            if (rez){
                System.out.print(i+ " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean r = false;
        if (n==2||n==3||n==5||n==7) {
            r = true;
        }
        else 
        if (n % 2==0||n % 3==0||n % 5==0||n % 7==0){
           r = false;
        }
        else {
            r = true;
        }
          return r;
    }
}
