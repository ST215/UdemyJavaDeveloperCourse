import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntergers = getIntegers(5);
        for (int i = 0; i < myIntergers.length; i++) {
            System.out.println("Element " + i + " , typed value was " + myIntergers[i]);
        }

        printArray(myIntergers);
        printArray(sortIntergers);
    }

    public static int[] getIntegers(int number) {
        System.out.println(" Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] scannedInts) {
        System.out.println(Arrays.toString(scannedInts));
    }

    public static int[] sortIntergers(int[] arrayToSort) {
        
    }
}
