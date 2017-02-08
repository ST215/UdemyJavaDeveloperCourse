package com.stanleygriggs;


public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=6; i!= 6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while (count != 6);
        int evenNumbersFound = 0;
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                evenNumbersFound++;
                continue;

            }
            System.out.println("Even number " + number);
            number++;

            if (evenNumbersFound == 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

}


// Men: BMR = 66 + (6.23 x weight in pounds) + (12.7 x height in inches) - (6.8 x age in years)
