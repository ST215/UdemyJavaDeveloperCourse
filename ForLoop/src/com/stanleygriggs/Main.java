package com.stanleygriggs;

public class Main {

    public static void main(String[] args) {
	    for (int i = 2; i < 9; i++) {
            System.out.println("10,0000 with a interest rate of " + i + " = " + String.format("%.2f", calculateInterest(10_000D, i)));
        }

        System.out.println("************");

        for (int i = 9; i >= 2; i--) {
            System.out.println("10,0000 with a interest rate of " + i + " = " + String.format("%.2f", calculateInterest(10_000D, i)));
        }

        int primeCount = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i) == true) {
                System.out.println(i + " is Prime" + " Prime Count = " + primeCount);
                primeCount++;
            } else if (primeCount == 3) {
                break;
            }
        }

    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for(int i =2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
