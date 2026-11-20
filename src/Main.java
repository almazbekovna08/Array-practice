//// Task 1. Count Positive, Negative, and Zero Values
//public class Main {
//    public static void main(String[] args) {
//
//        int[] numbers = {4, 7, 5, -6, 7, 0, 3, 7, -6, 0};
//
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 0)
//                positive++;
//            else if (numbers[i] < 0)
//                negative++;
//            else
//                zero++;
//        }
//
//        System.out.println("Array: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//
//        System.out.println("\nPositive: " + positive);
//        System.out.println("Negative: " + negative);
//        System.out.println("Zero: " + zero);
//    }
//}
//
//// Task 2. Largest and Smallest Elements
//public class Main {
//    public static void main(String[] args) {
//
//        int[] numbers = {12, 5, 28, 3, 19, 7, 15, 9};
//
//        int max = numbers[0];
//        int min = numbers[0];
//
//        int maxIndex = 0;
//        int minIndex = 0;
//
//        for (int i = 1; i < numbers.length; i++) {
//
//            if (numbers[i] > max) {
//                max = numbers[i];
//                maxIndex = i;
//            }
//
//            if (numbers[i] < min) {
//                min = numbers[i];
//                minIndex = i;
//            }
//        }
//
//        System.out.println("Largest: " + max + " at index " + maxIndex);
//        System.out.println("Smallest: " + min + " at index " + minIndex);
//    }
//}
//
//// Task 3. Numbers Greater Than the Average
//public class Main {
//    public static void main(String[] args) {
//
//        int[] numbers = {88, 33, 66, 77, 99, 12};
//        int sum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//
//        double average = (double) sum / numbers.length;
//
//        int count = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//
//            if (numbers[i] > average) {
//                count++;
//            }
//        }
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Average: " + average);
//        System.out.println("Numbers above average: " + count);
//    }
//}
//
//// Task 4. Print an Array in Reverse Order
//public class Main {
//    public static void main(String[] args) {
//
//        int[] numbers = {6, 8, 2, 56, 8, 9, 8};
//
//        System.out.print("Original: ");
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//
//        System.out.println();
//
//        System.out.print("Reversed: ");
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}

// Task 5. Student Test Scores
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] scores = new int[5]; // пять мест для баллов

        int passed = 0;
        int failed = 0;
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            System.out.print("Enter score " + (i + 1) + ": ");
            int score = input.nextInt();

            while (score < 0 || score > 100) {

                System.out.println("Enter score in range 0-100!");
                System.out.print("Enter score " + (i + 1) + ": ");

                score = input.nextInt();
            }

            scores[i] = score;

            sum = sum + scores[i];

            if (scores[i] >= 60) {
                passed++;
            }
            else {
                failed++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);

        input.close();
    }
}


