package myexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ui {
    public void Menu() {
        System.out.println("Simple algorithms");
        System.out.println("-----------------");
        System.out.println("1. Calculate the factorial of a number\n" +
                "2. Find the maximum value of an integer value\n" +
                "3. Check if a number is prime\n" +
                "4. Calculate the value 1 + ½ + ⅓ + … + 1/n\n" +
                "5. Count the digits of a long number\n" +
                "6. Print the decimal part of a float number\n");

        System.out.println("Exercises on arrays, collections");
        System.out.println("--------------------------------");
        System.out.println("7. Sub list with the prime numbers\n" +
                "8. List without duplicate values\n" +
                "9. Digits of a number in descending order\n" +
                "10. My own version of a stack\n" +
                "11. Reverse a string using a stack\n" +
                "12. Check if a word is symmetric\n");

        System.out.println("String class exercise");
        System.out.println("---------------------");
        System.out.println("13. Generate a Password");

        do {
            getOption();
        } while (wantContinue());
    }

    private void getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number from menu 1-13: ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number < 1 || number > 13) {
            System.out.print("Please enter a valid number: ");
            number = Integer.parseInt(scanner.nextLine());
        }
        selectOption(number);
    }

    private boolean wantContinue() {
        System.out.print("\nDo you want to try another option? (y/Y=yes) ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return response.equals("y") || response.equals("Y");
    }

    private void selectOption(int number) {
        if (number == 1) {
            Algorithms algorithms = new Algorithms();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Give an integer number: ");
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println("Factorial of " + input + " is: " + algorithms.factorial(input));
        } else if (number == 2) {
            Algorithms algorithms = new Algorithms();
            algorithms.findMaxValue();
        } else if (number == 3) {
            Algorithms algorithms = new Algorithms();
            if (algorithms.isPrime())
                System.out.println("The number is Prime");
            else
                System.out.println("The number isn't Prime");
        } else if (number == 4) {
            Algorithms algorithms = new Algorithms();
            algorithms.series();
        } else if (number == 5) {
            Algorithms algorithms = new Algorithms();
            algorithms.digitsCount();
        } else if (number == 6) {
            Algorithms algorithms = new Algorithms();
            algorithms.decimalPart();
        } else if (number == 7) {
            ArrayExercises arrayExercises = new ArrayExercises();
            List<Integer> numbersArr = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 7, 10, 5, 16, 13));
            System.out.println(arrayExercises.listOfPrime(numbersArr));
        } else if (number == 8) {
            ArrayExercises arrayExercises = new ArrayExercises();
            arrayExercises.eliminateDuplicates();
        } else if (number == 9) {
            ArrayExercises arrayExercises = new ArrayExercises();
            arrayExercises.descendingDig();
        } else if (number == 10) {
            ArrayExercises arrayExercises = new ArrayExercises();

        } else if (number == 11) {
            ArrayExercises arrayExercises = new ArrayExercises();
            arrayExercises.reverseStack();
        } else if (number == 12) {
            ArrayExercises arrayExercises = new ArrayExercises();
            if (arrayExercises.isSymmetric())
                System.out.println("The word is symmetric");
            else
                System.out.println("The word isn't symmetric");
        } else if (number == 13) {
            PasswordGenerator passwordGenerator = new PasswordGenerator();
            passwordGenerator.PasswordChecker();
        }
    }
}
